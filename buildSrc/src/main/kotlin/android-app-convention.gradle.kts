plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = BuildConstants.Sdk.compile
    defaultConfig {
        minSdk = BuildConstants.Sdk.min
        targetSdk = BuildConstants.Sdk.target
        applicationId = BuildConstants.AndroidApp.id
        versionCode = BuildConstants.AndroidApp.versionCode
        versionName = BuildConstants.AndroidApp.versionName
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.7"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }
}