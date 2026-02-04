# 🔹 Level 1 — Core REST + Spring Boot (VERY COMMON)

### 1️⃣ Query Parameter API

👉 Create a GET API that accepts `name` and `age` as query params and returns a greeting.

**Concepts tested:** `@RequestParam`

---

### 2️⃣ Multiple Path Variables

👉 Create a GET API like:

/users/{userId}/orders/{orderId}

Return both values in response.

**Concepts tested:** Multiple `@PathVariable`

---

### 3️⃣ Return JSON Instead of String

👉 Modify your `/hello/{name}` API to return JSON:

{

  "message": "Hi Anurag",

  "timestamp": "2026-02-01"

}

**Concepts tested:** POJO → JSON (Jackson)

---

### 4️⃣ Accept List in Request Body

👉 Create POST API that accepts:

[

  { "name": "A", "age": 20 },

  { "name": "B", "age": 21 }

]

Return count of students saved.

**Concepts tested:** `List<Student>`

---

# 🔹 Level 2 — Validation & Error Handling (HIGH IMPACT)

### 5️⃣ Input Validation

👉 Add validation:

- `name` → not blank
    
- `age` → min 18
    

Return proper error message.

**Concepts tested:**  
`@Valid`, `@NotBlank`, `@Min`

---

### 6️⃣ Custom Exception

👉 Throw exception when age < 18:

"Student is underage"

**Concepts tested:**  
Custom Exception + `@ResponseStatus`

---

### 7️⃣ Global Exception Handler

👉 Create `@ControllerAdvice` to handle:

- Validation errors
    
- StudentNotFoundException
    

**Interview GOLD**

---

# 🔹 Level 3 — Service Layer & Clean Architecture (VERY IMPORTANT)

### 8️⃣ Add Service Layer

👉 Move logic from controller to service.

Structure:

controller → service → response

**Interviewers LOVE this**

---

### 9️⃣ Constructor Injection

👉 Use constructor-based dependency injection.

**Concepts tested:**  
DI best practices

---

### 🔟 Interface + Implementation

👉 Create:

StudentService (interface)

StudentServiceImpl

Explain **why interface is used**.

---

# 🔹 Level 4 — Persistence (MOST ASKED PRACTICAL)

### 1️⃣1️⃣ JPA Entity

👉 Convert `Student` to JPA entity.

Add:

- `@Entity`
    
- `@Id`
    
- `@GeneratedValue`
    

---

### 1️⃣2️⃣ Repository

👉 Create `StudentRepository extends JpaRepository`.

Test:

- `save()`
    
- `findById()`
    
- `findAll()`
    

---

### 1️⃣3️⃣ Custom Query Method

👉 Create method:

List<Student> findByAgeGreaterThan(int age);

**Spring Data magic question**

---

# 🔹 Level 5 — API Design & HTTP (INTERVIEW FAVORITE)

### 1️⃣4️⃣ Proper Status Codes

👉 Return:

- `201` on create
    
- `200` on fetch
    
- `404` if student not found
    

Explain **why**.

---

### 1️⃣5️⃣ PUT vs PATCH

👉 Implement:

- PUT → update full student
    
- PATCH → update only age
    

Explain difference.

---

### 1️⃣6️⃣ DELETE API

👉 Delete student by ID.

Return:

204 No Content

---

# 🔹 Level 6 — Security Basics (ENTRY-LEVEL FRIENDLY)

### 1️⃣7️⃣ Basic Auth (In-Memory)

👉 Secure all APIs except `/hello`.

**Concept tested:** Spring Security filter chain

---

### 1️⃣8️⃣ JWT Concept (NO CODING)

👉 Explain:

- What is JWT?
    
- Why stateless?
    
- Where token is validated?
    

(Interviewers often ask explanation only)

---

# 🔹 Level 7 — Real-World Scenarios (THIS SEPARATES YOU)

### 1️⃣9️⃣ Logging

👉 Add logs:

- When API is hit
    
- When student is saved
    

**Concept:** SLF4J

---

### 2️⃣0️⃣ API Versioning

👉 Support:

/api/v1/student

/api/v2/student

Explain why versioning matters.

---