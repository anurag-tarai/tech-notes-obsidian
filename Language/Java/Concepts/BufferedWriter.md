
- **Purpose:**  
    Used to **write text efficiently** to files, especially **large text files**.  
    Works with `FileWriter` and uses a **buffer** to improve performance.
---
#### **Basic Example – Write to File**
```java
try (BufferedWriter bw = new BufferedWriter(new FileWriter("filename.txt"))) {
    bw.write("First line");
    bw.newLine(); // line break
    bw.write("Second line");
    System.out.println("Successfully wrote to the file.");
} catch (IOException e) {
    System.out.println("Error writing file.");
}
```

👉 Writes multiple lines efficiently.  
👉 Overwrites the file if it already exists.

---
#### **Append to File**
```java
try (BufferedWriter bw = new BufferedWriter(new FileWriter("filename.txt", true))) {
    bw.newLine();
    bw.write("Appended line");
}
```

👉 Adds new content at the end of the file instead of replacing it.

---

#### **When to Use**

|Class|Best For|
|---|---|
|**FileWriter**|Simple text writing|
|**BufferedWriter**|Large text files (faster, easy line breaks)|
|**FileOutputStream**|Binary files (images, PDFs, audio)|

**Tip:**  
Use `BufferedWriter` for **fast text writing** and easy **line-by-line output**.