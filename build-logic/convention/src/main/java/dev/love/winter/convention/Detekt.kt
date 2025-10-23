package dev.love.winter.convention

import dev.love.winter.convention.extension.libs
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureDetekt() {
    with(pluginManager) {
        apply("io.gitlab.arturbosch.detekt")
    }

    dependencies {
        "detektPlugins"(libs.findLibrary("detekt-formatting").get())
        "detektPlugins"(libs.findLibrary("detekt-twitterComposeRule").get())
    }
}
