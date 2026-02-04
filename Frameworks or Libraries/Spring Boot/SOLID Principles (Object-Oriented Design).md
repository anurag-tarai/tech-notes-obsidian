**SOLID** is a set of **5 design principles** that help write:
- clean code
- maintainable code
- scalable code
- testable code
> Used heavily in **Java, Spring Boot, enterprise applications**

---
## What does SOLID stand for?

|Letter|Principle|
|---|---|
|**S**|Single Responsibility Principle|
|**O**|Open/Closed Principle|
|**L**|Liskov Substitution Principle|
|**I**|Interface Segregation Principle|
|**D**|Dependency Inversion Principle|


## 1️⃣ Single Responsibility Principle (SRP)

### Definition

> A class should have **only one reason to change**.

### Meaning
- One class = one responsibility
- Business logic, validation, persistence should be separate
### ❌ Bad

```java
class UserService {
    saveUser();
    sendEmail();
    generateReport();

}
```

### ✅ Good

```java
class UserService { saveUser(); }
class EmailService { sendEmail(); }
class ReportService { generateReport(); }
```

### Benefit
- Easier to maintain
- Less risk when changing code

---

## 2️⃣ Open / Closed Principle (OCP)

### Definition

> Software entities should be **open for extension** but **closed for modification**.
### Meaning
- Add new behavior **without changing existing code**
### Example
```java
interface PaymentService {
    void pay();
}
```

```java
class CardPayment implements PaymentService { }
class UpiPayment implements PaymentService { }
```
👉 New payment method = new class  
👉 Existing code remains untouched
### Benefit
- Avoid breaking working code
- Easy feature expansion

---
## 3️⃣ Liskov Substitution Principle (LSP)

### Definition

> A subclass should be replaceable with its parent class **without breaking the application**.

### Meaning

- Child class must honor parent class behavior
    

### ❌ Bad Example

```java
class Bird {
    void fly();
}

class Penguin extends Bird { } // Penguin cannot fly ❌
```
### ✅ Good

```java
interface Bird { }
interface FlyingBird extends Bird { void fly(); }
```
### Benefit
- Prevents unexpected runtime bugs

---

## 4️⃣ Interface Segregation Principle (ISP)

### Definition

> Clients should not be forced to depend on interfaces they do not use.
### Meaning

- Many small interfaces are better than one big interface
    
### ❌ Bad
```java
interface Worker {
    work();
    eat();
}
```

### ✅ Good
```java
interface Workable { work(); }
interface Eatable { eat(); }
```
### Benefit
- Cleaner interfaces
- No unnecessary method implementation

---

## 5️⃣ Dependency Inversion Principle (DIP) ⭐ (Most Important in Spring)

### Definition

> High-level modules should depend on **abstractions**, not **concrete implementations**.
### Meaning
- Use **interfaces**
- Avoid `new` keyword in business logic
### ❌ Bad

```java
class TaskController {
    private TaskServiceImpl service = new TaskServiceImpl();
}
```

### ✅ Good
```java
class TaskController {
    private TaskService taskService;
}
```

(Spring injects implementation automatically)
### Benefit
- Loose coupling
- Easy testing (mocking)
- Multiple implementations supported

---

## SOLID in Spring Boot (Real Usage)

- `@Service`, `@Repository` → SRP
    
- Interfaces + implementations → DIP
    
- `@Qualifier`, `@Primary` → OCP
    
- Small focused interfaces → ISP