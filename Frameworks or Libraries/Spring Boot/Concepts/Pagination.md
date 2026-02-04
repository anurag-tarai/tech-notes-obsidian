**Definition:**  
Pagination is the process of dividing a large set of data into smaller chunks (pages) and fetching one chunk at a time.

**Why use it:**
- Improves performance (less data sent over network)
- Reduces memory usage
- Better user experience (display limited results per page)
    
**Example:**  
Imagine a database table with 1000 users. Instead of returning all 1000 at once, you return 10 users per page:

- Page 1 → users 1–10
    
- Page 2 → users 11–20
    
- Page 3 → users 21–30
---
### How to Implement Pagination in Spring Boot
Spring Data JPA provides **`Pageable`** interface to make pagination easy.

Step 1: Entity
```java
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;
}
```

Step 2: Repository
```java
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    // Find all users with pagination
    Page<User> findAll(Pageable pageable);
}
```

Step 3: Service
```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Page<User> getUsers(int page, int size) {
        return userRepository.findAll(PageRequest.of(page, size));
    }
}
```

Step 4: Controller
```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public Page<User> getUsers(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return userService.getUsers(page, size);
    }
}
```

### **Step 5: Test the API**

- `GET /users?page=0&size=5` → returns first 5 users
    
- `GET /users?page=1&size=5` → returns next 5 users
    

The response includes:

- `content` → list of users on that page
    
- `totalElements` → total number of users
    
- `totalPages` → total pages
    
- `number` → current page number