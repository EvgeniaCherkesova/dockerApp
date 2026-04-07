FROM maven:3.9.9-eclipse-temurin-21

WORKDIR /app

COPY . .

RUN mvn -DskipTests package

EXPOSE 8080


CMD ["java", "-jar", "target/dockerApp-1.0.0.jar"]