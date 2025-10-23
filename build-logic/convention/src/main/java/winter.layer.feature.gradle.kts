import dev.love.winter.convention.configureAndroid
import dev.love.winter.convention.configureApplication
import dev.love.winter.convention.configureKotlin
import dev.love.winter.convention.extension.implementation
import dev.love.winter.convention.extension.libs

plugins {
    id("com.android.library")
}

configureApplication()
configureAndroid()
configureKotlin()

dependencies {
    implementation(libs.findLibrary("androidX-coreKtx"))
    implementation(libs.findLibrary("androidX-activityKtx"))
    "testImplementation"(libs.findLibrary("androidX-testJunit").get())
    "androidTestImplementation"(libs.findLibrary("androidX-testEspresso").get())
    implementation(libs.findLibrary("androidX-activityCompose"))
}