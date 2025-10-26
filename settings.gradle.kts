apply(from = rootDir.toPath().resolve("repositories.gradle.kts"))

pluginManagement {
    includeBuild("build-logic")
}

rootProject.name = "LanguageStudy"

include(":app")
include(":core-android")
include(":core-android:design-system")
