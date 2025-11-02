apply(from = rootDir.toPath().resolve("repositories.gradle.kts"))

pluginManagement {
    includeBuild("build-logic")
}

rootProject.name = "LanguageStudy"

include(":app")
include(":core-android:design-system")
include(":sample:common")
include(":sample:design-system-catalog")

include(":config:scripts")
