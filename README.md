# 🔐 Role-Based Authentication (Spring Boot)

This project demonstrates **role-based authentication and authorization** using Spring Boot and Spring Security.

---

## 🚀 Features
- 🔑 Basic Authentication (HTTP Basic)
- 🛡️ Role-based access using `@PreAuthorize`
- 👥 In-memory user authentication
- 🌐 Secure REST APIs

---

## 🛠️ Tech Stack
- ☕ Java 23
- 🌱 Spring Boot 4
- 🔒 Spring Security
- 📦 Maven

---


## 👤 Users & Roles

| Username | Password | Role  |
|----------|----------|------|
| user     | yash     | USER |
| admin    | admin    | ADMIN |

---

## 🌍 API Endpoints

🟢 Public  
GET /api/about  
- No authentication required  

🔵 User  
GET /api/Bal  
- Requires authentication  
- Role: USER  

🔴 Admin  
GET /api/close  
- Requires authentication  
- Role: ADMIN  

---

## ▶️ How to Run

git clone https://github.com/YOUR_USERNAME/REPO_NAME.git  
cd REPO_NAME  
mvn spring-boot:run  

Open:  
http://localhost:8080/api/about  

---

## 🔑 Authentication

USER  
username: user  
password: yash  

ADMIN  
username: admin  
password: admin  

---

## ⚠️ Important Notes

- ❌ Admin cannot access USER endpoints unless allowed  
- 🛡️ Roles enforced using `@PreAuthorize`  
- 🔐 Passwords encrypted using BCrypt  

---



