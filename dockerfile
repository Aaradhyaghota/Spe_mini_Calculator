FROM openjdk:17-jdk-slim

// Sets /app as the directory inside the container where the application will run.
WORKDIR /app

// Copies the packaged JAR file from the Maven build (target/) into the container as app.jar.
COPY target/Spe_Mini_Calculator-1.0-SNAPSHOT.jar app.jar

// Runs the JAR file using Java when the container starts.
CMD ["java", "-jar", "app.jar"]