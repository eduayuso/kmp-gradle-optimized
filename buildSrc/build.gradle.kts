plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(gradleApi())
    implementation("com.android.tools.build:gradle:8.1.2")
    implementation("com.android.tools.build:gradle-api:8.1.2")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.20")
}