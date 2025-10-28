import dev.love.winter.convention.extension.setNamespace

plugins {
    id("winter.android.application")
    id("winter.compose")
    id("winter.detekt")
}

android {
    setNamespace("dscatalog")
    defaultConfig {
        applicationId = "dev.love.winter.dscatalog"
        versionCode = 1
        versionName = "1.0.0"
    }
}

dependencies {
    implementation(projects.sample.common)
    implementation(projects.coreAndroid.designSystem)
}
