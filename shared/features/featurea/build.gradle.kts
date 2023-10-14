plugins {
    id(BuildConstants.Conventions.multiplatformModule)
}

android {
    namespace = BuildConstants.NameSpaces.Shared.featureA
}

kotlin {

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "featurea"
        }
    }
}