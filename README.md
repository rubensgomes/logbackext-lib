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
./gradlew --info publish
```

```shell
# only Rubens can push new releases.
./gradlew --info release
```

## usage

### ~/.gradle/gradle.properties

- make these system properties to be read from settings.gradle.kts
systemProp.repsyUsername=rubensgomes
systemProp.repsyPassword=<RESTRICTED>

### settings.gradle.kts

```kotlin
dependencyResolutionManagement {
    repositories {
        mavenCentral()

        maven {
            url = uri("https://repo.repsy.io/mvn/rubensgomes/default/")
            credentials {
                username = System.getProperty("repsyUsername")
                password = System.getProperty("repsyPassword")
            }
        }
    }

    versionCatalogs {
        create("ctlg") {
            // gradle-catalog release version is 0.0.36 or greater
            from("com.rubensgomes:gradle-catalog:0.0.36")
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
    implementation(ctlg.bundles.logbackext)
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