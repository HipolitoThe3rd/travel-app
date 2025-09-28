# Travel App - Spring Boot Project

## Overview

Travel App is a web-based application for managing cab bookings and fare calculations for a travel company. Built using Spring Boot, Spring MVC, and MongoDB, it enables users to book cabs, compute fares, and store booking details efficiently with a simple web interface and RESTful services.

## Features

- User-friendly cab booking form with pickup, destination, and cab type options.
- Fare calculation based on selected cab type and trip parameters.
- REST API endpoints for booking management and fare computing.
- MongoDB integration for persistence of bookings and passenger data.
- Unit testing with JUnit and Mockito for controllers and services.
- Packaged as an executable JAR for easy deployment and execution.

## Technology Stack

- Java 17, Spring Boot 3.x, Spring MVC
- MongoDB with Spring Data
- Maven for build and dependency management
- JUnit and Mockito for testing
- HTML, CSS (Bootstrap) for front-end interface

## Getting Started

### Prerequisites

- Java 17 JDK
- Maven
- MongoDB running locally or remotely

### Installation & Build

Clone the repository and navigate to the project directory:

git clone <repository-url>
cd travel-app

text

Build the executable JAR using Maven Wrapper:

mvnw.cmd clean package

text

### Running the Application

Run the packaged JAR:

java -jar target/travel-app-0.0.1-SNAPSHOT.jar

text

Access the UI via [http://localhost:8080](http://localhost:8080) and use the booking and fare calculation pages (replace "8080" with the number of the port that you set in the application.properties file).

## Testing

Run unit tests:

mvnw.cmd test

text

## Project Structure

- `src/main/java`: Java source code including controllers, services, and repositories.
- `src/main/resources`: Configuration files and static resources.
- `target/`: Compiled artifacts and build output.
- `pom.xml`: Maven configuration for dependencies and plugins.

## Contributing

Contributions are welcome! Please fork the project and create a pull request for feature additions or bug fixes.

## License

This project is licensed under the MIT License.
