plugins {
    kotlin("jvm") version "1.9.21"
}

group = "org.urielserv.test_plugin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly(fileTree("libs") {
        include("*.jar")
    })
}

kotlin {
    jvmToolchain(21)
}