import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.spring") version "1.6.21"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("reflect"))
    implementation("javax.servlet:jstl:1.2")
    implementation("org.springframework:spring-aop:3.0.7.RELEASE")
    implementation("org.springframework:spring-aspects:3.0.7.RELEASE")
    implementation("org.springframework:spring-context:3.0.7.RELEASE")
    implementation("org.springframework:spring-webmvc:3.0.7.RELEASE")
    implementation("org.springframework.security:spring-security-config:3.0.8.RELEASE")
    implementation("org.springframework.security:spring-security-web:3.0.8.RELEASE")
    testImplementation("org.mockito:mockito-core:4.2.0")
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
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
