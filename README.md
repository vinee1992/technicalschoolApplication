with the help of this application, the agenda is to revise/learn all the spring boot application with handson and enhance this app to leverage in for real time use case.

so today 7 dec 2024, below topic will be discussed.
1. spring boot end to end layered architecture
2. end points
3. bean life cycle

Before Spring Boot:

Used the traditional Spring Framework, utilizing servlets and dispatcher servlets.
Maintaining enterprise applications was tedious and complex.
Applications became huge and bulky, leading to maintenance challenges.
Endpoints and paths were manually mapped in web.xml, which could grow very large and cumbersome.
Developers had to manage all dependencies manually, adding to the complexity.
Required extensive boilerplate code for setting up configuration, including XML-based configurations.
Managed dependencies using tools like Maven or Gradle but lacked integrated dependency management.
Utilized features like Aspect-Oriented Programming (AOP), Inversion of Control (IoC), and Dependency Injection (DI) to manage application components.


**Before Spring Boot:**

Used the traditional Spring Framework, utilizing servlets and dispatcher servlets.
Maintaining enterprise applications was tedious and complex.
Applications became huge and bulky, leading to maintenance challenges.
Endpoints and paths were manually mapped in web.xml, which could grow very large and cumbersome.
Developers had to manage all dependencies manually, adding to the complexity.
Required extensive boilerplate code for setting up configuration, including XML-based configurations.
Managed dependencies using tools like Maven or Gradle but lacked integrated dependency management.
Utilized features like Aspect-Oriented Programming (AOP), Inversion of Control (IoC), and Dependency Injection (DI) to manage application components.


**Introduction of Spring Boot:**
Spring Boot was introduced to address these challenges.
Simplifies dependency management with built-in dependency management features.
Provides auto-configuration, reducing the need for extensive boilerplate code.
Eases the setup and running of applications with minimal configuration.
Enhances maintainability and manageability of enterprise-level applications.
Integrates with various Spring projects like Spring Data, Spring Security, and Spring Batch seamlessly.
Comes with embedded servers like Tomcat, Jetty, and Undertow, eliminating the need for external server deployment.
Supports Spring Boot Starter dependencies, which are pre-configured templates for common use cases.
Includes Spring Boot Actuator for monitoring and managing applications.
Provides production-ready features like health checks, metrics, and externalized configuration.
Simplifies testing with built-in support for unit and integration tests.
Offers flexible configuration options using properties, YAML files, and environment variables.****
Spring Boot was introduced to address these challenges.
Simplifies dependency management with built-in dependency management features.
Provides auto-configuration, reducing the need for extensive boilerplate code.
Eases the setup and running of applications with minimal configuration.
Enhances maintainability and manageability of enterprise-level applications.
Integrates with various Spring projects like Spring Data, Spring Security, and Spring Batch seamlessly.
Comes with embedded servers like Tomcat, Jetty, and Undertow, eliminating the need for external server deployment.
Supports Spring Boot Starter dependencies, which are pre-configured templates for common use cases.
Includes Spring Boot Actuator for monitoring and managing applications.
Provides production-ready features like health checks, metrics, and externalized configuration.
Simplifies testing with built-in support for unit and integration tests.
Offers flexible configuration options using properties, YAML files, and environment variables.


