Purpose: 
    Used to **read raw bytes** from a file — ideal for **binary data** (images, audio, PDFs).  
    Unlike `Scanner`, it provides **low-level control** over file reading.
    
---

#### **Basic Example – Read Text File**
```java
try (FileInputStream input = new FileInputStream("filename.txt")) {
    int i;
    while ((i = input.read()) != -1) {
        System.out.print((char) i);
    }
} catch (IOException e) {
    System.out.println("Error reading file.");
}
```
👉 Reads one byte at a time and prints as characters.

---

#### **Copy Binary File Example**
```java
try (FileInputStream input = new FileInputStream("image.jpg");
     FileOutputStream output = new FileOutputStream("copy.jpg")) {

    int i;
    while ((i = input.read()) != -1) {
        output.write(i);
    }
    System.out.println("File copied successfully.");
} catch (IOException e) {
    System.out.println("Error handling file.");
}
```
👉Can copy **any file type** (text, image, audio, etc.).  
👉 Uses **FileOutputStream** for writing bytes.

---
#### **When to Use**

| Class               | Best For                              |
| ------------------- | ------------------------------------- |
| **Scanner**         | Simple text, parsing words/numbers    |
| **BufferedReader**  | Large text files (fast, line-by-line) |
| **FileInputStream** | Binary data or full byte control      |

**Tip:**  
Use `FileInputStream` when working with **non-text files** or need **raw byte access**.