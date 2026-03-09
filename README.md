# DevOps Project

![CI](https://github.com/iidasofiah/devops_projekti/actions/workflows/ci.yml/badge.svg)

Simple Spring Boot DevOps project using:

- Java 21
- Maven
- Docker
- Docker Compose
- GitHub Actions (CI/CD)

## Run locally

Build project:

## Run locally

Build project:
mvn package

Run application:
mvn spring-boot:run


Open in browser:
http://localhost:8080/hello

## Run with Docker

Build image:
docker build -t devopsdemo .

Run container:
docker run -p 8080:8080 devopsdemo

## Run with Docker Compose

Start containers:
docker compose up --build

This starts:

- Spring Boot application
- PostgreSQL database

The application will be available at:

http://localhost:8080/hello