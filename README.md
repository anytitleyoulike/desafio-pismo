# Pismo Challenge

This repository contains the solution to the Pismo coding challenge. The challenge involves building a simple application that demonstrates proficiency in software development, including coding, testing, and documentation.
## Table of Contents
- [Installation](#installation)
- [Usage](#usage)
- [Features](#features)
- [Technologies Used](#technologies-used)


## Usage
To run the application, follow these steps:
1. Clone repository
2. Navigate to the project directory:
    ```bash
    cd pismo-challenge
    ```
3. Run the docker-compose to start the application and the database:
   ```bash
    docker-compose up -d
    ```
4. To build locally and run unit / E2E tests using Maven:
   ```bash
    mvn clean install
    ```

### API Documentation
To access endpoints please use the following URL:  
[http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

> You can also run the application using your IDE of choice by running the `PismoChallengeApplication` class.


## Technologies Used
- Java 21
- Maven for dependency management
- Docker
- Flyway for database migrations
- Postgres Database
- Spring Boot


## Contact
For any questions or inquiries, please contact my [linkedin](https://linkedin.com/in/marcellocordeiro) 
