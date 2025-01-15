Train Microservices Architecture

This project implements a Spring Boot Microservices Architecture designed for managing train-related services. The system leverages various microservices that communicate through Eureka for service discovery, and it uses MySQL as the database to store and manage data. The microservices are routed through Spring Cloud Gateway, and Spring Cloud Config is used to centralize the configuration management.

Features:

Service Registry using Eureka Server for service discovery.

Communication between Microservices via Feign Client and RestTemplate.

API Gateway for routing microservice calls.

Centralized Configuration using Spring Cloud Config Server.

Database Integration using MySQL.

How to Run the Project :

Step 1: Install and Configure MySQL
Install MySQL on your machine.
Create a database to store the train-related data.

Step 2: Set Up Eureka Server (Service Registry)
Add the Eureka Server dependency to the Spring Boot application.
Enable Eureka Server with the @EnableEurekaServer annotation.
Configure the Eureka server properties in application.yml.

Step 3: Set Up Eureka Clients (Microservices)
Add the Eureka Client dependency to each microservice.
Enable the Eureka Client with @EnableEurekaClient.
Configure each microservice to register with the Eureka Server in application.yml.

Step 4: Implement Communication Between Microservices
Use RestTemplate and Feign Client in your microservices to communicate with each other.
For Feign Client, add the @EnableFeignClients annotation and define the service interface.

Step 5: Set Up Spring Cloud Gateway (API Gateway)
Create a Spring Boot application with Spring Cloud Gateway dependency.
Configure routing for microservices in application.yml, which directs traffic to the appropriate services based on the request paths.

Step 6: Set Up Spring Cloud Config (Centralized Configuration)
Add the Config Server dependency to a Spring Boot application.
Enable Config Server with the @EnableConfigServer annotation.
Create a repository for your configuration files (application-dev.yml, application-prod.yml).
Update the microservices to fetch configuration from the Config Server.

Step 7: Running the Application
Start the Eureka Server, then the microservices.
Once all services are up and running, use Spring Cloud Gateway as the entry point to access the services.
