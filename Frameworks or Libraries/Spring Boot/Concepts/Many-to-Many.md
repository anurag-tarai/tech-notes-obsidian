- Each entity can relate to **multiple entities**, and vice versa.
    
- Requires a **join table**.

Example: `Student` can take many `Subjects`, and each `Subject` can have many students.

```java
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @JoinTable(
    name = "student_subject",             // Name of the join table
    joinColumns = @JoinColumn(name = "student_id"),  // FK to Student
    inverseJoinColumns = @JoinColumn(name = "subject_id")  // FK to Subject
	)
    private List<Subject> subjects;
}
```

```java
@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "subjects")
    private List<Student> students;
}
```


Explain :
```java
 @JoinTable(
    name = "student_subject",             // Name of the join table
    joinColumns = @JoinColumn(name = "student_id"),  // FK to Student
    inverseJoinColumns = @JoinColumn(name = "subject_id")  // FK to Subject
	)
    private List<Subject> subjects;
```

## **1️⃣ `name = "student_subject"`**

- This is the **name of the join table** in the database.
    
- JPA will create a table called `student_subject` to store the many-to-many relationships.
    
- Each row in this table represents **one link between a student and a subject**.
    

---

## **2️⃣ `joinColumns = @JoinColumn(name = "student_id")`**

- Defines the **foreign key column that points to the owning entity** (`Student` in this case).
    
- Column name = `student_id` in the join table.
    
- This column tells JPA which student this row belongs to.
    

Example row:

|student_id|subject_id|
|---|---|
|1|101|

- Here, `student_id = 1` → refers to the student with `id = 1`.
    

---

## **3️⃣ `inverseJoinColumns = @JoinColumn(name = "subject_id")`**

- Defines the **foreign key column that points to the other entity** (`Subject`).
    
- Column name = `subject_id` in the join table.
    
- This column tells JPA which subject is linked to the student.
    

Example row continued:

|student_id|subject_id|
|---|---|
|1|101|

- Here, `subject_id = 101` → refers to the subject with `id = 101`.
    

---

## **4️⃣ `private List<Subject> subjects;`**

- This is the **collection in the owning entity** (`Student`) that stores the related subjects.
    
- When you add or remove subjects in this list, JPA updates the join table `student_subject`.
    
- Owning side = **defines the join table** (`Student` in this case)
    
- Inverse side (`Subject`) just uses `mappedBy` to point back to `subjects`.
    

---

### **Summary in Simple Words**

1. `@JoinTable` → creates a table for the relationship.
    
2. `name` → name of that table (`student_subject`).
    
3. `joinColumns` → FK pointing to **owning entity** (`student_id`).
    
4. `inverseJoinColumns` → FK pointing to **other entity** (`subject_id`).
    
5. `List<Subject> subjects` → the list of related subjects in `Student`.