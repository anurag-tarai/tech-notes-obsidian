> Bounded types restrict the type parameter to a specific type or its subclasses.
### Why?
To ensure only certain types are allowed.
### Upper Bounded Type (`extends`)
```java
class Box<T extends Number> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
```

✔ Allowed:
```java
Box<Integer> b1 = new Box<>();
Box<Double> b2 = new Box<>();
```

❌ Not Allowed:
```java
Box<String> b3 = new Box<>(); // Error
```
👉 `T extends Number` means T can be `Number` or its subclasses.

### Multiple Bounds
```java
class Test<T extends Number & Comparable<T>> {
}
```
✔ T must:
- Extend `Number`
- Implement `Comparable`
