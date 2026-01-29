> **Inversion of Control (IoC)** is a design principle where **the control of creating objects and managing their dependencies is transferred from the program to a container or framework**.

👉 Instead of _your code controlling objects_, the **framework controls them**.
### Without IoC (Traditional Approach)
```java
class Car {
    Engine engine = new Engine(); // tightly coupled
}
```
#### ❌ Problems
- Tight coupling
- Hard to change implementations
- Difficult to test
- Less flexible
#### With IoC
```java
@Component
class Engine { }

@Component
class Car {
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
}
```
#### ✔ Benefits:
- Loose coupling
- Easy to replace implementations
- Better testability
- More maintainable code

