# BufferedReader and BufferedWriter

`BufferedReader` and `BufferedWriter` make reading and writing **text files** faster.

- `BufferedReader` lets you read text **line by line** with `readLine()`.
- `BufferedWriter` lets you write text efficiently and add new lines with `newLine()`.

These classes are usually combined with `FileReader` and `FileWriter`, which handle opening or creating the file. The buffered classes then make reading/writing **faster** by using a memory buffer.
## BufferedReader
- **Purpose:**  
    Used to **read text efficiently**, especially **large files**.  
    Reads data from a file **line by line** using a memory buffer for speed.
    
---
#### **Basic Example – Read Line by Line**

```java
try (BufferedReader br = new BufferedReader(new FileReader("filename.txt"))) {
    String line;
    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }
} catch (IOException e) {
    System.out.println("Error reading file.");
}
```

👉 Reads each line of the file until the end.  
👉 Faster than `FileReader` or `Scanner` for large files.

---

#### **When to Use**

|Class|Best For|
|---|---|
|**Scanner**|Simple text parsing (words/numbers)|
|**BufferedReader**|Large text files (fast, line-by-line)|
|**FileInputStream**|Binary files (images, PDFs, audio)|

**Tip:**  
Use `BufferedReader` when working with **large text files** for **faster performance** and **line-by-line reading**.