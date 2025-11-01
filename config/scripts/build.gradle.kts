plugins {
    id("winter.kotlin.library")
}

dependencies {
    // Google Sheets API v4
    implementation("com.google.apis:google-api-services-sheets:v4-rev20220927-2.0.0")

    // Google Auth Library for Service Account
    implementation("com.google.auth:google-auth-library-oauth2-http:1.40.0")

    // Required for JSON parsing by Google's libraries
    implementation("com.google.code.gson:gson:2.13.2")

    // HTTP transport for Google API
    implementation("com.google.http-client:google-http-client-jackson2:2.0.2")
}

/**
 * ./gradlew :config:scripts:updateTranslations -Pargs="example"
 * ./gradlew :config:scripts:updateTranslations -Pargs="sample-app"
 * ./gradlew :config:scripts:updateTranslations -Pargs="app"
 */
tasks.register<JavaExec>("updateTranslations") {
    group = "translation"
    description = "Update translations from Google Sheets to Android strings.xml"
    mainClass.set("dev.love.winter.scripts.UpdateTranslationsKt")
    classpath = sourceSets["main"].runtimeClasspath
    workingDir = rootProject.projectDir

    // Pass command line arguments to the script
    val argsProperty = providers.gradleProperty("args")
    if (argsProperty.isPresent) {
        args(argsProperty.get().split(" "))
    }
}
