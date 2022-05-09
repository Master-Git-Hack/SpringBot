FROM gradle:jdk18
# FROM maven:3.8.5-openjdk-18 # for maven
LABEL version="1.0.0"
LABEL description="Backend Server's Image"
LABEL mantenier="Einar Jhordany Serna Valdivia<e.serna.1a.43@gmail.com>"
WORKDIR /usr/src/Backend
COPY . /usr/src/Backend
CMD ["./gradlew", "bootRun"]
# CMD ["./mvnw","spring-boot:run"]