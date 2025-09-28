# Travel App - Spring Boot Project

## Project Overview

The Travel App is a web-based Java application built with Spring Boot, designed to manage cab bookings and fare calculations for a travel company. It features RESTful microservices, integration with MongoDB, and provides a user-friendly interface powered by HTML and Bootstrap. The application is packaged as an executable JAR for standalone usage.

## Features

- Cab booking with passenger and trip details.
- Fare calculation based on distance and cab type.
- REST API endpoints for service integration.
- Data persistence using MongoDB.
- Unit Testing with JUnit and Mockito.
- Responsive UI with Bootstrap.
- Packaged with Maven for easy build and deployment.

## Prerequisites

Before you begin, ensure the following software is installed on your machine:

- **Java Development Kit (JDK) 17 or higher**  
  Download and install from [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.org/install/).

- **Apache Maven (3.6 or higher recommended)**  
  - Download from [https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi)  
  - Follow official installation guide: [https://maven.apache.org/install.html](https://maven.apache.org/install.html)  
  - Optional: The project includes Maven Wrapper (`mvnw`) which allows Maven to be used without a manual install.

- **MongoDB Database**  
  - Install MongoDB Community Server from [https://www.mongodb.com/try/download/community](https://www.mongodb.com/try/download/community)  
  - Ensure it is running locally or configure connection details in `application.properties`.

- **IDE (Optional but recommended)**  
  - Eclipse IDE with Spring Tools Suite plugin or IntelliJ IDEA Ultimate for easy Spring Boot development.

## Installation and Setup

1. **Clone the repository** or download the source.

2. **Build the project**  
   Using Maven wrapper (recommended):  
   ```
   ./mvnw clean package      # On Unix/macOS  
   mvnw.cmd clean package    # On Windows  
   ```
   This will compile the code, run tests, and package an executable JAR in `target/`.

3. **Run the Application**  
   After successful build, start the app using:  
   ```
   java -jar target/travel-app-0.0.1-SNAPSHOT.jar
   ```
   The app runs an embedded Tomcat server on port 8080 by default.

4. **Access the App**  
   Open a browser and navigate to:  
   ```
   http://localhost:8080/book-cab.html
   ```  
   for booking and  
   ```
   http://localhost:8080/calculate-fare.html
   ```  
   for fare calculation.

## Configuration

- **Database Settings**  
  Configure MongoDB settings and connection URLs in `src/main/resources/application.properties`.

- **Server Port**  
  To change the port, edit `application.properties` with:  
  ```
  server.port=9090
  ```

## Running Tests

- Run unit tests with Maven via:  
  ```
  ./mvnw test
  ```

- Tests utilize JUnit 5 and Mockito frameworks.

## Project Structure

```
src/
 ├── main/
 │    ├── java/                 # Java source files
 │    ├── resources/            # Application resources and properties
 │    └── webapp/               # Static web resources and HTML pages
 └── test/                      # Unit tests
pom.xml                        # Maven build configuration
```

## Dependencies

- Spring Boot Starter Web
- Spring Boot Starter Data MongoDB
- Spring Boot Starter Test (JUnit, Mockito)
- Spring Boot DevTools for development

## Authors

- Developed by Angel Molina

## License

This project is licensed under MIT License - see the LICENSE file.

## Acknowledgments

- Uses Spring Boot Framework  
- Bootstrap for responsive UI components  
- MongoDB for NoSQL data storage
