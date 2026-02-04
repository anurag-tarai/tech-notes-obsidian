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