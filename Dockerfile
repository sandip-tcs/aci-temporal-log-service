FROM openjdk:11
RUN mkdir -p /app/log-service
COPY target/*.jar /app/log-service/app.jar
WORKDIR /app/log-service
CMD ["java", "-Dspring.profiles.active=default", "-jar", "app.jar", "--spring.config.location=/config/"]

