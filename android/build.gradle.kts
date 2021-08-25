plugins {
    id("com.android.application")
    kotlin("android")
    id("org.jetbrains.compose")
}

group = "org.bibletools"
version = "1.0"

repositories {
    google()
}

dependencies {
    implementation(project(":common"))
    implementation("androidx.activity:activity-compose:1.3.1")
}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "org.bibletools.android"
        minSdkVersion(24)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}
