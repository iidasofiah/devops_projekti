# DevOps Project

![CI](https://github.com/iidasofiah/devops_projekti/actions/workflows/ci.yml/badge.svg)

Simple Spring Boot DevOps project demonstrating:

- Spring Boot REST API
- PostgreSQL database
- Docker containerization
- Docker Compose multi-container setup
- GitHub Actions CI/CD pipeline
- Environment specific Spring profiles

---

# Technologies

- Java 21
- Spring Boot
- Maven
- PostgreSQL
- Docker
- Docker Compose
- GitHub Actions

---

# Spring Profiles

The project uses three Spring profiles.

## dev
Local development environment.

Uses PostgreSQL running locally.

Configuration file: application-dev.yml

---

## test

Used in automated tests.

Uses in-memory H2 database.

Tests activate this profile using: @ActiveProfiles("test")

---

## prod

Used when running inside Docker containers.

Connects to PostgreSQL container defined in docker-compose.

The profile can be activated with: SPRING_PROFILES_ACTIVE=prod


---

# API Endpoints

## Get all quotes

GET/quotes


Example response

```json
[
  {
    "id": 1,
    "text": "Hello database"
  }
]

---

Create quote

POST /quotes

Example request

{
  "text": "Hello database"
}

---

Run locally

Build the project: 
mvn clean package

Run the application:
mvn spring-boot:run

Open browser:
http://localhost:8080/quotes

---

Run with Docker

Build Docker image:
docker build -t devopsdemo .

Run container: 
docker run -p 8080:8080 devopsdemo

---

Run with Docker Compose

Start application and database: 
docker compose up --build

This starts two containers:
    - Spring Boot application
    - PostgreSQL database

Application available at: 
http://localhost:8080/quotes

---

Continuous Integration

The project uses GitHub Actions

Workflow files:
.github/workflows/ci.yml
.github/workflows/docker.yml

CI pipeline performs:
    - Build with Maven
    - Run unit tests using the test profile
    - Build Docker image
    - Push image to Docker Hub