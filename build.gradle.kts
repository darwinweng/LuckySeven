// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version libs.versions.android.application.get() apply false
    id("org.jetbrains.kotlin.android") version libs.versions.kotlinGradle.get() apply false
    id("com.google.dagger.hilt.android") version libs.versions.hilt.android.get() apply false
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(libs.hilt.android.gradle.plugin)
        classpath(libs.androidx.navigation.safeargs.plugin)
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    // Enable experimental coroutines APIs, including Flow
    kotlinOptions.freeCompilerArgs += "-opt-in=kotlin.Experimental"
    kotlinOptions.freeCompilerArgs += "-opt-in=kotlin.RequiresOptIn"

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }
}