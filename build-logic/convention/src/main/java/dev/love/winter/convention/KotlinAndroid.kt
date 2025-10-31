package dev.love.winter.convention

import com.android.build.api.dsl.ApplicationExtension
import dev.love.winter.convention.extension.android
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

internal const val COMPILE_SDK = 36
internal const val MIN_SDK = 23
internal const val TARGET_SDK = 36
internal const val JAVA_LANGUAGE_VERSION = 21
internal val JAVA_VERSION = JavaVersion.VERSION_21
internal val JVM_TARGET = JvmTarget.JVM_21

@Suppress("UnstableApiUsage")
internal fun Project.configureApplication() {
    extensions.configure<ApplicationExtension> {
        defaultConfig {
            targetSdk = TARGET_SDK
        }

        androidResources {
            localeFilters += listOf("en", "ko")
        }

        buildTypes {
            debug {
                signingConfig = signingConfigs.getByName("debug")
                applicationIdSuffix = ".debug"
            }

            release {
                proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
                )
            }
        }
    }
}

internal fun Project.configureAndroid() {
    android {
        defaultConfig {
            minSdk = MIN_SDK

            testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
            vectorDrawables.useSupportLibrary = true
        }

        compileSdk {
            version = release(COMPILE_SDK)
        }

        compileOptions {
            sourceCompatibility = JAVA_VERSION
            targetCompatibility = JAVA_VERSION
        }

        packaging {
            resources {
                excludes.add("/META-INF/{AL2.0,LGPL2.1}")
            }
        }

        lint {
            checkOnly.add("Interoperability")
            disable.add("ContentDescription")
            abortOnError = false
        }
    }
}

internal fun Project.configureKotlin() {
    tasks.withType<KotlinCompile>().configureEach {
        compilerOptions {
            // Set JVM target
            jvmTarget.set(JVM_TARGET)

            optIn.addAll(
                "kotlin.RequiresOptIn",
                "kotlinx.coroutines.ExperimentalCoroutinesApi",
                "kotlinx.coroutines.FlowPreview",
            )
        }
    }
}
