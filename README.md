# Fabrica Backend

## Overview
Fabrica Backend is a Java Spring Boot project designed to serve as the backend for an e-commerce platform. This project aims to provide essential features for managing products, users, and orders.

## Table of Contents
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Contributing](#contributing)

## Features
- User authentication and authorization(future enhancement)
- Product management (CRUD operations)
- Order processing and management
- RESTful API endpoints

## Technologies Used
- Java(jdk 21)
- Spring Boot
- MySQL (8.0)
- Maven (3.9.9)

## Installation and Run
1. Clone the repository:
   into bash:
   `git clone git@github.com:thisisbatra/fabrica-backend.git`
2. Navigate to the directory:
   `cd fabrica-backend`
3. Configure Database settings:
    ->navigate to src/main/resources/application.properties
    ->check the connectivity of your localhost database or look issue #1.
4. Run the project:
  ->open terminal and run `mvn spring-boot:run`
   or
   ->navigate to `src/main/java/com/backend/fabrica/FabricaApplication.java`

## Contributing:
  Contributions are welcome! Please create an issue or submit a pull request for any enhancements or bug fixes.
