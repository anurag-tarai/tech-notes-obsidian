# 🔹 Assessment 1 — Core CRUD + Validation (Very Common)

### Problem: **User Notes Service**

**Requirements**

- Create User
    
- Create Note (belongs to a User)
    
- Fetch all notes of a user (paginated)
    
- Update note title/content
    
- Soft delete note
    

**Constraints**

- A deleted note should not appear in fetch
    
- Title cannot be empty
    
- Max 100 notes per user
    

**What this tests**  
✅ Entity relationships  
✅ Pagination  
✅ Validation  
✅ Clean service layer

---

# 🔹 Assessment 2 — Status & Business Rules (Manager Favorite)

### Problem: **Order Management System**

**Entities**

- Order: id, customerName, amount, status (CREATED, PAID, CANCELLED)
    
**Requirements**

- Create order
    
- Pay for order
    
- Cancel order
    
- Fetch orders by status
    

**Rules**

- PAID order cannot be cancelled
    
- CANCELLED order cannot be paid
    
- Return proper error messages
    

**What this tests**  
✅ Business logic  
✅ State transitions  
✅ Exception handling

---

# 🔹 Assessment 3 — Search + Filtering (Real World)

### Problem: **Product Catalog API**

**Fields**

- id, name, category, price, inStock
    

**APIs**
- Add product
    
- Search by name (partial match)
    
- Filter by category + price range
    
- Paginated result
    

**What this tests**  
✅ Query design  
✅ Filtering  
✅ Clean controller APIs

---

# 🔹 Assessment 4 — Authentication (Lightweight)

### Problem: **Simple Login System (NO full Spring Security)**

**Requirements**

- Register user (email + password)
    
- Login API
    
- Return dummy token (UUID string)
    
- Protect one API using token
    

**Rules**

- Password must be min 6 chars
    
- Invalid token → 401 response
    

**What this tests**  
✅ API design  
✅ Basic auth logic  
✅ HTTP status codes

---

# 🔹 Assessment 5 — Ownership & Authorization (Advanced Fresher)

### Problem: **Blog Platform**

**Entities**

- User
    
- Post
    

**Requirements**

- User creates post
    
- User updates own post
    
- User deletes own post
    
- Fetch all posts
    

**Rules**

- User cannot update/delete others’ posts
    

**What this tests**  
✅ Authorization logic  
✅ Clean service methods  
✅ Real-world thinking

---

# 🔹 Assessment 6 — Time-based Logic (Rare but impressive)

### Problem: **Event Reminder Service**

**Fields**

- title
    
- eventDateTime
    
- status (UPCOMING, EXPIRED)
    

**Requirements**

- Create event
    
- Fetch upcoming events
    
- Mark expired events automatically (on fetch)
    

**What this tests**  
✅ Date handling  
✅ Edge cases  
✅ Thoughtfulness