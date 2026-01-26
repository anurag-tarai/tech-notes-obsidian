## 🧩 1️⃣ What is a **Stream** (General Meaning)?

In Java, a **stream** simply means a **flow of data**/sequence of data.

It can be:

- A flow of **bytes or characters** (in case of input/output operations)
    
- A flow of **objects** (in case of the Stream API for collections)

---

## 🧱 2️⃣ What is an **I/O Stream** (java.io package)?

I/O Stream = Input/Output Stream  
These are used for **reading and writing data** (files, keyboard input, network sockets, etc.).

I/O Streams deal with **data transfer** between a **Java program** and **external sources**.

### 🔹 Types of I/O Streams:

There are **two main categories:**

|Type|Description|Example Classes|
|---|---|---|
|**Byte Streams**|Handle binary data (e.g., images, audio files).|`InputStream`, `OutputStream`, `FileInputStream`, `FileOutputStream`|
|**Character Streams**|Handle text data (characters).|`Reader`, `Writer`, `FileReader`, `FileWriter`|
## ⚙️ 3️⃣ What is the **Stream API** (java.util.stream package)?

The **Stream API** was introduced in **Java 8** to **process data in collections (like Lists, Sets, Maps)** in a **functional, declarative way** — using methods like `map`, `filter`, `reduce`, etc.

This is **not related** to I/O operations.