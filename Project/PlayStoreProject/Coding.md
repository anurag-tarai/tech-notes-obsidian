
# Step 1 — Create the Microservices

You need **4 backend services**.

1️⃣ **Service Registry**

eureka-server

2️⃣ **Auth Service**

auth-service

Handles:

- Register
    
- Login
    
- JWT
    
- Users table
    

Uses Spring Security and JSON Web Token.

---

3️⃣ **Application Service**

app-service

Handles:

- Categories
    
- Applications
    
- Search
    
- Filtering
    

---

4️⃣ **Interaction Service**

interaction-service

Handles:

- Reviews
    
- Downloads
    
- Notifications
    

---

# Step 2 — Create Eureka Server

### Dependencies

- Spring Web
    
- Eureka Server
    

---

### Main Class

@SpringBootApplication  
@EnableEurekaServer  
public class EurekaServerApplication {  
  
    public static void main(String[] args) {  
        SpringApplication.run(EurekaServerApplication.class, args);  
    }  
  
}

---

### application.yml

server:  
  port: 8761  
  
eureka:  
  client:  
    register-with-eureka: false  
    fetch-registry: false

Run it.

Open:

http://localhost:8761

Now your **service registry is running**.

---

# Step 3 — Create Auth Service

Dependencies

- Spring Web
    
- Spring Data JPA
    
- MySQL
    
- Spring Security
    
- JWT
    
- Eureka Client
    
- Lombok
    

---

## application.yml

server:  
  port: 8081  
  
spring:  
  datasource:  
    url: jdbc:mysql://localhost:3306/playstore_auth_db  
    username: root  
    password: root  
  
  jpa:  
    hibernate:  
      ddl-auto: update  
  
eureka:  
  client:  
    service-url:  
      defaultZone: http://localhost:8761/eureka/

---

# Step 4 — Users Entity

@Entity  
@Table(name = "users")  
@Data  
public class User {  
  
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;  
  
    private String name;  
  
    @Column(unique = true)  
    private String email;  
  
    private String password;  
  
    private String role;  
  
    private LocalDateTime createdDate;  
  
    private LocalDateTime updatedDate;  
  
}

---

# Step 5 — User Repository

@Repository  
public interface UserRepository extends JpaRepository<User, Long> {  
  
    Optional<User> findByEmail(String email);  
  
}

---

# Step 6 — User Service

@Service  
@RequiredArgsConstructor  
public class UserService {  
  
    private final UserRepository userRepository;  
    private final PasswordEncoder passwordEncoder;  
  
    public User register(User user){  
  
        user.setPassword(passwordEncoder.encode(user.getPassword()));  
        user.setCreatedDate(LocalDateTime.now());  
  
        return userRepository.save(user);  
    }  
  
}

---

# Step 7 — Auth Controller

@RestController  
@RequestMapping("/auth")  
@RequiredArgsConstructor  
public class AuthController {  
  
    private final UserService userService;  
  
    @PostMapping("/register")  
    public ResponseEntity<User> register(@RequestBody User user){  
  
        return ResponseEntity.ok(userService.register(user));  
    }  
  
}

---

# Step 8 — Application Service Entities

### Category

@Entity  
@Data  
public class Category {  
  
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;  
  
    private String name;  
  
}

---

### Application Entity

@Entity  
@Data  
public class Application {  
  
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;  
  
    private String name;  
  
    private String description;  
  
    private String version;  
  
    private LocalDate releaseDate;  
  
    private Double averageRating;  
  
    private Long downloadsCount;  
  
    private Long ownerId;  
  
    private Boolean visibility;  
  
    private LocalDateTime createdDate;  
  
    private LocalDateTime updatedDate;  
  
    @ManyToOne  
    private Category category;  
  
}

---

# Step 9 — Interaction Service Entities

### ReviewId (Composite Key)

@Embeddable  
@Data  
public class ReviewId implements Serializable {  
  
    private Long userId;  
    private Long appId;  
  
}

---

### Review Entity

@Entity  
@Data  
public class Review {  
  
    @EmbeddedId  
    private ReviewId id;  
  
    private Integer rating;  
  
    private String reviewDescription;  
  
    private LocalDateTime createdDate;  
  
    private LocalDateTime updatedDate;  
  
}

---

### Download Entity

@Entity  
@Data  
public class Download {  
  
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;  
  
    private Long userId;  
  
    private Long appId;  
  
    private LocalDateTime downloadDate;  
  
}

---

### Notification Entity

@Entity  
@Data  
public class Notification {  
  
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;  
  
    private Long recipientId;  
  
    private Long appId;  
  
    private String type;  
  
    private String message;  
  
    private Boolean isRead;  
  
    private LocalDateTime createdAt;  
  
}

---

# Step 10 — Microservice Communication

This is where **Feign Client is required**.

Use Spring Cloud OpenFeign.

Example:

Interaction Service calling Auth Service.

@FeignClient(name = "auth-service")  
public interface AuthClient {  
  
    @GetMapping("/users/{id}")  
    UserDTO getUser(@PathVariable Long id);  
  
}

This allows:

Review Service → verify user  
Download Service → verify user

---

# Step 11 — Global Exception Handler

@RestControllerAdvice  
public class GlobalExceptionHandler {  
  
    @ExceptionHandler(Exception.class)  
    public ResponseEntity<String> handleException(Exception ex){  
        return ResponseEntity.status(500).body(ex.getMessage());  
    }  
  
}

---

# Step 12 — Security (JWT)

In **Auth Service**

- Login endpoint
    
- Generate JWT
    
- Validate token
    

Use Spring Security + JSON Web Token.

---

# Correct Backend Architecture

                Eureka Server  
                     |  
        --------------------------------  
        |              |               |  
   Auth Service   App Service   Interaction Service  
      (Users)     (Apps)          (Reviews)

Each service:

Controller  
Service  
Repository  
Entity  
DTO  
Exception

---

# Important Advice

Do **NOT try to code everything at once**.

Correct order:

1️⃣ Eureka Server  
2️⃣ Auth Service  
3️⃣ JWT Security  
4️⃣ App Service  
5️⃣ Interaction Service  
6️⃣ Feign Communication  
7️⃣ Notifications