### Overview
- Old I/O API
- Introduced in Java 1.0
- **Stream-based** (sequential data flow)
### Types of Streams
1. **Byte Streams** (Binary data)
    - `InputStream`
    - `OutputStream`
        
2. **Character Streams** (Text data)
    - `Reader`
    - `Writer`

---
### Common Classes

|Class|Purpose|
|---|---|
|`File`|Represents file or directory|
|`FileInputStream`|Read binary data|
|`FileOutputStream`|Write binary data|
|`FileReader`|Read text|
|`FileWriter`|Write text|
|`BufferedReader`|Fast text reading|
|`BufferedWriter`|Fast text writing|
|`PrintWriter`|Easy formatted writing|
Example (java.io)
```java
FileWriter fw = new FileWriter("data.txt");
fw.write("Hello Java");
fw.close();
```

### Limitations
- Slower
- Blocking I/O
- Less support for modern file operations