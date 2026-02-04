## What is Builder?

**Builder** is a **creational design pattern** used to create objects **step by step** in a **readable and safe way**, especially when an object has **many fields**.

> Instead of passing many parameters to a constructor, we build the object gradually.

## Why do we need Builder?

### Problems with constructors

❌ Too many parameters  
❌ Hard to read  
❌ Order matters  
❌ Difficult to maintain

```java
new Task(1, "Title", "Desc", HIGH, OPEN, date, createdAt); // ❌ confusing
```

How Builder solves this
```java
Task task = Task.builder()
        .title("My Task")
        .description("Important task")
        .priority(HIGH)
        .status(OPEN)
        .build();
```
✔ Readable  
✔ Order doesn’t matter  
✔ Easy to add/remove fields  
✔ Avoids constructor confusion

## Builder in Lombok (Most Common in Spring Boot)

### Entity / DTO
```java
@Builder
@Data
public class TaskDTO {
    private Long id;
    private String title;
    private String description;
    private LocalDateTime dueDate;
}
```

```java
TaskDTO dto = TaskDTO.builder()
        .title("Learn Spring")
        .description("Builder Pattern")
        .build();
```

## Builder vs Constructor

|Constructor|Builder|
|---|---|
|Order matters|Order doesn’t matter|
|Hard to read|Very readable|
|Bad for many fields|Perfect for many fields|
|Not flexible|Flexible|

---

## Builder vs Setter

| Setter                           | Builder                |
| -------------------------------- | ---------------------- |
| Object mutable                   | Can be immutable       |
| Partially built objects possible | Object built only once |
| Less safe                        | Safer                  |
|                                  |                        |
> Builder is safer, more readable, and allows creating **fully-initialized immutable objects**, whereas setters can leave objects in an inconsistent state.

|Use Case|Preferred|
|---|---|
|DTOs|✅ Builder|
|Request/Response objects|✅ Builder|
|JPA Entities|⚠️ Builder (careful)|
|Simple POJO|Setter OK|
## Is Builder a SOLID principle?

❌ No  
✅ It is a **Design Pattern**

Related principle:

- **Single Responsibility Principle**
    
- **Open/Closed Principle**