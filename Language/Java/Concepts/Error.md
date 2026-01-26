An **Error** is a **serious problem** that occurs during program execution and **cannot be handled or recovered by the application**.
### Errors are usually caused by:
- JVM issues
- System resource failures
- Hardware or environment problems
### Error Hierarchy
```java
Object
 └── Throwable
      ├── Error
      │    ├── OutOfMemoryError
      │    ├── StackOverflowError
      │    ├── VirtualMachineError
      └── Exception
```
---
### Common Types of Errors

|Error|Meaning|
|---|---|
|`OutOfMemoryError`|JVM runs out of memory|
|`StackOverflowError`|Too deep recursion|
|`VirtualMachineError`|JVM failure|
|`AssertionError`|Assertion fails|

---
### ❌ Why Errors Are Not Handled?
Because:
- They indicate **serious system failure**
- Application **cannot recover**
- Handling may hide real issues

📌 That’s why we **do not write try-catch for Error**.

---
### Error vs Exception (Interview Favorite)

|Error|Exception|
|---|---|
|Serious system issue|Application issue|
|Not recoverable|Recoverable|
|Caused by JVM|Caused by program|
|Should not be handled|Should be handled|