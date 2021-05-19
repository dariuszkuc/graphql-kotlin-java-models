plugins {
    id("org.springframework.boot") version "2.4.5"
    kotlin("jvm") version "1.4.32"
    kotlin("plugin.spring") version "1.4.32"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(group = "com.expediagroup", name = "graphql-kotlin-spring-server", version = "4.1.1")
    implementation(group = "com.github.spotbugs", name = "spotbugs-annotations", version = "4.2.3")


}

java.sourceCompatibility = JavaVersion.VERSION_11

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}
