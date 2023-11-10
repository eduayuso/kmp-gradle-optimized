
plugins {
    id(libs.plugins.android.application.get().pluginId) apply false
    id(libs.plugins.android.library.get().pluginId) apply false
    id(libs.plugins.kotlin.android.get().pluginId) apply false
    id(libs.plugins.kotlin.multiplatform.get().pluginId) apply false
    id(libs.plugins.org.jetbrains.kotlin.jvm.get().pluginId) apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
