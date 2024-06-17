
# Android Jetpack Navigation Component

This project demonstrates the implementation of the Android Jetpack Navigation Component.

## Getting Started

The Navigation Component in Android provides a robust framework for navigating between destinations within an app. One of its powerful features is the ability to pass data between these destinations, allowing for a more dynamic and interactive user experience.

![image](https://github.com/3mohamed-abdelfattah/Navigation/assets/142848460/c6fd2db1-d296-4a2c-9299-383e905e6262)


### Adding Classpath in a new version of Android Studio.

Add the following classpath in your project-level `build.gradle` file:

```gradle
buildscript {
    dependencies {
        classpath(libs.androidx.navigation.safe.args.gradle.plugin)
    }
}
```
Add the following classpath in your module `build.gradle` file:

```gradle
id("androidx.navigation.safeargs.kotlin")
```

####  Android Developer Guide
[Android developer navigation](https://developer.android.com/guide/navigation)
[Pass data between destinations](https://developer.android.com/guide/navigation/use-graph/pass-data)


### Dependencies

To use the Navigation Component, you need to add the necessary dependencies to your `build.gradle` file:

```gradle
ext {
    nav_version = "2.7.7"
}

dependencies {
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")
}
```

