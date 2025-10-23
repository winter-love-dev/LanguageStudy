package dev.love.winter.convention

import dev.love.winter.convention.extension.implementation
import dev.love.winter.convention.extension.ksp
import dev.love.winter.convention.extension.libs
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureHiltAndroid() {
    with(pluginManager) {
        apply("com.google.devtools.ksp")
        apply("dagger.hilt.android.plugin")
    }

    dependencies {
        implementation(libs.findLibrary("dagger-hiltAndroid"))
        ksp(libs.findLibrary("dagger-hiltCompiler"))
    }
}
