
- **Purpose:**  
    Used to **write raw bytes** to a file — ideal for **binary data** (images, PDFs, audio).  
    Similar to `FileWriter`, but works at a **byte level** instead of characters.
---
#### **Basic Example – Write Text**

```java
try (FileOutputStream output = new FileOutputStream("filename.txt")) {
    String text = "Hello World!";
    output.write(text.getBytes());
    System.out.println("Successfully wrote to file.");
} catch (IOException e) {
    System.out.println("Error writing file.");
}
```

👉 Creates or overwrites the file with the given content.

---
#### **Copy Binary File Example**

```java
try (FileInputStream input = new FileInputStream("image.jpg");
     FileOutputStream output = new FileOutputStream("copy.jpg")) {

    int b;
    while ((b = input.read()) != -1) {
        output.write(b);
    }
    System.out.println("File copied successfully.");
}
```

👉 Can copy any type of file (text, image, audio, PDF).

---
#### **Append to File**

```java
try (FileOutputStream output = new FileOutputStream("filename.txt", true)) {
    output.write("\nAppended text!".getBytes());
}
```

👉 Adds new content to the end of an existing file instead of overwriting it.
- Pass `true` as second argument

---
#### **When to Use**

| Class                | Best For                         |
| -------------------- | -------------------------------- |
| **FileWriter**       | Simple text writing              |
| **BufferedWriter**   | Large text files (faster)        |
| **FileOutputStream** | Binary files or raw byte control |

**Tip:**  
Use `FileOutputStream` for **binary data** or when precise **byte-level writing** is required.