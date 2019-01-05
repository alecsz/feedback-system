FROM openjdk:8-jdk-alpine
MAINTAINER Constantin Krüger (Constantin.Krueger@badenia.de)
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]