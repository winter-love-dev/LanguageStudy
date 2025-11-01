import dev.love.winter.convention.configureAndroid
import dev.love.winter.convention.configureKotlin
import dev.love.winter.convention.extension.implementation
import dev.love.winter.convention.extension.libs

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("winter.detekt")
//    id("org.jetbrains.kotlin.plugin.serialization")
}

configureAndroid()
configureKotlin()

dependencies {
    implementation(libs.findLibrary("kotlin-immutable"))
}
