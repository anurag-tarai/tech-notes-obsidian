### What is Dependency Injection?

**Dependency Injection (DI)** is a design pattern where **an object’s dependencies are provided from outside rather than being created by the object itself**.

- DI is handled by the IoC container.

```ad-note
DI is a **way to implement Inversion of Control (IoC)**.
```

### Why Dependency Injection?

Without DI, a class is **tightly coupled** to its dependencies.
```java
class Car {
    Engine engine = new Engine(); // tight coupling
}
```
#### Problems:
- Hard to change implementations
- Difficult to test
- Poor maintainability 
### How Dependency Injection Solves This
With DI, dependencies are **provided from outside**, not created internally.
```java
class Car {
    private Engine engine;

    Car(Engine engine) {   // dependency injected
        this.engine = engine;
    }
}
```
#### Benefits:
- **Loose coupling**
- **Easy to switch implementations**
- **Better unit testing**
- **Improved scalability & maintainability**
- **Follows SOLID principles**
