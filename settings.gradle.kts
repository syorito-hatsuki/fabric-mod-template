pluginManagement {
    repositories {
        maven("https://maven.fabricmc.net")
        mavenCentral()
        gradlePluginPortal()
    }

    plugins {
        val loomVersion: String by settings
        id("fabric-loom") version loomVersion

        val kotlinVersion: String by System.getProperties()
        kotlin("jvm") version kotlinVersion
        kotlin("plugin.serialization") version kotlinVersion
    }
}