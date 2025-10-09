plugins {
    id ("com.github.ben-manes.versions") version "0.53.0"
    id ("org.sonarqube") version "6.3.1.5724"
    application
    checkstyle
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass = "hexlet.code.App"
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

sonar {
    properties {
        property("sonar.projectKey", "Xomyakkk_java-project-61")
        property("sonar.organization", "xomyakkk")
        property("sonar.host.url", "https://sonarcloud.io") // если используете SonarCloud
        property("sonar.login", System.getenv("SONAR_TOKEN"))
    }
}