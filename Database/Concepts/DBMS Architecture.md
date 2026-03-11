## 1. What is DBMS Architecture?

**Answer:**  
DBMS architecture refers to the **structure and design of how a database system is organized and how users interact with the database**.

---

## 2. What are the main types of DBMS Architecture?

There are **three main types**:

1. **1-Tier Architecture**
    
2. **2-Tier Architecture**
    
3. **3-Tier Architecture**
    

---

## 3. What is 1-Tier Architecture?

- User, application, and database are on the **same system**.
    
- Direct interaction with the database.
    

Example:

- Local database development
    
- Database installed on personal computer
    

Diagram idea:

User  
 |  
Database

---

## 4. What is 2-Tier Architecture?

- **Client application communicates directly with the database server.**
    

Structure:

Client Application  →  Database Server

Example:

- Java application connected to **MySQL using JDBC**
    

---

## 5. What is 3-Tier Architecture?

Most commonly used in **web applications**.

Structure:

Client (Frontend)  
       ↓  
Application Server (Backend / Business Logic)  
       ↓  
Database Server

Example:

- React / Angular → Spring Boot → MySQL
    

Advantages:

- Better security
    
- Scalability
    
- Separation of concerns
    

---

## 6. What is the Three-Schema Architecture in DBMS?

DBMS internally uses **three levels**:

1. **External Level** – User view
    
2. **Conceptual Level** – Logical database structure
    
3. **Internal Level** – Physical storage of data
    

Diagram:

External Level (User View)  
        ↓  
Conceptual Level (Logical Structure)  
        ↓  
Internal Level (Physical Storage)

Purpose:

- **Data abstraction**
    
- **Data independence**