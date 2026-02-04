**What it is:**  
Indexing in a database improves query performance. Instead of scanning the whole table, the database can quickly locate rows using the index. Think of it like the index of a book.

### How to implement in Spring (with JPA/Hibernate):
```java
import jakarta.persistence.*;
import org.hibernate.annotations.Index;

@Entity
@Table(name = "users",
       indexes = {
           @Index(name = "idx_user_email", columnList = "email")
       })
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    // getters and setters
}
```
**Explanation:**

- `@Index(name = "idx_user_email", columnList = "email")` → creates a database index on the `email` column.
    
- Improves performance for queries like:
```java
User user = userRepository.findByEmail("test@example.com");
```

✅ **Best practice:** Add indexes only on columns that are frequently queried in `WHERE`, `JOIN`, or `ORDER BY` clauses, not on every column.
