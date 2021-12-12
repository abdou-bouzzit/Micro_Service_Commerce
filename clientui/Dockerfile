FROM openjdk:8-jdk-alpine
WORKDIR /app
ARG JAR_FILE=target/*.jar
COPY --from=MAVEN_PACKAGE ${JAR_FILE} app.jar
ENTRYPOINT [ "java", "-jar", "app.jar" ]