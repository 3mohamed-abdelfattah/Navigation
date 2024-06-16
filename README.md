Android jetpack navigation component

![image](https://github.com/3mohamed-abdelfattah/Navigation/assets/142848460/c6fd2db1-d296-4a2c-9299-383e905e6262)


How to add classpath in new version of Android Studio
build gradle project
buildscript {

    dependencies {

        classpath(libs.androidx.navigation.safe.args.gradle.plugin)

    }
}


build gradle module
    id("androidx.navigation.safeargs.kotlin")


Pass data between destinations
https://developer.android.com/guide/navigation/use-graph/pass-data

https://developer.android.com/guide/navigation

implementation navigation
    // Kotlin
    val nav_version = "2.7.7"

    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")
