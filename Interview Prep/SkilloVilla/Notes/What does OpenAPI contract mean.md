An **OpenAPI contract** is a **formal specification (agreement)** that describes **how a REST API should behave**.

It defines:

- **Available endpoints** (URLs)
    
- **HTTP methods** (GET, POST, PUT, DELETE)
    
- **Request parameters & request body**
    
- **Response structure**
    
- **HTTP status codes**
    
- **Authentication details**
    

👉 In short:  
**It’s a written contract between backend and frontend about how the API works.**

---

## Why is it called a _contract_?

Because **both sides must follow it**:

- **Backend** promises: “My API will behave exactly like this”
    
- **Frontend / consumers** expect the same behavior
    

If the backend changes something without updating the contract → things break ❌

---

## What is OpenAPI specifically?

**OpenAPI** is a **standard format** (formerly Swagger) to write this contract in **YAML or JSON**.

Example (very small):

```java
GET /users/{id}
Response 200:
{
  "id": 1,
  "name": "Anurag"
}
```
This tells everyone:

- Which endpoint exists
    
- What it returns
    
- How to call it