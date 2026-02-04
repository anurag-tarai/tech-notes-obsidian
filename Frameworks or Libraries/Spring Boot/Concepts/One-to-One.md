- Each row in **Table A** maps to **exactly one row** in **Table B**.
- Can be **unidirectional** or **bidirectional**.

**Example:** `User` ↔ `Profile` (one user has one profile)
```java
@Entity
public class User {
    @Id 
    @GeneratedValue
    private Long id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id") // FK in User table
    private Profile profile;
}

```

```java
@Entity
public class Profile {
    @Id 
    @GeneratedValue
    private Long id;
    private String bio;

    @OneToOne(mappedBy = "profile")
    private User user; // optional, bidirectional
}
```
- `@JoinColumn` → specifies the **foreign key** column.
    
- `cascade = CascadeType.ALL` → operations on User also apply to Profile.
    
- Default fetch type: **EAGER**.