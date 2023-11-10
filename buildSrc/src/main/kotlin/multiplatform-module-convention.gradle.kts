plugins {
    id("com.android.library")
    kotlin("multiplatform")
}

@OptIn(org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class)
kotlin {

    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }

    sourceSets {
        commonMain {
            dependencies {
                //put your multiplatform dependencies here
            }
        }
        commonTest {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

android {
    compileSdk = BuildConstants.Sdk.compile
    defaultConfig {
        minSdk = BuildConstants.Sdk.min
    }
}