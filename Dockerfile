FROM gradle:9.2-jdk17-alpine AS build
WORKDIR /app

COPY build.gradle settings.gradle ./
COPY src ./src

RUN gradle bootJar -x test

FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar

RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]