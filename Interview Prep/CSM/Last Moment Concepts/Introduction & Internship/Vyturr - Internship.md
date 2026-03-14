# **VYTURR Tech Internship (Sep 2025 – Dec 2025)**

**Role:** Backend Intern  
**Type:** Remote, part-time (4-5 hours per day, unpaid)  
**Company:** Vyturr Tech Innovations Pvt Ltd, Bangalore, Karnataka

**Context:**

- Vyturr Tech is an early-stage startup (11–50 employees) focusing on **AI-driven solutions for logistics and manufacturing**.
    
- During your internship, their product was still in **MVP development**.
    
- Your work mostly involved **building basic CRUD APIs based on specifications provided by the team**.
    
- Daily routine included joining **2-hour calls** for discussions and receiving **API documentation for development tasks**.
    
- Some days had little or no work because the product was still in development.
    

---

# **Key Responsibilities You Can Mention**

Frame them **honestly but professionally**:

1. **API Development**
    
    - Implemented basic RESTful APIs using Spring Boot following provided API specifications.
        
    - Focused on **CRUD operations** to support early MVP modules.
        
2. **Documentation**
    
    - Maintained API documentation using **Swagger/OpenAPI**.
        
    - Ensured that endpoints were **accurately described for internal use**.
        
3. **Unit Testing**
    
    - Assisted with basic unit test cases for the APIs to ensure **foundational code reliability**.
        
4. **Team Collaboration**
    
    - Participated in daily team calls and discussions.
        
    - Coordinated with senior developers to clarify API requirements.
---
## Product Idea
### The Product Idea: What is Vyturr Tech building?

Vyturr Tech focuses on **"AI-driven traceability and warehouse management solutions"** for the manufacturing and logistics sectors.

Essentially, they are building a B2B (Business-to-Business) Enterprise platform. Factories and large warehouses would use this software to track exactly where their materials are, monitor the health of their equipment, and manage the flow of goods from the factory floor to the delivery truck. While the company plans to use AI to predict supply chain issues or automate decisions, your job during the MVP phase was to build the basic data-entry pipelines (the APIs) so the system could actually store this information.
### What is an "Asset" in this context?

In manufacturing and logistics, an **Asset** is any physical, valuable item that the business needs to track, maintain, or monitor.

**Examples of Assets you were writing APIs for:**

- **Logistics:** Delivery trucks, shipping containers, or smart-pallets.
    
- **Warehouse:** Forklifts, automated conveyor belts, or barcode scanners.
    
- **Manufacturing:** Heavy machinery (like a CNC machine or a robotic arm) or large batches of raw materials.
    

**What your API actually did:** When you built the `POST /api/v1/assets` endpoint, you were allowing the frontend dashboard to register a new piece of equipment into the database. The JSON payload you processed probably looked something like this:

JSON

```
{
  "assetName": "Heavy Duty Forklift",
  "assetType": "VEHICLE",
  "locationId": "WAREHOUSE_BLR_01",
  "status": "ACTIVE"
}
```

### What is a "Task" in this context?

A **Task** is a specific operational job that needs to be assigned to a worker or a machine, and tracked from start to completion. Because supply chains rely on strict timing, tracking tasks is crucial.

**Examples of Tasks you were writing APIs for:**

- **Warehouse Operations:** "Pick items for Order #9021," "Move Pallet A to Loading Dock 3," or "Perform quality check on Batch B."
    
- **Maintenance:** "Perform scheduled maintenance on Truck #4" or "Repair conveyor belt motor."
    

**What your API actually did:** When you built the `PATCH /api/v1/tasks/{taskId}/status` endpoint, you were giving the workers on the warehouse floor (likely using a mobile app) a way to update the system. When a worker finished loading a truck, the app would hit your API to change the task status from `"IN_PROGRESS"` to `"COMPLETED"`. This is why your error handling was so important—if your API failed, the warehouse manager wouldn't know the truck was ready to leave.

### How to use this in your interview:

If they ask, _"What was the product?"_

**You can say:** > "Vyturr was building an AI-driven traceability and warehouse management platform for manufacturing companies. The goal of the MVP was to create a centralized system to track physical warehouse assets and operational tasks. My job was to build the foundational CRUD APIs—for example, the endpoints that allowed warehouse managers to register new equipment (like forklifts or delivery vehicles) into the database, and the endpoints that allowed workers to update the status of their daily logistics tasks."

---
## What was your role at Vyturr Tech?
I worked as a Backend Intern. My main responsibility was implementing basic RESTful APIs for their MVP project and maintaining API documentation.
## Can you describe your day-to-day responsibilities?
I attended daily team calls to get API specifications, implemented CRUD operations in Spring Boot, and updated Swagger documentation. Some days I also performed unit testing or reviewed existing API modules.

## Which technologies did you use during your internship?
Primarily Java, Spring Boot, and Swagger. I also used MySQL for simple database tasks and Git for version control.

## What kind of APIs did you implement?
Mostly basic CRUD APIs for MVP modules, following the specifications provided by the team.

## How did you collaborate with the team remotely?
We had daily 2-hour video calls, and I clarified API requirements during these meetings. I also communicated updates through emails and Slack.

## Were you involved in designing the architecture or only implementing APIs?
I only implemented the APIs based on provided specifications. I was not involved in the architecture or product design.

## Did you work on AI or complex features of their product?
No, I did not work on AI or complex business logic. My role was limited to basic backend CRUD operations and maintaining documentation.


---
## Did you write unit tests for your APIs?
Yes, I wrote basic unit tests to ensure the APIs returned correct responses and handled edge cases properly.

## How did you maintain API documentation?
I used Swagger/OpenAPI to document endpoints, request parameters, and response structures so that the team could easily reference them.

## What challenges did you face while working on APIs?
Some APIs had incomplete or evolving specifications. I learned to adapt quickly, ask clarifying questions during calls, and ensure the implemented APIs matched expectations.

## How did you handle days when there was little or no work?
I used that time to review existing APIs, improve documentation, or practice coding to enhance my backend skills.

## Did you collaborate with other interns or only senior developers?
I mostly collaborated with senior developers to clarify requirements and review my work. There were no other interns in backend at the time.

## What did you learn from your internship?
I learned how to implement APIs based on specifications, maintain documentation, work with a remote team..

## Why did you leave the internship early?
The internship was unpaid and required 4–6 hours per day. I decided to focus on paid opportunities that allow me to grow technically while gaining professional experience.

## Did you face any difficulties in working remotely?
The main challenge was coordinating through calls and waiting for API specifications. I managed it by being proactive in asking questions and clarifying tasks during daily meetings.

## How did you manage your time while doing the internship alongside other responsibilities?
I planned tasks ahead, completed assigned APIs first, and used free time to review or practice backend coding.

## How was your experience working with an MVP product that was still under development?
It taught me patience and adaptability, since requirements sometimes changed. I learned to implement APIs accurately even when the product design was evolving.

## Were there any skills you wanted to learn but couldn’t during this internship?
I didn’t get exposure to AI-driven features or complex backend logic, but I focused on building reliable RESTful APIs and documentation.

## What would you have done differently if you continued the internship?
I would have tried to learn more about the AI/ML domain of the product and contribute to more advanced features.

## How did your work at Vyturr differ from your work at ESSPL or your projects?
At ESSPL and in my projects, I designed full features and implemented business logic. At Vyturr, I mainly implemented APIs based on specs for MVP modules.

## Why do you include this internship on your resume?
To show that I worked in a professional remote team environment, implemented RESTful APIs, and maintained documentation—even if the work was basic.

## If you had to implement an API with limited documentation, how would you approach it?
I would first clarify requirements with the team, then implement a basic version following best practices. I’d test thoroughly and update the documentation as I go.

## How would you improve the API development process at an early-stage startup?
I would standardize API specs, maintain up-to-date Swagger documentation, and implement basic unit tests to reduce errors and ensure consistency.

## How did you ensure the code you wrote was reliable and maintainable?
I followed clean code practices, wrote basic unit tests, and updated Swagger documentation so anyone in the team could easily understand and use my APIs.

---
## 1. What kind of project did you work on in this internship?

Answer:

I worked on an early-stage MVP application for AI-driven logistics and manufacturing modules. My primary responsibility was to implement basic backend APIs for the features that were ready to be tested. The project was in its initial development phase, so I mostly focused on creating endpoints according to the provided specifications and ensuring proper API documentation using Swagger.

Tip: Keep this short, then pivot to your strong projects like Farmer Connect if they ask about technical depth.

## 2. Can you give me what complex API you have implemented?

Answer:

During this internship, I mostly implemented basic CRUD APIs rather than complex business logic, as the product was still an MVP. For example, I created endpoints for adding, updating, retrieving, and deleting items or records based on the provided API specifications. I ensured proper responses, validations, and updated documentation for the team.

Tip: Honesty works here. If asked for “complex API,” say you did not implement complex AI-driven APIs but emphasize reliable, well-documented CRUD implementations.

## 3. Can you explain what modules you have worked on, and some developed API details?
> Since Vyturr Tech was building an AI-driven logistics and manufacturing product, the project was still in the **MVP phase**. I wasn’t working on the AI models themselves; my responsibility was to implement the **foundational REST APIs—the plumbing—so the frontend could collect data and persist it in our MySQL database for future use**.
> 
> I mainly worked on **three core MVP modules**: **Asset Management**, **Task/Status Tracking**, and **User Activity Logs**.

---

### **1. Asset Management Module**

**What it did:** This module kept track of logistics or manufacturing assets, like vehicles, machines, or equipment, which were essential for planning and scheduling.

**API Example:**

- `POST /api/v1/assets` – Register a new asset
    
- `GET /api/v1/assets/{id}` – Fetch asset details
    
- `PUT /api/v1/assets/{id}` – Update asset information
    

**Technical Details:**

- I created **DTOs** to capture incoming JSON requests.
    
- Used **Spring Boot validation annotations** like `@NotBlank` and `@NotNull` to prevent invalid data from being persisted.
    
- Mapped DTOs to **JPA entities** and used **Spring Data JPA repositories** to save them to MySQL.
    
- Implemented proper **HTTP responses**: 201 Created when successful, 400 Bad Request for validation failures.
    
- Maintained **Swagger documentation** so the frontend team could consume the APIs confidently.
    

---

### **2. Task/Status Tracking Module**

**What it did:** This module allowed updates on delivery or manufacturing tasks, like tracking the status of a shipment or a production run.

**API Example:**

- `PATCH /api/v1/tasks/{taskId}/status` – Update task status (e.g., IN_PROGRESS, COMPLETED)
    
- `GET /api/v1/tasks/{taskId}` – Retrieve task details
    

**Technical Details:**

- API received **taskId as a path variable** and **new status in JSON body**.
    
- Implemented **error handling**: checked if the task exists before updating.
    
- Custom exceptions were handled via a **global exception handler**, returning 404 Not Found or 400 Bad Request, instead of generic 500 errors.
    
- Ensured **consistent HTTP responses and status codes** across endpoints.
    

---

### **3. User Activity Logs Module**

**What it did:** This module tracked user interactions with the system, such as creating assets or updating tasks. These logs were meant for monitoring and future analytics.

**API Example:**

- `POST /api/v1/logs` – Record a new activity
    
- `GET /api/v1/logs?userId={id}` – Fetch activity logs for a specific user
    

**Technical Details:**

- Captured **user ID, action type, timestamp**, and optional notes in the DTO.
    
- Persisted logs in MySQL using **Spring Data JPA**.
    
- Created **GET filters** to fetch logs by user or date range.
    
- Implemented **error handling** for missing required fields.