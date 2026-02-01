> A circular dependency occurs when **two classes depend on each other**, forming a loop that prevents proper object creation.

```java
class A {
    public A(B b) {}
}

class B {
    public B(A a) {}
}
```

### Circular Dependency & Constructor Injection
**What happens:**  
Constructor injection requires **all dependencies at object creation time**.

**Why it fails:**  
If two classes depend on each other via constructors, Spring cannot decide **which one to create first** → startup failure.

### Circular Dependency & Field / Setter Injection
**What happens:**  
Spring:
1. Creates objects **without dependencies**
2. Injects dependencies **after object creation**

This allows Spring to break the cycle.

|Injection Type|Circular Dependency|
|---|---|
|Constructor|❌ Not allowed (fails fast)|
|Field|✔ Allowed (but bad practice)|
|Setter|✔ Allowed|