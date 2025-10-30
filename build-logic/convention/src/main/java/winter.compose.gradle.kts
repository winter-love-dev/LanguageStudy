import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import dev.love.winter.convention.configureComposeAndroid
import dev.love.winter.convention.extension.implementation
import dev.love.winter.convention.extension.libs
import org.gradle.kotlin.dsl.getByType

configureComposeAndroid(
    commonExtension = extensions.getByType<BaseAppModuleExtension>(),
)

dependencies {
    implementation(libs.findLibrary("androidX-hiltNavigationCompose"))
    implementation(libs.findLibrary("androidX-activityCompose"))

    implementation(libs.findLibrary("androidx-navigation3Runtime"))
    implementation(libs.findLibrary("androidx-navigation3Ui"))
    implementation(libs.findLibrary("androidx-lifecycleViewmodelNavigation3"))
    implementation(libs.findLibrary("androidx-material3AdaptiveNavigation3"))
}
