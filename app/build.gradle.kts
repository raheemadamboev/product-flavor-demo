plugins {
    alias(libs.plugins.android)
    alias(libs.plugins.kotlin)
}

android {
    namespace = "xyz.teamgravity.productflavordemo"
    compileSdk = libs.versions.sdk.compile.get().toInt()

    defaultConfig {
        applicationId = "xyz.teamgravity.productflavordemo"
        minSdk = libs.versions.sdk.min.get().toInt()
        targetSdk = libs.versions.sdk.target.get().toInt()
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            isDebuggable = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }

        create("qa") {
            initWith(getByName("debug"))
            applicationIdSuffix = ".qa"
        }
    }

    flavorDimensions += "default"

    productFlavors {
        create("apple") {
            dimension = "default"
            applicationId = "xyz.teamgravity.apple"
        }

        create("peach") {
            dimension = "default"
            applicationId = "xyz.teamgravity.peach"
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = libs.versions.java.target.get()
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    // core
    implementation(libs.core)

    // appcompat
    implementation(libs.appcompat)

    // material
    implementation(libs.material)

    // constraint layout
    implementation(libs.constraintlayout)

    // activity
    implementation(libs.activity)
}