@file:Suppress("MatchingDeclarationName")

package dev.love.winter.scripts

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport
import com.google.api.client.json.gson.GsonFactory
import com.google.api.services.sheets.v4.Sheets
import com.google.api.services.sheets.v4.SheetsScopes
import com.google.auth.http.HttpCredentialsAdapter
import com.google.auth.oauth2.ServiceAccountCredentials
import java.io.File
import java.io.FileInputStream
import java.io.FileWriter
import java.util.Properties
import kotlin.system.exitProcess

data class ScriptConfig(
    val spreadsheetId: String,
    val sheetName: String,
    val serviceAccountJsonPath: String,
    val appModulePath: String,
)

/**
 * ./gradlew :config:scripts:updateTranslations -Pargs="example"
 * ./gradlew :config:scripts:updateTranslations -Pargs="sample-app"
 * ./gradlew :config:scripts:updateTranslations -Pargs="app"
 */
fun main(args: Array<String>) {
    if (args.isEmpty()) {
        printUsage()
        exitProcess(1)
    }

    val config = loadConfigFromFile(args[0])
    runTranslationUpdate(config)
}

fun loadConfigFromFile(configPathOrAppName: String): ScriptConfig {
    val configFile = if (configPathOrAppName.endsWith(".properties")) {
        File(configPathOrAppName)
    } else {
        File("config/scripts/translations/$configPathOrAppName.properties")
    }

    check(configFile.exists()) {
        "Config file not found: ${configFile.absolutePath}\n" +
            "Available configs: ${File("config/scripts/translations").listFiles()?.joinToString { it.name } ?: "none"}"
    }

    val properties = Properties()
    FileInputStream(configFile).use { properties.load(it) }

    val configDir = configFile.parentFile

    return ScriptConfig(
        spreadsheetId = properties.getProperty("spreadsheet.id") ?: error("Missing required property: spreadsheet.id"),
        sheetName = properties.getProperty("sheet.name") ?: error("Missing required property: sheet.name"),
        serviceAccountJsonPath = resolveFilePath(
            path = properties.getProperty("service.account.json.path") ?: error("Missing required property: service.account.json.path"),
            baseDir = configDir,
        ),
        appModulePath = properties.getProperty("app.module.path")
            ?: error("Missing required property: app.module.path"),
    )
}

fun resolveFilePath(path: String, baseDir: File): String {
    val file = File(path)
    return if (file.isAbsolute) {
        path
    } else {
        File(baseDir, path).absolutePath
    }
}

fun runTranslationUpdate(config: ScriptConfig) {
    try {
        println("Starting translation update...")
        println("  Spreadsheet ID: ${config.spreadsheetId}")
        println("  Sheet Name: ${config.sheetName}")
        println("  App Module: ${config.appModulePath}")

        val translationData = fetchTranslationsFromSheet(config)
        val parsedData = parseTranslationData(translationData)
        saveTranslationsAsXml(parsedData, config.appModulePath)

        println("✓ Translations successfully saved!")
        println("  Languages: ${parsedData.languages.joinToString()}")
        println("  Total keys: ${parsedData.translations.size}")
    } catch (e: Exception) {
        System.err.println("✗ Error occurred: ${e.message}")
        exitProcess(1)
    }
}

fun printUsage() {
    val availableConfigs = File("config/scripts/translations").listFiles()
        ?.filter { it.extension == "properties" }
        ?.map { it.nameWithoutExtension }
        ?: emptyList()

    println(
        """
        Usage: ./gradlew :config:scripts:updateTranslations --args="<appName>"

        Available configurations in translations/:
          ${availableConfigs.joinToString("\n  ") { "- $it" }}

        Examples:
          # Use app config from translations/example.properties
          ./gradlew :config:scripts:updateTranslations --args="example"

          # Use custom config file path
          ./gradlew :config:scripts:updateTranslations --args="path/to/custom.properties"

        To add a new app configuration:
          1. Copy translations/example.properties to translations/your-app.properties
          2. Update the properties file with your app's settings
          3. Run: ./gradlew :config:scripts:updateTranslations --args="your-app"
        """.trimIndent()
    )
}

fun fetchTranslationsFromSheet(config: ScriptConfig): List<List<Any>> {
    val credentials = ServiceAccountCredentials.fromStream(
        FileInputStream(config.serviceAccountJsonPath)
    ).createScoped(listOf(SheetsScopes.SPREADSHEETS_READONLY))

    val httpTransport = GoogleNetHttpTransport.newTrustedTransport()
    val jsonFactory = GsonFactory.getDefaultInstance()

    val sheetsService = Sheets.Builder(
        httpTransport,
        jsonFactory,
        HttpCredentialsAdapter(credentials)
    )
        .setApplicationName("Translation Update Script")
        .build()

    val response = sheetsService.spreadsheets().values()
        .get(config.spreadsheetId, config.sheetName)
        .execute()

    val values = response.getValues() ?: emptyList()
    check(values.isNotEmpty()) { "No data found in sheet: ${config.sheetName}" }

    return values
}

data class TranslationData(
    val languages: List<String>,
    val translations: List<TranslationEntry>,
)

data class TranslationEntry(
    val key: String,
    val values: Map<String, String>,
    val context: String?,
)

fun parseTranslationData(data: List<List<Any>>): TranslationData {
    check(data.isNotEmpty()) { "Translation data is empty" }

    val headers = data[0].map { it.toString() }
    val keyIndex = headers.indexOf("key")
    check(keyIndex >= 0) { "Missing 'key' column in spreadsheet" }

    val contextIndex = headers.indexOf("context").takeIf { it >= 0 }

    val languageColumns = headers.mapIndexedNotNull { index, header ->
        if (header != "key" && header != "context" && header != "screen" && header.length <= 5) {
            index to header
        } else {
            null
        }
    }

    check(languageColumns.isNotEmpty()) { "No language columns found in spreadsheet" }

    val languages = languageColumns.map { it.second }
    val translations = data.drop(1).mapNotNull { row ->
        if (row.size <= keyIndex) return@mapNotNull null

        val key = row[keyIndex].toString().trim()
        if (key.isEmpty()) return@mapNotNull null

        val values = languageColumns.associate { (index, lang) ->
            lang to (row.getOrNull(index)?.toString()?.trim() ?: "")
        }

        val context = contextIndex?.let { row.getOrNull(it)?.toString()?.trim() }

        TranslationEntry(
            key = key,
            values = values,
            context = context,
        )
    }

    return TranslationData(
        languages = languages,
        translations = translations,
    )
}

fun saveTranslationsAsXml(data: TranslationData, appModulePath: String) {
    data.languages.forEach { language ->
        val valuesDir = if (language == "en") {
            File(appModulePath, "src/main/res/values")
        } else {
            File(appModulePath, "src/main/res/values-$language")
        }

        valuesDir.mkdirs()
        val stringsFile = File(valuesDir, "strings.xml")

        FileWriter(stringsFile).use { writer ->
            writer.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n")
            writer.write("<resources>\n")

            data.translations.forEach { entry ->
                val value = entry.values[language] ?: ""
                if (value.isNotEmpty()) {
                    if (!entry.context.isNullOrBlank()) {
                        writer.write("    <!-- ${entry.context} -->\n")
                    }
                    val escapedValue = escapeXml(value)
                    writer.write("    <string name=\"${entry.key}\">$escapedValue</string>\n")
                }
            }

            writer.write("</resources>\n")
        }

        println("  ✓ ${stringsFile.relativeTo(File(appModulePath)).path}")
    }
}

fun escapeXml(text: String): String {
    var result = text
        .replace("&", "&amp;")
        .replace("<", "&lt;")
        .replace(">", "&gt;")
        .replace("\"", "&quot;")
        .replace("'", "\\'")
        .replace("\n", "\\n")

    // Escape @ symbol at the beginning of the string (Android resource reference)
    if (result.startsWith("@")) {
        result = "\\@${result.substring(1)}"
    }

    return result
}
