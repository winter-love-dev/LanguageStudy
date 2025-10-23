apply(from = rootDir.toPath().resolve("repositories.gradle.kts"))

pluginManagement {
    includeBuild("build-logic")
}

rootProject.name = "LanguageStudy"

include(":app")
