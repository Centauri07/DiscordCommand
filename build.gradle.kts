plugins {
    kotlin("jvm") version "1.7.10"
    java
    `maven-publish`
}

group = "me.centauri07.dc"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation("net.dv8tion:JDA:5.0.0-alpha.17")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "me.centauri07.dc"
            artifactId = "DiscordCommand"
            version = "1.0-SNAPSHOT"

            from(components["java"])
        }
    }
}