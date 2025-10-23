package dev.love.winter.convention

// reference : https://github.com/android/nowinandroid/blob/main/build-logic/convention/src/main/kotlin/com/google/samples/apps/nowinandroid/AndroidCompose.kt

import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import dev.love.winter.convention.extension.api
import dev.love.winter.convention.extension.debugImplementation
import dev.love.winter.convention.extension.implementation
import dev.love.winter.convention.extension.libs
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

internal fun Project.configureComposeAndroid() {
    with(pluginManager) {
        apply("org.jetbrains.kotlin.plugin.compose")
    }

    val extension = extensions.getByType<BaseAppModuleExtension>()

    extension.apply {
        buildFeatures.compose = true
    }

    dependencies {
        val bom = libs.findLibrary("androidX-composeBom").get()
        api(platform(bom))

        implementation(libs.findLibrary("androidX-composeUi"))
        implementation(libs.findLibrary("androidX-composeFoundation"))
        implementation(libs.findLibrary("androidX-composeMaterial3"))
        implementation(libs.findLibrary("androidX-composeRuntime"))
        implementation(libs.findLibrary("androidX-composeToolingPreview"))

        debugImplementation(libs.findLibrary("androidX-composeTooling"))
        debugImplementation(libs.findLibrary("androidX-composeUiTestManifest"))

        "androidTestImplementation"(platform(bom))
        "androidTestImplementation"(libs.findLibrary("androidX-composeUiTest").get())
        "androidTestImplementation"(libs.findLibrary("androidX-composeUiTestJunit4").get())
    }

    tasks.withType<KotlinCompile>().configureEach {
        compilerOptions {
            freeCompilerArgs.addAll(
                listOf(
                    "-opt-in=androidx.compose.material3.ExperimentalMaterial3Api",
                    "-opt-in=androidx.compose.foundation.ExperimentalFoundationApi",
                )
            )
        }
    }
}
