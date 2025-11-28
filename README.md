# TP03: Inversion of Control (IoC) and Persistence

## Project Description

**TP03: Inversion of Control (IoC) and Persistence** is a practical lab project focused on implementing the fundamental concepts of **Inversion of Control (IoC)** and **Data Persistence** in a Java web application.

This project uses the **Spring** framework for managing IoC and web controllers (MVC), and **Hibernate** for the persistence layer (ORM). It illustrates the connection between a web application and a relational database (MySQL) for managing simple entities (such as ```Person```).

## Key Concepts and Features

- **Inversion of Control (IoC):** Using the Spring container to manage dependencies and the object lifecycle.
- **Spring MVC:** Implementing a controller (```HomeController```) to handle web requests.
- **Data Persistence (ORM):** Using Hibernate to map Java objects (```Person```) to database tables.
- **Data Access Object (DAO) Layer:** Implementation of a data access layer (```PersonDAO```) for CRUD operations.
- **Configuration:** XML configuration files for Spring (```spring-context.xml```) and Hibernate (```hibernate.cfg.xml```).

## Technologies Used

| **Technology**           | **Version**                   | **Role in the Project**                                    |
|--------------------------|-------------------------------|------------------------------------------------------------|
| **Language**             | Java                          | Primary programming language.                              |
| **Build Tool**           | Maven                         | Dependency and project lifecycle management.               |
| **MVC/IoC Framework**    | Spring WebMVC                 | Web request and Inversion of Control container management. |
| **ORM**                  | Hibernate Core (5.6.15.Final) | Persistence layer for Object-Relational Mapping.           |
| **Database**             | MySQL                         | Relational database used for persistence.                  |
| **DB Connector**         | MySQL Connector/J (8.0.33)    | JDBC driver for connecting to MySQL.                       |
| **Web Server**           | Servlet API (4.0.1)           | Core API for running the web application (WAR deployment). |
| **Frontend**             | JSP                           | Viewing technology for web pages (```index.jsp```, ```home.jsp```).|

## Installation and Execution

### Prerequisites

- JDK (Java Development Kit).
- Apache Maven.
- A Java application server (e.g., Apache Tomcat, WildFly).
- A MySQL database server.

### Steps

1. **Clone the Repository:**
```bash
git clone https://github.com/morning-dark/tp03-ioc.git
cd tp03-ioc
```
2. **Configure the Database:**
- Create a MySQL database.
- Update the ```src/main/resources/hibernate.cfg.xml``` file with your login information (URL, username, password).
3. **Project Construction:** Use Maven to compile the project and generate the WAR file.
4. **Deployment:** Deploy the generated ```.war``` file (usually in the ```target/``` folder) to your application server (e.g., Tomcat).
5. **Access:** Access the application via your server's URL (e.g., ```http://localhost:8080/tp03-ioc/```).

## Project Structure

```bash
tp03-ioc/
├── pom.xml                                         # Maven configuration file
└── src/ 
    ├── main/ 
    │   ├── java/ 
    │   │ ├── org/suptech/dao/PersonDao.java 
    │   │ ├── org/suptech/entities/Person.java 
    │   │ └── org/suptech/web/HomeController.java 
    │   ├── resources/ 
    │   │   └── hibernate.cfg.xml                   # Hibernate configuration 
    │   └── webapp/ 
    │       ├── index.jsp
    │       └── WEB-INF/ 
    │           ├── spring/spring-context.xml       # Spring IoC configuration 
    │           └── web.xml 
    └── test/ 
        └── java/ 
            └── HibernateTest.java
```
