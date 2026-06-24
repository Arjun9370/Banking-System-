# Banking-System-
Java Banking System using JDBC and Multithreading with MySQL database integration


# 🏦 Banking System (Java + JDBC + Multithreading)

##  Overview
This project is a simple Banking System developed using Java.  
It demonstrates core concepts like JDBC (database connectivity), multithreading, and package structuring.

---

##  Features
- Create and manage bank accounts
- Deposit and withdraw money
- Check account details
- Database connectivity using JDBC
- Multithreading for handling multiple transactions

---

##  Technologies Used
- Java
- JDBC
- MySQL
- Multithreading

---

## 📁 Project Structure
com.bank
├── dao # Database operations
├── model # Account class
├── service # Business logic
├── util # DB connection
├── threadHandling # Thread operations

---

## Database Setup

```sql
CREATE DATABASE bankdb;

USE bankdb;

CREATE TABLE account (
    accNo INT(12) PRIMARY KEY,
    name VARCHAR(50),
    balance DOUBLE
);
