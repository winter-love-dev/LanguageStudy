package dev.love.winter.convention

import dev.love.winter.convention.extension.implementation
import dev.love.winter.convention.extension.ksp
import dev.love.winter.convention.extension.libs
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureRoomAndroid() {
    with(pluginManager) {
        apply("com.google.devtools.ksp")
    }

    dependencies {
        implementation(libs.findLibrary("androidX-roomRuntime"))
        implementation(libs.findLibrary("androidX-roomKtx"))
        ksp(libs.findLibrary("androidX-roomCompiler"))
        "testImplementation"(libs.findLibrary("androidX-roomTesting").get())
    }
}

