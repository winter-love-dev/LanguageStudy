import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import dev.love.winter.convention.configureComposeAndroid
import dev.love.winter.convention.extension.implementation
import dev.love.winter.convention.extension.libs
import org.gradle.kotlin.dsl.getByType

configureComposeAndroid(
    commonExtension = extensions.getByType<BaseAppModuleExtension>(),
)

dependencies {
    implementation(libs.findLibrary("androidX-activityCompose"))
}
