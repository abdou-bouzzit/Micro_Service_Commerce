FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/demo*.jar /app.jar
EXPOSE 9004
CMD ["java", "-jar", "app.jar"]