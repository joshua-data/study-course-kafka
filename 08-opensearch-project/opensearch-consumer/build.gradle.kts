plugins {
    id("java")
}

group = "io.github.joshua-data"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    // https://mvnrepository.com/artifact/org.apache.kafka/kafka-clients
    implementation("org.apache.kafka:kafka-clients:4.0.0")

    // https://mvnrepository.com/artifact/org.slf4j/slf4j-api
    implementation("org.slf4j:slf4j-api:2.0.17")

    // https://mvnrepository.com/artifact/org.slf4j/slf4j-simple
    implementation("org.slf4j:slf4j-simple:2.0.17")

    // https://central.sonatype.com/artifact/org.opensearch.client/opensearch-rest-high-level-client/1.3.2
    implementation("org.opensearch.client:opensearch-rest-high-level-client:1.3.2")

    // https://search.maven.org/artifact/com.google.code.gson/gson/2.9.0/jar
    implementation("com.google.code.gson:gson:2.9.0")

}

tasks.test {
    useJUnitPlatform()
}