plugins {
    id(BuildConstants.Conventions.androidApp)
}

android {
    namespace = BuildConstants.NameSpaces.Android.app
}

dependencies {
    listOf(
        BuildConstants.Modules.Android.featureA,
        BuildConstants.Modules.Android.featureB
    ).forEach { module ->
        implementation(project(module))
    }
    libs {
        listOf(
            ui,
            ui.tooling,
            ui.tooling.preview,
            foundation,
            material,
            activity.compose,
            navigation.compose
        ).forEach { dep ->
            implementation(dep)
        }
    }
}