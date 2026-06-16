#  Employee Management System - Spring Boot Project

---

##  Project Overview

This is a simple Spring Boot REST API project that performs basic Employee Management operations using:

- Spring Boot
- Spring Data JPA
- H2 In-Memory Database
- Postman for API testing

The project demonstrates full CRUD operations.

---

##  Objective

To understand how a backend system works using:

- REST APIs
- Database connection
- Entity mapping
- Repository layer
- Controller layer

---

##  Features

- Add Employee
- View All Employees
- View Employee by ID
- Update Employee
- Delete Employee

---

##  Architecture Flow

Client (Postman)
        ↓
Controller Layer
        ↓
Repository Layer
        ↓
H2 Database

---

##  Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

---

##  API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /employee/save | Create employee |
| GET | /employee/all | Get all employees |
| GET | /employee/{id} | Get employee by ID |
| PUT | /employee/update/{id} | Update employee |
| DELETE | /employee/delete/{id} | Delete employee |

---

##  Testing Tool

- Postman

---

##  Learning Outcome

Students will understand:
- How REST APIs work
- How database integration works
- How CRUD operations are implemented in Spring Boot