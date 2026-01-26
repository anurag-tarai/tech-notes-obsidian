### Problem
Different OS uses different file separators:

| OS            | Separator |
| ------------- | --------- |
| Windows       | `\`       |
| Linux / macOS | `/`       |

❌ Bad Practice
```java
"C:\\Users\\Anurag\\file.txt"
```

Best Practice (Portable Code)
```java
File file = new File("data" + File.separator + "file.txt");
```

or
```java
Paths.get("data", "file.txt");
```
Java internally converts separators correctly for the OS.