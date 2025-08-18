# logbackext-lib
A library of common logback utilities and configurations.

## Display Java Tools Installed

```shell
./gradlew -q javaToolchains
```

## Clean, Build, Test, Assemble, Publish, Release

```shell
./gradlew --info clean
```

```shell
./gradlew :lib:spotlessApply
```

```shell
./gradlew --info build
```

```shell
./gradlew --info check
```

```shell
./gradlew --info jar
```

```shell
./gradlew --info assemble
```

```shell
git commit -m "updated gradle-catalog" -a
git push
```

```shell
# only Rubens can releases.
./gradlew --info release
```

```shell
git checkout release
git pull
./gradlew --info publish
git checkout main
```

## usage

### settings.gradle.kts

```kotlin
dependencyResolutionManagement {
    repositories {
        mavenCentral()

        maven {
            url = uri("https://repo.repsy.io/mvn/rubensgomes/default/")
        }
    }

    versionCatalogs {
        create("libs") {
            // ensure you are using the latest version
            from("com.rubensgomes:gradle-catalog:0.0.62")
        }
    }
}
```

### build.gradle.kts

```kotlin

plugins {
    // ...
    id("version-catalog")
    // ...
}

// ...
dependencies {
    implementation(libs.logbackext.lib)
}
// ...
```

### logback.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<configuration>

  <!-- imported from logbackext-lib -->
  <include resource="logback-properties.xml"/>
  <include resource="logback-console-appender.xml"/>

  <root level="INFO">
    <appender-ref ref="CONSOLE"/>
  </root>

  <!-- sample loggers - change accordingly -->
  <logger name="org.springframework.web" level="DEBUG"/>
  <logger name="com.rubensgomes.msfmwk" level="TRACE"/>


</configuration>
```

---
Author:  [Rubens Gomes](https://rubensgomes.com/)
