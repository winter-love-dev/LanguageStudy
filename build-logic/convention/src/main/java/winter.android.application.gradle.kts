import dev.love.winter.convention.configureAndroid
import dev.love.winter.convention.configureApplication
import dev.love.winter.convention.configureKotlin
import dev.love.winter.convention.extension.implementation
import dev.love.winter.convention.extension.libs
import org.gradle.kotlin.dsl.dependencies

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("winter.detekt")
//    id("org.jetbrains.kotlin.plugin.serialization")
}

configureApplication()
configureAndroid()
configureKotlin()

dependencies {
    implementation(libs.findLibrary("androidX-coreKtx"))
    implementation(libs.findLibrary("androidX-activityKtx"))
    implementation(libs.findLibrary("kotlin-immutable"))
//    "testImplementation"(libs.findLibrary("androidX-testJunit").get())
//    "androidTestImplementation"(libs.findLibrary("androidX-testEspresso").get())
}
