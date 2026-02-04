**Definition:**  
A **DTO** is a simple Java object (POJO) used to **carry data between processes** (like between client and server, or between layers of an application). It usually **does not contain any business logic**, only fields and getters/setters.

---
### **Why use DTOs?**

1. **Separation of Concerns**
    - Your database entities might have extra fields or relationships you **don’t want to expose** to the client.
    - DTOs act as a **safe layer** between your internal model and what you send/receive.
        
    **Example:**
```java
@Entity
public class User {
    private Long id;
    private String username;
    private String password; // sensitive
}
```

You don’t want to send `password` to the client. A DTO fixes this:
    
```java
public class UserDTO {
    private String username;
}
```
    
2. **Reduce Overfetching / Optimize Responses**
    
    - You can send **only the necessary fields** in API responses.
        
    - Useful in APIs with large entities or complex relationships.
        
3. **Decouple Layers**
    
    - Changes in your database model don’t directly break your API contract with clients.
        
    - Your entity can change, DTO stays the same.
        
4. **Validation & Input Control**
    
    - When receiving data (POST/PUT), DTOs can enforce **validation rules** without touching your entity.
        
```java
public class UserCreateDTO {
    @NotBlank
    private String username;
    
    @NotBlank
    private String password;
}
```
    
5. **Serialization / API Contracts**
    
    - DTOs control exactly what goes over the wire (JSON/XML).
        
    - Prevents accidentally exposing internal data.
### Example: Using DTO in Spring Boot
```java
@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public ResponseEntity<UserDTO> createUser(@RequestBody UserCreateDTO userCreateDTO) {
        User user = userService.createUser(userCreateDTO);
        UserDTO response = new UserDTO(user.getUsername());
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
```

Here:

- `UserCreateDTO` → input from client
    
- `UserDTO` → output to client
    
- `User` → internal entity