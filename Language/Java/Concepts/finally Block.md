- Executes **always**
- Used for **resource cleanup**
```java
try {
    int a = 10 / 2;
} catch (Exception e) {
    System.out.println("Error");
} finally {
    System.out.println("Always executed");
}
```
### Uses:
- Closing files
- Closing database connections
