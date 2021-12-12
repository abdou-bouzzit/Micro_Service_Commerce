FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/eureka-server*.jar /app.jar
EXPOSE 9102
CMD ["java", "-jar", "app.jar"]