## Method Overloading
### Definition
Method overloading occurs when **multiple methods** in the **same class**:
- Have the **same name**
- But **different parameter lists**
The method call is **resolved at compile time**.
---
### Rules
✔ Same class  
✔ Same method name  
✔ Different:
- Number of parameters **OR**
- Type of parameters **OR**
- Order of parameters  
    ❌ Return type alone cannot differentiate methods

---
```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```
### Key Points
- Also called **Static Polymorphism**
- Method selection depends on **arguments**
- Faster than runtime polymorphism