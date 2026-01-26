> When an exception occurs in a method and is **not handled there**,  
> it is **passed (propagated)** to the **calling method**.

This continues **up the call stack** until:
- it is caught, or
- the program terminates.

Simple flow :
```java
method3()  // ← exception occurs here
method2()
method1()
main()
```
If `method3()` doesn’t handle the exception, it goes to `method2()`, then `method1()`, then `main()`.