plugins {
  java
  application
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("io.vertx:vertx-core:3.8.4")
}

java {
  sourceCompatibility = JavaVersion.VERSION_1_8
}

application {
  mainClassName = "chapter1.firstapp.VertxEcho"
}

tasks.wrapper {
  gradleVersion = "5.5.1"
}
