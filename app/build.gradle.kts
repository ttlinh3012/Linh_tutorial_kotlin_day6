plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.tutorial_day6_adapter_collectionview"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.tutorial_day6_adapter_collectionview"
        minSdk = 29
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }

    // Allow references to generated code
    kapt {
        correctErrorTypes = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // Navigation
    val nav_version = "2.7.7"
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")

    val hilt = "2.46"
    implementation("com.google.dagger:hilt-android:$hilt")
    kapt("com.google.dagger:hilt-android-compiler:$hilt")

    // Retrofit - Network
    val network_version = "2.9.0"
    val okeHttp_version = "4.12.0"

    implementation ("com.squareup.retrofit2:retrofit:$network_version")
    implementation ("com.squareup.retrofit2:converter-gson:$network_version")
    implementation ("com.squareup.okhttp3:okhttp:$okeHttp_version")
    implementation ("com.squareup.okhttp3:logging-interceptor:$okeHttp_version")

    // retrofit json
    implementation ("com.squareup.retrofit2:converter-scalars:2.9.0")

    // for adding recyclerview
    implementation ("androidx.recyclerview:recyclerview:1.3.2")

    // for adding cardview
    implementation("androidx.cardview:cardview:1.0.0")
}