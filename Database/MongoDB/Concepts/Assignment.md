# ✅ **Assignment 1: User → Orders → OrderItems (Multi-Level Schema Design)**

### **Requirement**
Design MongoDB schemas for an **E-commerce mini system**:
- A `User` can have **many orders**
- Each `Order` has **many items**
- Each `Item` contains: productId, price, quantity
### **API Use Cases**
1. `GET /users/{id}` → Should show basic user info (NOT orders)
2. `GET /users/{id}/orders` → Should show list of orders
3. `GET /orders/{id}` → Detailed order view with items
### **Task**
1. Decide what should be **embedded** and what should be **referenced**
2. Draw the MongoDB schema JSON for:
    - User
    - Orders
    - OrderItems (embedded or referenced?)
        
3. Write 3 queries:
    - Fetch user info
    - Fetch orders of a user
    - Fetch full order with items
👉 **Goal:** Apply correct relationship selection (1:Many, nested vs reference).

---

# ✅ **Assignment 2: Blog → Comments (High vs Low Volume Case)**

### **Requirement**
	
Build schema for a Blog app where:

- Each `BlogPost` can have **thousands** of comments.
    
- For admin dashboard, you need only the **latest 3 comments** inside the BlogPost.
    
- Full comments should be fetched separately using  
    `GET /posts/{id}/comments`.
    

### **Task**

1. Create schema where:
    
    - BlogPost embeds **only latest 3 comments**
        
    - Full comments stored in a separate collection
        
2. Write MongoDB queries for:
    
    - Add new comment
        
    - Push it to comments collection
        
    - Update the blog → maintain latest 3 comments
        
3. Write an aggregation pipeline using `$lookup` to fetch post with all comments.
    

👉 **Goal:** Practice hybrid embedding + referencing + `$lookup`.

---

# ✅ **Assignment 3: Many-to-Many — Students ↔ Courses**

### **Requirement**

University system:

- A `Student` can register for many courses
    
- A `Course` can have many students
    
- A typical student may join 5–10 courses
    
- A course could have 200 students
    

### **API Use Cases**

1. `GET /students/{id}` → show student info + list of course names
    
2. `GET /courses/{id}/students` → show list of enrolled students
    
3. `POST /students/{id}/register?course={courseId}` → add link both ways
    

### **Task**

1. Design 2 MongoDB schemas:
    
    - Student
        
    - Course
        
2. Include:
    
    - courseIds array inside Student
        
    - studentIds array inside Course
        
3. Write queries to:
    
    - Register a student into a course
        
    - Fetch a student with course names (needs `$lookup`)
        
    - Fetch course with student names (another `$lookup`)
        

👉 **Goal:** Clean many-to-many design + referencing + lookup usage.