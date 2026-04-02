plugins {
    id("com.github.ben-manes.versions") version "0.51.0"
    id("org.sonarqube") version "7.2.3.7755"
    application
    checkstyle
}

sonar {
    properties {
        property("sonar.projectKey", "artem90s_java-project-61")
        property("sonar.organization", "artem90s")
    }
}

application {
    mainClass.set("hexlet.code.App")
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}