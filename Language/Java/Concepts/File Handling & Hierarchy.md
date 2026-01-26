This is just for overview, upto 2. is enough for interview
# **1️⃣ File Handling (`java.io.File`)**
```java
java.lang.Object
   │
   └── java.io.File
```

**File class**
- Represents a **file or directory path** in the filesystem.
- Can **create, delete, check existence**, or get metadata (name, path, size).
- **Cannot read/write content** directly.

**Common Methods:**
- `exists()`, `isFile()`, `isDirectory()`, `createNewFile()`, `delete()`, `mkdir()`, `listFiles()`, `getAbsolutePath()`
---
# **2️⃣ Streams in Java**

Java I/O streams is divided into **2 categories**:
1. **Byte Streams (read/write bytes)**
2. **Character Streams (read/write characters)**
    
---

#### **2A. Byte Streams (for all file types including binary)**

```java
java.lang.Object
   │
   └── java.io.InputStream (abstract)
         ├── FileInputStream
         ├── BufferedInputStream
         ├── DataInputStream
         └── ObjectInputStream

java.lang.Object
   │
   └── java.io.OutputStream (abstract)
         ├── FileOutputStream
         ├── BufferedOutputStream
         ├── DataOutputStream
         └── ObjectOutputStream
```
**Notes:**

- `FileInputStream` / `FileOutputStream` → for reading/writing bytes to files.
    
- `BufferedInputStream` / `BufferedOutputStream` → wraps a byte stream, improves performance using a buffer.
    
- `DataInputStream` / `DataOutputStream` → read/write **primitive data types**.
    
- `ObjectInputStream` / `ObjectOutputStream` → read/write **Java objects (serialization)**.
    

---

#### **2B. Character Streams (for text files)**

```java
java.lang.Object
   │
   └── java.io.Reader (abstract)
         ├── FileReader
         ├── BufferedReader
         ├── CharArrayReader
         └── InputStreamReader (byte → char bridge)

java.lang.Object
   │
   └── java.io.Writer (abstract)
         ├── FileWriter
         ├── BufferedWriter
         ├── CharArrayWriter
         └── OutputStreamWriter (char → byte bridge)
```

**Notes:**

- `Reader` and `Writer` → abstract classes for character streams.
    
- `FileReader` / `FileWriter` → read/write **text files**, use default charset.
    
- `BufferedReader` / `BufferedWriter` → buffer data, improve performance, provide convenient methods (`readLine()`, `newLine()`).
    
- `InputStreamReader` / `OutputStreamWriter` → **bridge classes** converting byte streams ↔ character streams, can specify encoding.
    
- `CharArrayReader` / `CharArrayWriter` → read/write from memory char arrays instead of files.
    

---

## **3️⃣ Utility / Helper Streams**

- **PrintWriter** → write text with `print()` / `println()` methods, often used for formatted output.
    
- **PushbackReader** → can “unread” characters for parsing tasks.
    
- **LineNumberReader** → tracks line numbers while reading text.
    
- **RandomAccessFile** → allows **reading/writing at specific file positions** (both byte and char access).
    

---

## **4️⃣ Visual Summary Hierarchy**

 ```java
java.lang.Object
│
├── java.io.File
│
└── java.io.*Stream / Reader / Writer
    │
    ├── Byte Streams
    │   │
    │   ├── InputStream (abstract)
    │   │   ├── FileInputStream
    │   │   ├── BufferedInputStream
    │   │   ├── DataInputStream
    │   │   └── ObjectInputStream
    │   │
    │   └── OutputStream (abstract)
    │       ├── FileOutputStream
    │       ├── BufferedOutputStream
    │       ├── DataOutputStream
    │       └── ObjectOutputStream
    │
    └── Character Streams
        │
        ├── Reader (abstract)
        │   ├── FileReader
        │   ├── BufferedReader
        │   ├── CharArrayReader
        │   └── InputStreamReader
        │
        └── Writer (abstract)
            ├── FileWriter
            ├── BufferedWriter
            ├── CharArrayWriter
            └── OutputStreamWriter
 ```

---

✅ **Key Takeaways:**

1. **File** → metadata operations only (create, delete, path info).
    
2. **Byte streams** → for all file types, low-level bytes, `InputStream/OutputStream`.
    
3. **Character streams** → for text files, `Reader/Writer` hierarchy.
    
4. **Buffered classes** → always wrap a stream for **performance**.
    
5. **Bridge classes** → convert **bytes ↔ characters** (`InputStreamReader`, `OutputStreamWriter`).