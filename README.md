# Spring Bot boilerplate example

Project made with java 18, spring boot, gradle, and docker.

## Packages

- [Swagger 3]()

## Requirements

- Docker

- Container:

    - Gradle

    - Docker

## Development

current port usage: 8082

### Usage

```bash
sudo chmod +x start.sh
./start.sh
```

### Spring Boot

```bash
./gradlew bootRun
```

### Build & Run

```bash
./gradlew build && java -jar build/libs/[name].jar
```

check start.sh file for more information with Docker file.

## References

- [Spring Boot](https://start.spring.io/)

- [Docker Image](https://hub.docker.com/_/gradle)
