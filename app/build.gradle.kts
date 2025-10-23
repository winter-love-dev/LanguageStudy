plugins {
    id("winter.android.application")
    id("winter.hilt")
    id("winter.room")
    id("winter.compose")
    id("winter.detekt")
}

android {
    namespace = "dev.love.winter.ls"
    defaultConfig {
        applicationId = "dev.love.winter.ls"
        versionCode = 1
        versionName = "1.0.0"
    }
}

ksp {
    arg("room.schemaLocation", "$projectDir/schemas")
    arg("room.incremental", "true")
    arg("room.expandProjection", "true")
}
