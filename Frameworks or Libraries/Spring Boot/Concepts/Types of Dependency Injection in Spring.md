**Dependency Injection (DI)** is a design pattern where **an object’s dependencies are provided from outside rather than created by the object itself**.  

DI is one way to implement **Inversion of Control (IoC)**.

---

## 1️⃣ Constructor Injection (Recommended ⭐)

Dependencies are injected through the constructor.
```java
@Component
class Car {
    private final Engine engine; // final ensures dependency is mandatory and immutable

    public Car(Engine engine) {
        this.engine = engine;
    }

    void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}
```
### ✔ Benefits:

- Ensures **mandatory dependencies** (cannot create Car without Engine)
    
- Dependencies are **immutable** (`final`) → cannot be reassigned
    
- **Easy to test** without Spring
    
- Clear and explicit: anyone reading the constructor knows the dependencies
    
- **Thread-safe** reference
    

---

## 2️⃣ Setter Injection

Dependencies are injected using setter methods.

```java
@Component
class Car {
    private Engine engine;

    @Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}
```
### ⚠️ Pros & Cons:

✔ Useful for **optional dependencies**  
❌ Object can exist in **invalid state** (engine may be null)  
❌ Dependency can be **changed after creation** → risky  
✔ Testable without Spring if you call the setter

---

## 3️⃣ Field Injection (Not Recommended ❌)

Dependencies are injected directly into fields.

```java
@Component
class Car {
    @Autowired
    private Engine engine;

    void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}
```
### ❌ Problems:

- **Hidden dependency** → you cannot see required dependencies from constructor
    
- **Cannot test** without Spring (`engine` will be null)
    
- Object can be **in invalid state**
    
- **Not recommended** for production code
    

---

## Key Notes

- **Constructor injection is preferred** for mandatory dependencies
    
- **Setter injection is for optional dependencies**
    
- **Field injection should be avoided**
    
- Using **`final`** with constructor injection ensures **immutability, thread-safety, and clarity**