import com.android.build.gradle.LibraryExtension
import dev.love.winter.convention.configureComposeAndroid
import org.gradle.kotlin.dsl.getByType

configureComposeAndroid(
    commonExtension = extensions.getByType<LibraryExtension>(),
)
