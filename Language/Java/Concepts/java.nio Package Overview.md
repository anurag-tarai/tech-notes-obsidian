### Overview
- Introduced in Java 1.4 (enhanced in Java 7)  
- **Buffer-based**
- Faster and more scalable
- Supports **non-blocking I/O**
### Important Packages
```java
java.nio
java.nio.file
java.nio.channels
```
### Key Classes & Interfaces

| Class     | Purpose              |
| --------- | -------------------- |
| `Path`    | Represents file path |
| `Paths`   | Create Path objects  |
| `Files`   | File operations      |
| `Channel` | Read/write data      |
| `Buffer`  | Data container       |
Example (java.nio)
```java
Path path = Paths.get("data.txt");
Files.write(path, "Hello NIO".getBytes());
```
### Advantages over `java.io`
- Faster
- Less boilerplate code
- Better exception handling
- Supports large files
- Asynchronous I/O