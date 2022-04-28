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
    implementation("javax.persistence:persistence-api:1.0")
    implementation("javax.servlet:jstl:1.2")
    implementation("org.apache.tiles:tiles-jsp:2.2.1")
    implementation("org.hibernate:hibernate-entitymanager:3.4.0.GA")
    implementation("org.slf4j:slf4j-simple:1.5.8")
    implementation("org.springframework:spring-aspects:3.1.4.RELEASE")
    implementation("org.springframework:spring-orm:3.1.4.RELEASE")
    implementation("org.springframework:spring-webmvc:3.1.4.RELEASE")
    implementation("org.springframework.security:spring-security-config:3.1.7.RELEASE")
    implementation("org.springframework.security:spring-security-web:3.1.7.RELEASE")
    implementation("org.postgresql:postgresql:42.3.4")
    testImplementation("org.mockito:mockito-core:4.2.0")
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.6"
    }
}

tasks.test {
    useJUnitPlatform()
}
