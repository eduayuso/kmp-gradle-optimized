pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "KmpGradleOptimized"
":android".let { android ->
    "$android:features".let { features ->
        include("$features:featurea")
        include("$features:featureb")
    }
    include("$android:app")
}
include(":shared")
":shared".let { shared ->
    "$shared:features".let { features ->
        include("$features:featurea")
        include("$features:featureb")
    }
    include("$shared:domain")
}