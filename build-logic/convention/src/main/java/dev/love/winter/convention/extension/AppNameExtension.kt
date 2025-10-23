package dev.love.winter.convention.extension

import org.gradle.api.Project

fun Project.setNamespace(name: String) {
    androidExtension.apply {
        namespace = "dev.love.winter.ls.$name"
    }
}
