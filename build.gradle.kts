
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("androidx.navigation.safeargs.kotlin")
}
android {
    namespace = "com.axdev.gamma26pokedex2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.axdev.gamma26pokedex2"
        minSdk = 26
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
    buildFeatures {
        viewBinding = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.activity)
    implementation (libs.androidx.recyclerview.selection)
    implementation(libs.androidx.recyclerview)
    implementation(libs.androidx.constraintlayout)
    implementation (libs.kotlinx.coroutines.android)
    implementation (libs.kotlinx.coroutines.android)
    implementation(libs.androidx.media3.exoplayer)
    implementation(libs.androidx.media3.ui)
    implementation(libs.androidx.media3.common)
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation (libs.converter.gson)
    implementation ("com.github.bumptech.glide:glide:4.12.0")
    implementation(libs.androidx.material3.android)
    annotationProcessor ("com.github.bumptech.glide:compiler:4.12.0")


    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.1")

    implementation("androidx.navigation:navigation-fragment-ktx:2.7.7")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.7")

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.fragment:fragment-ktx:1.6.2")
    implementation("com.google.android.material:material:1.11.0")


    annotationProcessor(libs.compiler)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
