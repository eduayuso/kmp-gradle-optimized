plugins {
    id(BuildConstants.Conventions.androidLibrary)
}

dependencies {

    implementation(project(BuildConstants.Modules.Shared.featureB))

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