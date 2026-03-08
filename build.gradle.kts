plugins {
    java
    id("org.springframework.boot") version "4.0.3"
    id("io.spring.dependency-management") version "1.1.7"
    id("com.diffplug.spotless") version "8.3.0"
    id("checkstyle")
}

group = "com.example"
description = "spring boot app"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
}

spotless {
    java {
        target("src/**/*.java")
        googleJavaFormat()
    }

    kotlinGradle {
        target("**/*.kts")
        ktlint()
    }
}
