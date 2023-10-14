plugins {
    id(BuildConstants.Conventions.multiplatformModule)
}

android {
    namespace = BuildConstants.NameSpaces.Shared.shared
}

kotlin {

    val modules = listOf(
        BuildConstants.Modules.Shared.featureA,
        BuildConstants.Modules.Shared.featureB
    )

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
            modules.forEach { module ->
                export(project(module))
            }
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                modules.forEach { module ->
                    api(project(module))
                }
            }
        }
    }
}