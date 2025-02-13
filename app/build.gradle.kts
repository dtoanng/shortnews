plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    alias(libs.plugins.hilt)
    alias(libs.plugins.ksp)
}

android {
    namespace = "com.samsung.shrc.dtoanng.shortnews"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.samsung.shrc.dtoanng.shortnews"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        buildConfig = true
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    //kotlin-coroutines-flows
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.coroutines.test)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    //compose navigation
    implementation(libs.androidx.navigation.compose)

    //lifecycle
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.lifecycle.runtime.compose)
    implementation(libs.androidx.lifecycle.process)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.compose)
    implementation(libs.androidx.lifecycle.viewmodel.savedstate)

    //jetpack
    implementation(libs.androidx.livedata.ktx)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(libs.androidx.paging.runtime)
    implementation(libs.androidx.preference)
    implementation(libs.androidx.datastore)

    //hilt
    implementation(libs.dagger.hilt)
    ksp(libs.dagger.hilt.compiler)
    ksp(libs.androidx.hilt.compilier)
    implementation(libs.androidx.hilt.compose)

    //square_up
    implementation(libs.retrofit)
    implementation(libs.retrofit.converter.gson)
    implementation(libs.okhttp)
    implementation(libs.okhttp.logging)

    // room
    implementation(libs.room.ktx)
    implementation(libs.room.paging)
    ksp(libs.room.compiler)

    // system ui controller
    implementation(libs.accompanist.systemuicontroller)

    //others
//    implementation(libs.ksp.gradlePlugin)
    implementation(libs.gson)
    implementation(libs.json)
    implementation(libs.coil)
    implementation(libs.extendedIcon)
    implementation(libs.timber)
}