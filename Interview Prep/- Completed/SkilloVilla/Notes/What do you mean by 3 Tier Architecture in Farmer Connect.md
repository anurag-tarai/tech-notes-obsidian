In _Farmer Connect_, I followed a **3-tier architecture**, which means the application is logically divided into **Presentation Layer**, **Application (Business) Layer**, and **Data Layer**.  
Each tier has a clear responsibility, which improves scalability, security, and maintainability.

---
## **1️⃣ Presentation Layer (Client Tier)**

**What it does:**

- Handles **user interaction**
    
- Sends HTTP requests and receives responses
    

**In Farmer Connect:**

- Frontend (Web / Mobile) consumes REST APIs
    
- Communicates with backend using **JSON over HTTP**
    
- No business logic here
    

👉 _Example:_  
Buyer searches nearby farmers → frontend calls  
`GET /api/farmers?radius=10km`

---

## **2️⃣ Application Layer (Business Tier)**

**What it does:**

- Contains **business logic**
    
- Validates requests
    
- Handles authentication & authorization
    

**In Farmer Connect:**

- **Spring Boot backend**
    
- Controllers, Services, Security (JWT)
    
- Implements:
    
    - Radius-based farmer discovery
        
    - Pagination
        
    - Availability checks
        
    - Role-based access (Farmer / Buyer)
        

👉 _Example:_  
Service calculates nearby farmers using location + radius  
before querying the database.

---

## **3️⃣ Data Layer (Persistence Tier)**

**What it does:**

- Stores and retrieves data
    
- No business logic
    

**In Farmer Connect:**

- **MySQL (AWS RDS)** → structured data (users, crops, orders)
    
- **Redis** → caching frequently accessed data
    
- **AWS S3** → crop images & media
    

👉 _Example:_  
Farmer profile → MySQL  
Frequently viewed crop list → Redis cache