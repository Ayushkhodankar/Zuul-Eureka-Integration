# Zuul-Eureka-Integration
<br>
<div align="center">
<img src="https://miro.medium.com/max/875/0*VUADDw_M1oTN3eNB.jpg" alt="zuul-eureka"></img>
</div>

## Project Overview
This project demonstrates the integration of Zuul API Gateway within a Spring Cloud environment. Zuul acts as a powerful edge service that provides dynamic routing, monitoring, resiliency, and security for microservices. By leveraging Zuul along with Eureka Service Discovery, this project highlights how to effectively route requests, apply filters, and aggregate responses from multiple microservices.

## Key Features
- **Service Auto-Registration via Eureka:**
  - Services automatically register themselves with the Eureka server, enabling Zuul to dynamically discover and route requests to these services without manual configuration.

- **Service Registration by Address:**
  - Allows the registration of services using specific IP addresses or hostnames, providing flexibility in defining where services are located.

- **Service Registration by Service ID:**
  - Enables the registration and identification of services by their unique service ID, facilitating precise routing and service management.

- **Filters:**
  - **Logging Filters:** Capture and log details of incoming requests and responses for monitoring and debugging purposes.
  - **Authentication Filters:** Implement authentication mechanisms to secure access to your services, ensuring that only authorized users can interact with your APIs.

- **Serving Static Content:**
  - Zuul is configured to serve static content such as HTML, CSS, and JavaScript files, allowing you to host static resources directly through the gateway.

- **Service Response Aggregation:**
  - Aggregates responses from multiple microservices into a single response, simplifying client interactions and reducing the number of requests needed.

## Technology Stack
- **Spring Boot 1.5.3.RELEASE:** 
  - Provides the foundational framework for building and running the application.
  
- **Eureka Service Discovery Client:**
  - Facilitates the registration and discovery of microservices in a distributed environment.

- **Zuul API Gateway:**
  - Serves as the API Gateway, handling routing, filtering, and load balancing for incoming requests.

## Project Structure
- **/src/main/java:** Contains the Java source code for the application, including controllers, filters, and configuration classes.
- **/src/main/resources:** Houses application properties, static content, and other resources required by the application.
- **/src/main/webapp:** Contains static web assets such as HTML, CSS, and JavaScript files.
- **/pom.xml:** The Maven configuration file that manages project dependencies and build settings.

## Contributing
We welcome contributions to enhance the Zuul API Gateway project. Please fork the repository and create a pull request with your proposed changes or improvements.
