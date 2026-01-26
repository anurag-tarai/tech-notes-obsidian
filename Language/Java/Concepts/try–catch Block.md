### Syntax
```java
try {
    // risky code
} catch (Exception e) {
    // handling code
}
```

### Example
```java
try {
    int a = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}
```
