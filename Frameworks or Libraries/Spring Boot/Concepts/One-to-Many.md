- One entity is related to **multiple entities**.
- **Many-to-One** is the **owner side**, **One-to-Many** is inverse.

**Example:** `Course` ↔ `Student` (one course has many students)
```java
@Entity
public class Course {
    @Id @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Student> students;
}
```

```java
@Entity
public class Student {
    @Id @GeneratedValue
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "course_id") // FK in Student table
    private Course course;
}
```
✅ Notes:
- `mappedBy` → tells JPA this is **inverse side**, mapped by `course` in Student.
- Default fetch:
    - `@ManyToOne` → **EAGER** 
    - `@OneToMany` → **LAZY** 
- `cascade` → propagates save/delete operations.