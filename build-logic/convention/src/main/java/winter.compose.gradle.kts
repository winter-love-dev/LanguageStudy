import dev.love.winter.convention.configureComposeAndroid
import dev.love.winter.convention.extension.implementation
import dev.love.winter.convention.extension.libs


configureComposeAndroid()

dependencies {
    implementation(libs.findLibrary("androidX-activityCompose"))
}
