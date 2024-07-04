# Highway Ticket Management System

## Overview

The Highway Ticket Management System is a microservice-based backend application designed to manage highway tickets efficiently. This system aims to streamline the processes of ticket issuance, vehicle registration, user management, and payment processing without relying on external payment gateways. The application leverages Spring Boot and Spring Cloud technologies to ensure scalability, resilience, and seamless integration of services.

## Table of Contents

- [Business Scenario](#business-scenario)
- [Requirements](#requirements)
- [Architecture](#architecture)
- [Microservices](#microservices)
  - [Service Registry and Discovery (Eureka)](#service-registry-and-discovery-eureka)
  - [Configuration Server (Spring Cloud Config)](#configuration-server-spring-cloud-config)
  - [API Gateway (Spring Cloud Gateway)](#api-gateway-spring-cloud-gateway)
  - [Ticket Service](#ticket-service)
  - [Vehicle Service](#vehicle-service)
  - [User Service](#user-service)
  - [Payment Service](#payment-service)
- [Testing](#testing)
- [Setup and Installation](#setup-and-installation)
- [Contributing](#contributing)
- [License](#license)

## Business Scenario

In today's dynamic transportation landscape, managing highway tickets efficiently is crucial for ensuring smooth traffic flow and compliance with regulations. Our objective is to develop a robust microservice-based backend application for a Highway Ticket Management System. This system will streamline the handling of ticket issuance, vehicle registration, user management, and payment processing without relying on external payment gateways.

## Requirements

The assignment requires the implementation of several key components:

- **Service Registry and Discovery**: Utilizing Eureka for dynamic service registration and discovery.
- **Configuration Server**: Implementing a Spring Cloud Config Server for centralized configuration management.
- **API Gateway**: Utilizing Spring Cloud Gateway for efficient routing of client requests to appropriate microservices.
- **Microservices**: Developing individual services including Ticket Service, Vehicle Service, User Service, and Payment Service, each with specific functionalities tailored to the management of ticket data, vehicle information, user profiles, and internal payment transactions.

## Architecture

The architecture of the Highway Ticket Management System consists of multiple microservices, each responsible for a specific domain:

- **Eureka Server**: Service registry and discovery.
- **Config Server**: Centralized configuration management.
- **API Gateway**: Routing of client requests.
- **Microservices**: Ticket Service, Vehicle Service, User Service, and Payment Service.

## Microservices

### Service Registry and Discovery (Eureka)

- **Purpose**: Eureka enables microservices to register themselves and discover other services dynamically.
- **Implementation**: Each microservice registers with Eureka upon startup, facilitating communication without hardcoded dependencies.

### Configuration Server (Spring Cloud Config)

- **Purpose**: Centralize configuration management.
- **Implementation**: Microservices fetch configurations from the Config Server, allowing updates without redeployment.

### API Gateway (Spring Cloud Gateway)

- **Purpose**: Serve as a single-entry point for client requests.
- **Implementation**: Routes requests to appropriate microservices based on URI and HTTP method, leveraging Eureka for dynamic service discovery.

### Ticket Service

- **Business Logic**: Manages ticket lifecycle.
- **Functions**: Creation, status updates, and retrieval of ticket information.

### Vehicle Service

- **Business Logic**: Handles vehicle operations.
- **Functions**: Registration, updates, and retrieval of vehicle details.

### User Service

- **Business Logic**: Manages user and owner information.
- **Functions**: Registration, profile updates, and credential verification.

### Payment Service

- **Business Logic**: Facilitates secure payment processing internally.
- **Functions**: Validate payment details, update ticket statuses upon successful payment confirmation.

## Testing

Comprehensive testing using Postman will be conducted to validate the functionality and reliability of each microservice, ensuring they meet stringent business requirements and provide a seamless user experience.

## Setup and Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/highway-ticket-management-system.git
   ```
2. Navigate to the project directory:
   ```sh
   cd highway-ticket-management-system
   ```
3. Build and run each microservice using Maven:
   ```sh
   mvn clean install
   mvn spring-boot:run
   ```

## License

This project is licensed under the [MIT License](LICENSE).

## Contact

Feel free to reach out to me for any inquiries, collaboration opportunities, or just to say hello! You can contact me via:

* Email : mihisaralokuhewage@gmail.com
* LinkedIn : [https://linkedin.com/in/dewmith-mihisara-67861a202](https://linkedin.com/in/dewmith-mihisara-67861a202)
* Twitter : [https://twitter.com/Zyne_Galata](https://twitter.com/Zyne_Galata)

***
</h5>
<div align="center">
  
![repo size](https://img.shields.io/github/repo-size/DewmithMihisara/highway-management-system?label=Repo%20Size&style=for-the-badge&labelColor=black&color=20bf6b)
![GitHub stars](https://img.shields.io/github/stars/DewmithMihisara/highway-management-system?&labelColor=black&color=f7b731&style=for-the-badge)
![GitHub LastCommit](https://img.shields.io/github/last-commit/DewmithMihisara/highway-management-system?logo=github&labelColor=black&color=d1d8e0&style=for-the-badge)

</div>


