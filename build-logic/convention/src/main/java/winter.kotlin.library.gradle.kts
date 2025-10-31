import dev.love.winter.convention.JAVA_LANGUAGE_VERSION
import dev.love.winter.convention.JAVA_VERSION
import dev.love.winter.convention.configureKotlin
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension

plugins {
    kotlin("jvm")
    id("java-library")
    id("winter.detekt")
}

configureKotlin()

extensions.configure<JavaPluginExtension> {
    sourceCompatibility = JAVA_VERSION
    targetCompatibility = JAVA_VERSION
}

extensions.configure<KotlinJvmProjectExtension> {
    jvmToolchain {
        languageVersion.set(
            JavaLanguageVersion.of(JAVA_LANGUAGE_VERSION)
        )
    }
}
