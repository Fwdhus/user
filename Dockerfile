# Use the official OpenJDK base image
FROM adoptopenjdk:11-jre-hotspot

# Set the working directory in the container
WORKDIR /app

# Copy the packaged JAR file into the container
COPY target/aws-test-1.0.0-exec.jar /app/aws-test.jar

# Expose the port that your Spring Boot application will run on
EXPOSE 8080

# Define the command to run your application
CMD ["java", "-jar", "aws-test.jar"]
