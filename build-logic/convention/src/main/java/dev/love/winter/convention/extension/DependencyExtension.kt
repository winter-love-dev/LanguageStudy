package dev.love.winter.convention.extension

import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.CommonExtension
import com.android.build.api.dsl.LibraryExtension
import org.gradle.api.Project
import org.gradle.api.UnknownProjectException
import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.ProjectDependency
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.api.plugins.ExtensionContainer
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.project
import java.util.Optional

fun DependencyHandlerScope.implementations(vararg deps: Any) {
    deps.forEach { "implementation"(it) }
}

@Suppress("DEPRECATION")
fun DependencyHandlerScope.implementationsAbsPattern(
    vararg depsRoot: ProjectDependency,
    subModules: List<String> = listOf("api", "impl")
) {
    depsRoot.forEach { dep ->
        val projectPath = dep.dependencyProject.path
        subModules.forEach { subModule ->
            val subProjectPath = "$projectPath:$subModule"
            try {
//                "runtimeOnly"(project(subProjectPath))
                "implementation"(project(subProjectPath))
            } catch (e: UnknownProjectException) {
                println("project $subProjectPath does not exist.")
            }
        }
    }
}

typealias AndroidExtension = CommonExtension<*, *, *, *, *, *>

internal fun <T : Any> DependencyHandler.implementation(
    dependencyNotation: Optional<Provider<T>>
): Dependency? = add("implementation", dependencyNotation.get())

internal fun <T : Any> DependencyHandler.debugImplementation(
    dependencyNotation: Optional<Provider<T>>
): Dependency? = add("debugImplementation", dependencyNotation.get())

internal fun <T : Any> DependencyHandler.ksp(
    dependencyNotation: Optional<Provider<T>>
): Dependency? = add("ksp", dependencyNotation.get())

internal fun <T : Any> DependencyHandler.api(
    dependencyNotation: Provider<T>
): Dependency? = add("api", dependencyNotation)

internal val Project.applicationExtension: CommonExtension<*, *, *, *, *, *>
    get() = extensions.getByType<ApplicationExtension>()

internal val Project.libraryExtension: CommonExtension<*, *, *, *, *, *>
    get() = extensions.getByType<LibraryExtension>()

internal val Project.androidExtension: AndroidExtension
    get() = extensions.getByType(CommonExtension::class.java)

internal val Project.libs
    get(): VersionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")

internal val ExtensionContainer.libs: VersionCatalog
    get() = getByType<VersionCatalogsExtension>().named("libs")

internal val ExtensionContainer.libsCommon: VersionCatalog
    get() = getByType<VersionCatalogsExtension>().named("libsCommon")

internal fun Project.android(block: AndroidExtension.() -> Unit) {
    androidExtension.block()
}
