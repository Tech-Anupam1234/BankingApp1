🏦 Banking Application
![Java](https://img.shields.io/badge-orange Spring Boot lds.io/badge/MySQL-Database-blue GitHub

Banking Application built using Spring Boot.
🏦 Banking Application
A RESTful Banking Application built using Spring Boot that enables users to create and manage bank accounts efficiently.

📌 Project Overview
This project demonstrates the implementation of a Banking Management System using Spring Boot and follows a layered architecture pattern.

Users can:

Create a new account
View account details
Deposit money
Withdraw money
Delete accounts
Handle exceptions properly
🚀 Technologies Used
Java
Spring Boot
Spring Data JPA
Hibernate
MySQL
Maven
Lombok
Git & GitHub
STS (Spring Tool Suite)
Postman
📂 Project Structure
src
│
├── controller
│     └── AccountController
│
├── service
│
├── repository
│     └── AccountRepository
│
├── entity
│     └── Account
│
├── dto
│     └── AccountDto
│
├── mapper
│     └── AccountMapper
│
├── exception
│     ├── AccountException
│     ├── ErrorDetails
│     └── GlobalExceptionHandler
│
└── BankingApp1Application
✨ Features
✅ Account Creation

✅ Account Retrieval

✅ Deposit Amount

✅ Withdraw Amount

✅ Delete Account

✅ Exception Handling

✅ DTO Mapping

✅ REST APIs

🔗 API Endpoints
Create Account
POST /api/accounts
Get Account By Id
GET /api/accounts/{id}
Deposit Amount
PUT /api/accounts/{id}/deposit
Withdraw Amount
PUT /api/accounts/{id}/withdraw
Delete Account
DELETE /api/accounts/{id}
⚙️ Getting Started
Clone Repository
git clone https://github.com/Tech-Anupam1234/BankingApp1.git
Navigate To Project
cd BankingApp1
Build Project
mvn clean install
Run Application
mvn spring-boot:run
🧪 API Testing
Use:

Postman
📖 Concepts Implemented
REST API Development
Spring Boot Architecture
DTO Pattern
Entity Mapping
Exception Handling
Repository Pattern
Git Workflow
👨‍💻 Author
Anupam Yadav

GitHub: https://github.com/Tech-Anupam1234
LinkedIn:https://www.linkedin.com/in/anupam-yadav-7819252a3/

🔮 Future Enhancements
Spring Security
JWT Authentication
Role-Based Access Control
Transaction History
Swagger Documentation
Docker Deployment
