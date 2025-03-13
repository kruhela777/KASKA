plugins {
    alias(libs.plugins.android.application)
    id("com.google.gms.google-services") // ✅ Apply Google Services Plugin
}

android {
    namespace = "com.cscorner.kaska"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.cscorner.kaska"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    // ✅ Core Android Dependencies
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)

    // ✅ Testing Dependencies
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // ✅ Google Sign-In
    implementation("com.google.android.gms:play-services-auth:20.7.0")

    // ✅ Firebase Authentication
    implementation("com.google.firebase:firebase-auth:22.2.0")

    // ✅ Glide (For Image Loading & Caching)
    implementation("com.github.bumptech.glide:glide:4.12.0")
    annotationProcessor("com.github.bumptech.glide:compiler:4.12.0")
}
