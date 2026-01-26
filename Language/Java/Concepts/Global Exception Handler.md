**Global Exception Handler** is a **central place** where we handle **all exceptions** of an application instead of writing `try-catch` everywhere.

> One handler → handles exceptions from **all controllers / classes**
## Why do we need it?
Without global handler ❌:
- Repeated `try-catch` in every controller
- Messy & unreadable code
- Inconsistent error responses

With global handler ✅:
- Clean controllers
- Centralized error handling
- Consistent API responses
---
## Core Java
- **No built-in global exception handler**.
- Closest options:
1. Catch exceptions in `main()` to act as a central handler.
```java
public static void main(String[] args) {
    try { method1(); } 
    catch (Exception e) { System.out.println("Handled globally"); }
}
```
2. `Thread.setDefaultUncaughtExceptionHandler()` – catches uncaught exceptions in threads.
## Spring / Spring Boot
- **Spring MVC / Boot provides real global exception handling** using:
    - `@ControllerAdvice` → for MVC
    - `@RestControllerAdvice` → for REST APIs (common in Spring Boot)
    - `@ExceptionHandler` → to handle specific exceptions

- Benefits:
    - Centralized handling for all controllers
    - Consistent responses
    - Cleaner, more maintainable code

Example (Spring Boot):
```java
@RestControllerAdvice
public class GlobalExceptionHandler {

    // Handle our custom exception
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<String> handleUserNotFound(UserNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    // Handle all other exceptions
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleAll(Exception ex) {
        return new ResponseEntity<>("Something went wrong", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
```