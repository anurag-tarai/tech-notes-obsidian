## **Level 1: One-to-One**

1. Design entities for a `User` who has **one Passport**. Each passport belongs to only one user.
    
2. Create entities for `Employee` and `Desk`, where **each employee is assigned exactly one desk**.
    

**Extra challenge:** Make it **bidirectional** so you can get the employee from the desk.

---

## **Level 2: One-to-Many / Many-to-One**

3. Design entities for a `Library` and `Book` where a library can have **many books**, but each book belongs to **one library**.
    
4. Design entities for `Team` and `Player` (sports), where one team has many players.
    
5. Challenge: Design `Department` and `Employee` entities where deleting a department **deletes all employees** automatically.
    

---

## **Level 3: Many-to-Many**

6. Design entities for `Student` and `Course` where a student can enroll in **multiple courses** and each course has **multiple students**.
    
7. Design entities for `Author` and `Book` (a book can have multiple authors, an author can write multiple books).
    

**Extra challenge:** Customize the **join table name** and column names.

---

## **Level 4: Self-Referencing**

8. Design an `Employee` entity for a company **hierarchy**, where an employee can have a **manager** and **subordinates**.
    
9. Design a `Category` entity for an e-commerce app, where **categories can have parent categories and child categories**.
    

---

## **Level 5: Mixed Relationships (Advanced)**

10. Design entities for a `Course`, `Student`, and `Teacher` scenario:
    
    - Each course has **one teacher** (One-to-One or Many-to-One)
        
    - Each student can enroll in **multiple courses** (Many-to-Many)
        
    - Each teacher can teach **multiple courses** (One-to-Many)
        
11. Design entities for a `Post` and `Comment` system:
    
    - Each post can have **many comments** (One-to-Many)
        
    - Each comment can optionally have a **parent comment** (self-referencing, for nested comments)
        

---