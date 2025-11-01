import dev.love.winter.convention.extension.setNamespace

plugins {
    id("winter.android.library")
}

android {
    setNamespace("sample.common")
}

dependencies {
    implementation(libs.material)
}