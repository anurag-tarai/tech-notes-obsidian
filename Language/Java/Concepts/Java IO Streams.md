# Java IO Streams
**I/O Streams** are used to **read and write data (bytes or characters) between a Java program and various sources or destinations** like files, network connections, or memory.

- The [[java.io & File Class| File class]] (`java.io.File`) provides information about files and directories (e.g., check existence, name, size, create/delete) but **does not handle the actual contents of the file**.
- To **read or write the contents**, we use **I/O Streams**.

```ad-attention
These three are different concepts - [[Stream, IO Stream, Stream API]]
```

---
### Types of I/O Streams
1. **Byte Streams**
    - Handle **binary data** (images, audio, PDFs, etc.).
    - Work with **bytes (`8-bit` data)**.
    - **Examples:** `FileInputStream`, `FileOutputStream`.
2. **Character Streams**
    - Handle **text data** (characters and strings).
    - Automatically manage **character encoding**.
    - **Examples:** `FileReader`, `FileWriter`, `BufferedReader`, `BufferedWriter`.
---
**Tip:**
- Use **Character Streams** for text files.
- Use **Byte Streams** for binary files.

## 1. Byte Streams
#### [[Concepts/FileInputStream]]
#### [[Concepts/FileOutputStream]]

## 2. Character Streams
#### [[Concepts/BufferedReader]]
#### [[Concepts/BufferedWriter]]


