Create custom exception:
```java
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}
```

Use it:
```java
if (age < 18) {
    throw new InvalidAgeException("Not eligible");
}
```

