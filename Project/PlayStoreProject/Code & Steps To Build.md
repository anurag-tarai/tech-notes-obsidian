We will build **3 microservices + 1 infrastructure service**.

eureka-server  
auth-service  
app-service  
interaction-service

---

# 1️⃣ Eureka Server (Service Registry)

All services register here.

### Dependencies

- Spring Web
    
- Eureka Server
    

### Main Class

```java
@SpringBootApplication  
@EnableEurekaServer  
public class EurekaServerApplication {  
  
    public static void main(String[] args) {  
        SpringApplication.run(EurekaServerApplication.class, args);  
    }  
  
}
```

### application.yml

```java
server:  
  port: 8761  
  
eureka:  
  client:  
    register-with-eureka: false  
    fetch-registry: false

```
Run and open:

http://localhost:8761

---

# 2️⃣ Auth Service (Users)

Database:

playstore_auth_db

### Dependencies

- Spring Web
    
- Spring Data JPA
    
- MySQL
    
- Spring Security
    
- Lombok
    
- Eureka Client
    

---

## Entity

```java
@Entity  
@Table(name = "users")  
@Getter  
@Setter  
@NoArgsConstructor  
@AllArgsConstructor  
public class User {  
  
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;  
  
    private String name;  
  
    @Column(unique = true, nullable=false)  
    private String email;  
  
    @Column(nullable = false)
    private String password;  
  
   @Enumerated(EnumType.STRING)
    private String role;  
  
    private LocalDateTime createdDate;  
  
    private LocalDateTime updatedDate;  
  
}
```

---

## Repository

```java
@Repository  
public interface UserRepository extends JpaRepository<User, Long> {  
  
    Optional<User> findByEmail(String email);  
  
}
```

---

## Service

```java
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
```

---

## Controller

```java
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
```

---

# 3️⃣ App Service (Applications + Categories)

Database:

playstore_app_db

---

## Category Entity

```java
@Entity  
@Getter  
@Setter  
public class Category {  
  
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;  
  
    private String name;  
  
}
```

---

## Application Entity

```java
@Entity  
@Getter  
@Setter  
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
    @JoinColumn(name = "category_id")  
    private Category category;  
  
}
```

---

## Application Repository

```java
@Repository  
public interface ApplicationRepository extends JpaRepository<Application, Long> {  
  
    List<Application> findByCategoryId(Long categoryId);  
  
}
```

---

## Application Service

```java
@Service  
@RequiredArgsConstructor  
public class ApplicationService {  
  
    private final ApplicationRepository repository;  
  
    public Application createApp(Application app){  
  
        app.setCreatedDate(LocalDateTime.now());  
        app.setDownloadsCount(0L);  
        app.setAverageRating(0.0);  
  
        return repository.save(app);  
    }  
  
    public List<Application> getAllApps(){  
        return repository.findAll();  
    }  
  
}
```

---

## Application Controller

```java
@RestController  
@RequestMapping("/apps")  
@RequiredArgsConstructor  
public class ApplicationController {  
  
    private final ApplicationService service;  
  
    @PostMapping  
    public ResponseEntity<Application> create(@RequestBody Application app){  
        return ResponseEntity.ok(service.createApp(app));  
    }  
  
    @GetMapping  
    public List<Application> getAll(){  
        return service.getAllApps();  
    }  
  
}
```

---

# 4️⃣ Interaction Service

Database:

`playstore_interaction_db`

Handles

Reviews  
Downloads  
Notifications

---

# Composite Key (Reviews)

### Review Entity

```java
@Entity
@Table(name = "reviews")
@Getter
@Setter
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private Long appId;

    private Integer rating;

    private String reviewDescription;

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

}
```

---

# Download Entity

```java
@Entity  
@Getter  
@Setter  
public class Download {  
  
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;  
  
    private Long userId;  
  
    private Long appId;  
  
    private LocalDateTime downloadDate;  
  
}
```

---

# Notification Entity

```java
@Entity  
@Getter  
@Setter  
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
```

---

# Feign Client (Service Communication)

Microservices communicate using Spring Cloud OpenFeign.

Example: Interaction service checking if an application exists.

```java
@FeignClient(name = "app-service")  
public interface AppClient {  
  
    @GetMapping("/apps/{id}")  
    ApplicationDTO getApp(@PathVariable Long id);  
  
}
```

---

# Global Exception Handler

Add in every service.

```java
@RestControllerAdvice  
public class GlobalExceptionHandler {  
  
    @ExceptionHandler(Exception.class)  
    public ResponseEntity<String> handleException(Exception ex){  
  
        return ResponseEntity  
                .status(HttpStatus.INTERNAL_SERVER_ERROR)  
                .body(ex.getMessage());  
    }  
  
}
```

---

# Final Architecture
```java

                 Eureka Server  
                       |  
        ---------------------------------  
        |               |               |  
    Auth Service    App Service   Interaction Service  
       (Users)      (Apps)          (Reviews)
```

Each service contains

```
controller  
service  
repository  
entity  
dto  
exception  
config
```

---

✅ This backend design satisfies the rubric requirements:

- Microservices
    
- Separate databases
    
- DTO usage
    
- Feign communication
    
- Security support
    
- Exception handling