import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.spring") version "1.6.21"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("reflect"))
    implementation("org.springframework:spring-context:3.0.7")
    implementation("org.springframework:spring-aop:3.0.7")
    implementation("org.springframework:spring-aspects:3.0.7")

    testImplementation("org.mockito:mockito-core:4.2.0")
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
}

application {
    mainClass.set("com.springinaction.springidol.SpringIdolMainKt")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}

tasks.test {
    useJUnitPlatform()
}
