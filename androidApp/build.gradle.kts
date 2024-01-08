plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.jetbrainsCompose)
}

kotlin {

    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "17"
            }
        }
    }

    sourceSets {
        val androidMain by getting {
            dependencies {
                implementation(projects.shared)
                implementation(libs.androidx.appcompat)
                implementation(libs.androidx.activity.compose)
            }
        }
    }
}

android {
    namespace = "com.example.odysseynavigationsample.android"
    sourceSets["main"].manifest.srcFile("src/main/AndroidManifest.xml")
    compileSdk = 34
    defaultConfig {
        applicationId = "com.example.odysseynavigationsample.android"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlin {
        jvmToolchain {
            languageVersion.set(JavaLanguageVersion.of("17"))
        }
    }
}