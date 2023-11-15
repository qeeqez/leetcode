plugins {
    java
}

group = "com.qeeqez"
version = "1.0-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.1")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
