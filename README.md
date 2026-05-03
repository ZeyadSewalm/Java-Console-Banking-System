# 🏦 InBank - Java Console Banking System

## 📌 Overview

InBank is a simple console-based banking system built using Java and MySQL.
It allows users to create accounts, log in, check balance, and transfer money securely.

---

## 🚀 Features

* Create a new bank account
* Login with username and password
* View account balance
* Transfer money between accounts
* Basic input validation
* Transaction handling (commit & rollback)

---

## 🛠️ Technologies Used

* Java (JDK 8+)
* JDBC (Java Database Connectivity)
* MySQL Database

---

## ⚙️ Setup Instructions

### 1. Clone the repository

```bash
git clone https://github.com/your-username/inbank.git
cd inbank
```

### 2. Add MySQL Connector

Download and add:

```
mysql-connector-j-8.x.x.jar
```

Or using Maven:

```xml
<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>8.0.31</version>
</dependency>
```

---

### 3. Setup Database

Run this SQL:

```sql
CREATE DATABASE BANK;

USE BANK;

CREATE TABLE customer (
    ac_no INT AUTO_INCREMENT PRIMARY KEY,
    cname VARCHAR(50) UNIQUE,
    balance INT DEFAULT 1000,
    pass_code INT
);
```

---

### 4. Configure Database Connection

Edit:

```
connection.java
```

Update:

```java
String url = "jdbc:mysql://localhost:3306/BANK";
String user = "root";
String pass = "your_password";
```

---

## ▶️ How to Run

Run the main class:

```bash
bank.java
```

---

## 📸 Sample Flow

```
1) Create Account
2) Login
3) Transfer Money
4) View Balance
```

---

## ⚠️ Notes

* This is a beginner-level project for learning purposes
* Passwords are stored as plain text (not secure for production)
* No GUI (Console-based)

---

## 📈 Future Improvements

* Add GUI (JavaFX / Swing)
* Encrypt passwords
* Add transaction history
* REST API version (Spring Boot)

---

## 👨‍💻 Author

Ziad Mohamed

---
