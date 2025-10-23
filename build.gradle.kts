plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.kotlinAndroid) apply false
    alias(libs.plugins.kotlinJvm) apply false
    alias(libs.plugins.kotlinSerialization) apply false
    alias(libs.plugins.composeCompiler) apply false
    alias(libs.plugins.hilt) apply false
    alias(libs.plugins.ksp) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.detekt)
}

apply(from = "${rootDir}/gradle/jetifier_disable.gradle.kts")
apply(from = "${rootDir}/gradle/projectInverseDependencyGraph.gradle")

tasks.register("clean", Delete::class) {
    delete(rootProject.layout.buildDirectory)
}
