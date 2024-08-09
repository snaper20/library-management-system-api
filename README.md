# library-management-system-api
This is a Library Management API built with Spring Boot,providing CRUD operations for managing book records. The application runs on server port 8185.<br>

Technologies Used:<br>
Spring Boot<br>
Spring Web<br>
Spring JPA<br>
H2 Database<br>
Hibernate<br>

# Getting Started:<br>

# Prerequisites<br>
Java 17 <br>
Maven<br>
Spring Boot 3.3.2<br>

# Installation<br>
Clone the repository:
git clone https://github.com/snaper20/library-management-sytem-api.git<br>
Build and run the application:<br>
mvn clean install<br>
mvn spring-boot:run<br>
H2 Console
# Access the H2 database console at:<br>
http://localhost:8185/h2-console

# API Endpoints:<br>
Add a Book: POST /api/books<br>
Get All Books: GET /api/books<br>
Get a Book: GET /api/books/{id}<br>
Update a Book: PUT /api/books/{id}<br>
Delete a Book: DELETE /api/books/{id}<br>
