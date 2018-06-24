# Base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Maintainer Info
LABEL maintainer="xkapil@gmail.com"

# Volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file
ARG JAR_FILE=target/spring-boot-docker-0.0.1-SNAPSHOT.jar

# Application's jar to the container
ADD ${JAR_FILE} spring-boot-docker.jar

# Run the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring-boot-docker.jar"]