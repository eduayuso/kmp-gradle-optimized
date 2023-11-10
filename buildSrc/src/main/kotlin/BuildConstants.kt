object BuildConstants {

    object Sdk {

        const val min = 28
        const val target = 34
        const val compile = 34
        const val kotlinComposeCompiler = "1.5.4"
    }

    object AndroidApp {

        const val id = "dev.eduayuso.kmpgradleoptimized.android"
        const val versionCode = 1
        const val versionName = "1.0"
    }

    object NameSpaces {

        private const val base = "dev.eduayuso.kmpgradleoptimized"

        object Android {
            const val app = "$base.android.app"
            const val featureA = "$app.features.featurea"
            const val featureB = "$app.features.featureb"
        }

        object Shared {
            const val shared = "$base.shared"
            const val domain = "$shared.domain"
            const val featureA = "$shared.features.featurea"
            const val featureB = "$shared.features.featureb"
        }
    }

    object Conventions {

        const val androidApp = "android-app-convention"
        const val androidLibrary = "android-library-convention"
        const val multiplatformModule = "multiplatform-module-convention"
    }

    object Modules {

        object Shared {
            const val domain = ":shared:domain"
            const val featureA = ":shared:features:featurea"
            const val featureB = ":shared:features:featureb"
        }

        object Android {
            const val app = ":android:app"
            const val featureA = ":android:features:featurea"
            const val featureB = ":android:features:featureb"
        }
    }
}
