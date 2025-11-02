import dev.love.winter.convention.extension.setNamespace

plugins {
    id("winter.android.library")
    id("winter.compose.library")
}

android {
    setNamespace("uicomponent")
}

dependencies {
    implementation(projects.coreAndroid.designSystem)
}