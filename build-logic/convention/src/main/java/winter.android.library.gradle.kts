import dev.love.winter.convention.configureAndroid
import dev.love.winter.convention.configureKotlin

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("winter.detekt")
//    id("org.jetbrains.kotlin.plugin.serialization")
}

configureAndroid()
configureKotlin()
