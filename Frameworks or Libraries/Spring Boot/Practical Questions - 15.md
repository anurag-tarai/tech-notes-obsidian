## 1️⃣ Basic REST APIs (GET/POST)

1. Create a **GET API** that returns “Hello Spring Boot”.
    
2. Create a **GET API** with **PathVariable** to greet a user.
    
3. Create a **POST API** that accepts a `Student` JSON object (`name`, `age`) and returns a confirmation message.
    

---

## 2️⃣ Exception Handling

4. Create a GET API that divides two numbers and **handles divide-by-zero exception** globally.
    
5. Create a **custom exception** `ResourceNotFoundException` and handle it globally.
    

---

## 3️⃣ Validation

6. Add **validation** to the `Student` object: `name` cannot be blank, `age` > 0.
    
7. Modify the POST API to **return validation error messages** when input is invalid.
    

---

## 4️⃣ application.properties / Profiles

8. Create a property `app.name` and expose it via a GET API.
    
9. Create **profile-specific properties** for `dev` and `prod` and return a message depending on active profile.
    

---

## 5️⃣ Database / CRUD (H2 in-memory)

10. Create a **Student entity** and save it via a POST API.
    
11. Create a GET API to **fetch all students**.
    
12. Create a GET API to **fetch student by ID** and handle “not found” case.
    

---

## 6️⃣ CommandLineRunner

13. Use `CommandLineRunner` to **print “App started successfully!”** at startup or insert default records in DB.
    

---

## 7️⃣ Logging / Misc

14. Add **logging** in your APIs for requests and responses.
    
15. Create a REST API that **returns a custom error structure** (timestamp, message, path) for exceptions.