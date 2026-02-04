> Interface-based design improves loose coupling, supports multiple implementations, follows SOLID principles, and makes applications easier to test and maintain.

## Definition

**Interface-based design** means writing code against an **interface** instead of a concrete implementation.

> _Program to an interface, not an implementation._

---

## Why Interface-Based Design?

- Reduces **tight coupling**
    
- Makes code **flexible & maintainable**
    
- Allows **multiple implementations**
    
- Simplifies **unit testing (mocking)**
    
- Follows **SOLID principles**
    

---

## Typical Structure

service/

 ├── TaskService.java        (interface)

 └── TaskServiceImpl.java    (implementation)

---

## Example

### Service Interface

public interface TaskService {

    TaskDTO createTask(TaskDTO taskDTO);

}


### Service Implementation

@Service

public class TaskServiceImpl implements TaskService {

  

    private final TaskRepository taskRepository;

  

    public TaskServiceImpl(TaskRepository taskRepository) {

        this.taskRepository = taskRepository;

    }


    @Override

    public TaskDTO createTask(TaskDTO taskDTO) {

        // business logic

    }

}


 When Spring sees this:
```java
  @Service
public class TaskServiceImpl implements TaskService
```
  Spring:

- Creates a **bean of `TaskServiceImpl`**
    
- But exposes it **as `TaskService` (the interface)**
### Injection Usage

@Autowired

private TaskService taskService;

---

## Why Inject Interface Instead of Implementation?

❌ Bad

@Autowired

private TaskServiceImpl taskService;

✅ Good

@Autowired

private TaskService taskService;

### Reasons

- Controller depends on **abstraction**
    
- Implementation can be changed without modifying client code
    
- Easier to add new implementations
    
- Better testability
    

---

## Multiple Implementations Scenario

If multiple implementations exist:

@Service

public class TaskServiceImpl implements TaskService { }

  

@Service

public class TaskServiceV2Impl implements TaskService { }

Spring will throw:

NoUniqueBeanDefinitionException

---

## How Spring Resolves Multiple Implementations

### 1. `@Primary`

@Service

@Primary

public class TaskServiceImpl implements TaskService { }

### 2. `@Qualifier`

@Autowired

@Qualifier("taskServiceImpl")

private TaskService taskService;

### 3. Spring Profiles

@Profile("prod")

@Profile("test")

---

## SOLID Principle Used

### Dependency Inversion Principle (DIP)

- High-level modules depend on **interfaces**
    
- Not on concrete implementations