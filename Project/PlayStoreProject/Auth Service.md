Auth Service: Full Code
1️⃣ Entity
package com.playstore.auth.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

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

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role; // Enum: USER or OWNER

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;
}
2️⃣ Role Enum
package com.playstore.auth.entity;

public enum Role {
    USER,
    OWNER
}
3️⃣ DTOs
RegisterRequestDTO
package com.playstore.auth.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequestDTO {
    private String name;
    private String email;
    private String password;
    private String role; // "USER" or "OWNER"
}
UserDTO
package com.playstore.auth.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private String role;
}
4️⃣ Mapper
package com.playstore.auth.mapper;

import com.playstore.auth.dto.UserDTO;
import com.playstore.auth.entity.User;

public class UserMapper {

    public static UserDTO toDTO(User user) {
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        dto.setRole(user.getRole().name());
        return dto;
    }
}
5️⃣ Repository
package com.playstore.auth.repository;

import com.playstore.auth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
6️⃣ Custom Exceptions
EmailAlreadyExistsException
package com.playstore.auth.exception;

public class EmailAlreadyExistsException extends RuntimeException {
    public EmailAlreadyExistsException(String message) {
        super(message);
    }
}
ResourceNotFoundException
package com.playstore.auth.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
7️⃣ Service
package com.playstore.auth.service;

import com.playstore.auth.dto.RegisterRequestDTO;
import com.playstore.auth.entity.Role;
import com.playstore.auth.entity.User;
import com.playstore.auth.exception.EmailAlreadyExistsException;
import com.playstore.auth.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public User register(RegisterRequestDTO request) {

        if(userRepository.findByEmail(request.getEmail()).isPresent()){
            throw new EmailAlreadyExistsException("Email already registered");
        }

        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        if(request.getRole() != null && request.getRole().equalsIgnoreCase("OWNER")){
            user.setRole(Role.OWNER);
        } else {
            user.setRole(Role.USER);
        }

        user.setCreatedDate(LocalDateTime.now());
        user.setUpdatedDate(LocalDateTime.now());

        return userRepository.save(user);
    }

    public User getUserById(Long id){
        return userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with ID: " + id));
    }
}
8️⃣ Controller
package com.playstore.auth.controller;

import com.playstore.auth.dto.RegisterRequestDTO;
import com.playstore.auth.dto.UserDTO;
import com.playstore.auth.entity.User;
import com.playstore.auth.mapper.UserMapper;
import com.playstore.auth.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserDTO> register(@RequestBody RegisterRequestDTO request){
        User user = userService.register(request);
        return ResponseEntity.ok(UserMapper.toDTO(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUser(@PathVariable Long id){
        User user = userService.getUserById(id);
        return ResponseEntity.ok(UserMapper.toDTO(user));
    }
}
9️⃣ Security Config
package com.playstore.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
🔟 Global Exception Handler
package com.playstore.auth.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleNotFound(ResourceNotFoundException ex){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

    @ExceptionHandler(EmailAlreadyExistsException.class)
    public ResponseEntity<String> handleDuplicateEmail(EmailAlreadyExistsException ex){
        return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGeneral(Exception ex){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
    }
}
✅ Notes

DTOs ensure microservices don’t expose entities.

Passwords are hashed with BCrypt.

Role can be USER or OWNER.

Custom exceptions handle duplicate emails and resource not found.

Global exception handler centralizes error responses.

This is full Auth Service code.

Next, we can do App Service and Interaction Service in a similar style with DTOs, mappers, custom exceptions, and Feign Clients.

Do you want me to give full App Service code next?

 You're using a less powerful model until your limit resets tomorrow after 11:20 AM. Upgrade to get more access.
Claim free offer