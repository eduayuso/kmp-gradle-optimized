plugins {
    id(BuildConstants.Conventions.androidLibrary)
}

android {
    namespace = BuildConstants.NameSpaces.Android.featureA
}

dependencies {

    implementation(project(BuildConstants.Modules.Shared.featureA))

    libs {
        listOf(
            ui,
            ui.tooling,
            ui.tooling.preview,
            foundation,
            material,
        ).forEach { dep ->
            implementation(dep)
        }
    }
}