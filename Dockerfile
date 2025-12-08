FROM maven:3.9.6-eclipse-temurin-21-alpine AS build


WORKDIR /app

COPY . .

RUN mvn clean install -DskipTests=true


FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

EXPOSE 8080
COPY --from=build /app/target/pismo-1.0.jar app.jar

CMD ["java", "-jar", "app.jar"]
