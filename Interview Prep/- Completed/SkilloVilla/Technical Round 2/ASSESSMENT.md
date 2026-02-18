You are tasked to build a **Simple Book Management System**.

### **Entities**

1. **Book**
    
    - `id` (Long, auto-generated)
        
    - `title` (String, required)
        
    - `author` (String, required)
        
    - `isbn` (String, required, unique)
        
    - `publishedDate` (LocalDate, optional)
        
    - `price` (Double, optional)
        
2. **Category**
    
    - `id` (Long, auto-generated)
        
    - `name` (String, required, unique)
        
    - `description` (String, optional)
        
    - One category can have **multiple books** (One-to-Many).
        

---

### **Functional Requirements**

Implement **CRUD APIs** for both **Book** and **Category**:

**Category APIs**

- Create a new category
    
- Update a category
    
- Get all categories
    
- Get category by ID
    
- Delete category (soft delete optional)
    

**Book APIs**

- Create a new book (assign to a category)
    
- Update a book
    
- Get all books
    
- Get book by ID
    
- Delete book
    
- Filter books by category (optional bonus)
    

---

### **Technical Requirements**

- Use **Spring Boot**, **Spring Data JPA**, **H2/MySQL**
    
- Use **DTOs** for requests/responses
    
- Validate inputs (`@NotNull`, `@Size`, `@Positive`)
    
- Use **Controller → Service → Repository** pattern
    
- Exception handling using `@RestControllerAdvice`
    
- Return structured response `{status, message, data}`
    
- (Optional) Paginate `GET /books` responses
    

---