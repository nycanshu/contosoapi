# Use an official Java runtime as the base image
FROM eclipse-temurin:17-jdk-alpine

# Set a working directory inside the container
WORKDIR /tmp

# Copy the built JAR file to the container
COPY target/*.jar app.jar

# Expose the port your application runs on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
