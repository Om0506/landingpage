# 🌐 Spring Boot Contact Form with MySQL

A modern full-stack web application built using **Spring Boot**, **Thymeleaf**, and **MySQL**. The application allows users to submit contact details through a responsive landing page, stores the submitted information in a MySQL database using **Spring Data JPA**, and exposes a REST API to retrieve all stored contacts.

## 📌 Features

- Modern responsive landing page
- Contact form with validation
- Spring Boot MVC architecture
- Thymeleaf template engine
- Spring Data JPA integration
- MySQL database connectivity
- Automatic table creation using Hibernate
- REST endpoint to retrieve stored contacts
- Clean layered architecture (Controller → Service → Repository)

---

## 🛠️ Tech Stack

### Frontend
- HTML5
- CSS3
- JavaScript
- Thymeleaf

### Backend
- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate

### Database
- MySQL

### Build Tool
- Maven

---

## 📂 Project Structure

```
landingpage
│
├── controller
│   └── ContactController.java
│
├── service
│   └── ContactService.java
│
├── repository
│   └── ContactRepository.java
│
├── model
│   └── Contact.java
│
├── templates
│   └── index.html
│
├── static
│   ├── css
│   ├── js
│   └── images
│
├── application.properties
│
└── LandingpageApplication.java
```

---

## ⚙️ Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/landingpage.git
```

### 2. Open the Project

Open the project in IntelliJ IDEA or VS Code.

### 3. Create Database

Open MySQL Workbench and execute:

```sql
CREATE DATABASE landingpage_db;
```

### 4. Configure Database

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/landingpage_db
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 5. Run the Application

Run:

```
LandingpageApplication.java
```

or

```bash
mvn spring-boot:run
```

---

## 🚀 Endpoints

### Landing Page

```
GET /
```

Displays the landing page with the contact form.

---

### Submit Contact

```
POST /contact
```

Stores contact details in MySQL.

---

### View All Contacts

```
GET /contacts
```

Returns all stored contacts in JSON format.

Example Response:

```json
[
  {
    "id": 1,
    "name": "Om",
    "email": "om@gmail.com",
    "message": "Hello!"
  }
]
```

---

## 🗄️ Database

Hibernate automatically creates the following table:

```
contacts
```

Fields:

| Column | Type |
|---------|------|
| id | BIGINT |
| name | VARCHAR |
| email | VARCHAR |
| message | TEXT |

---

## 📸 Screenshots

You can add screenshots here:

- Landing Page
- Contact Form
- MySQL Table
- JSON Response

---

## 📚 Concepts Covered

- Spring Boot MVC
- Dependency Injection
- Controller-Service-Repository Pattern
- Bean Validation
- Spring Data JPA
- Hibernate ORM
- MySQL Integration
- REST APIs
- Thymeleaf

---

## 🎯 Learning Outcomes

This project demonstrates how data flows from:

```
Frontend
    ↓
Spring Controller
    ↓
Service Layer
    ↓
Repository
    ↓
MySQL Database
```

It also illustrates how to expose stored data through a RESTful API.

---

## 👨‍💻 Author

**Om**

B.Tech Computer Engineering Student

Aspiring Java Full Stack Developer
