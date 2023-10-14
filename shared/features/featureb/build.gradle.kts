plugins {
    id(BuildConstants.Conventions.multiplatformModule)
}

android {
    namespace = BuildConstants.NameSpaces.Shared.featureB
}

kotlin {

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "featureb"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(BuildConstants.Modules.Shared.domain))
            }
        }
    }
}