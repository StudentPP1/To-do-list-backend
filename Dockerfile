FROM maven:3-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/To-do-list-backend-0.0.1-SNAPSHOT.jar To-do-list-backend.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "demo.jar"]