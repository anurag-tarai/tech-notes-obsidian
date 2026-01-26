# Java File Handling – Complete Syllabus

---

## 1. Basics of File Handling

- What is File Handling?
    
- Why File Handling is needed?
    
- File vs Directory
    
- Relative path vs Absolute path
    
- File separators (`/` vs `\`)
    
- java.io package overview
    
- java.nio package overview
    

---

## 2. `File` Class (java.io.File) `VERY IMPORTANT`

- Creating File object
    
- Creating a new file
    
- Creating directory & sub-directory
    
- Checking file existence
    
- File properties:
    
    - getName()
        
    - getPath()
        
    - getAbsolutePath()
        
    - length()
        
    - lastModified()
        
- File checks:
    
    - exists()
        
    - isFile()
        
    - isDirectory()
        
    - canRead()
        
    - canWrite()
        
- Listing files:
    
    - list()
        
    - listFiles()
        
- Deleting file / directory
    
- Renaming file
    

---

## 3. Byte Stream Classes `IMPORTANT`

(Used for **binary data** like images, pdfs)

### Input Streams

- InputStream (abstract)
    
- FileInputStream
    
- read()
    
- read(byte[])
    

### Output Streams

- OutputStream (abstract)
    
- FileOutputStream
    
- write(int)
    
- write(byte[])
    

---

## 4. Character Stream Classes `IMPORTANT`

(Used for **text data**)

### Reader Classes

- Reader (abstract)
    
- FileReader
    
- read()
    
- read(char[])
    

### Writer Classes

- Writer (abstract)
    
- FileWriter
    
- write()
    
- append()
    

---

## 5. Buffered Streams `VERY IMPORTANT`

(Improves performance)

### Buffered Byte Streams

- BufferedInputStream
    
- BufferedOutputStream
    

### Buffered Character Streams

- BufferedReader
    
- BufferedWriter
    
- readLine()
    
- newLine()
    

---

## 6. Scanner Class (java.util.Scanner)

- Reading data from file
    
- Scanner vs BufferedReader
    
- next()
    
- nextLine()
    
- hasNextLine()
    
- Use cases
    

---

## 7. Serialization & Deserialization `IMPORTANT`

- What is Serialization?
    
- Serializable interface
    
- ObjectOutputStream
    
- ObjectInputStream
    
- transient keyword
    
- serialVersionUID
    
- Advantages & use cases
    

---

## 8. Try-With-Resources `VERY IMPORTANT`

- What is try-with-resources?
    
- Auto-closeable interface
    
- Why it is better than finally block
    
- Multiple resources handling
    

---

## 9. Exception Handling in File I/O

- IOException
    
- FileNotFoundException
    
- EOFException
    
- Handling multiple exceptions
    
- throws vs try-catch
    

---

## 10. File Permissions & Security

- Read / Write permissions
    
- setReadable()
    
- setWritable()
    
- setExecutable()
    
- SecurityManager (basic idea)
    

---

## 11. Java NIO (New I/O) `MODERN & IMPORTANT`

(java.nio, java.nio.file)

### Path & Paths

- Path interface
    
- Paths.get()
    

### Files Utility Class

- createFile()
    
- createDirectory()
    
- copy()
    
- move()
    
- delete()
    
- exists()
    
- readAllLines()
    
- write()
    

---

## 12. Channels & Buffers (Advanced – Optional)

- FileChannel
    
- ByteBuffer
    
- Non-blocking I/O (basic idea)
    
- When NIO is preferred over IO
    

---

## 13. ZIP File Handling

- ZipInputStream
    
- ZipOutputStream
    
- Reading & writing zip files
    

---

## 14. File Handling with Streams API (Java 8)

- Files.lines()
    
- Stream of file lines
    
- Filtering file content
    
- Collecting data
    

---

## 15. Common File Handling Scenarios (Interview Focus)

- Read a file line by line
    
- Write data into a file
    
- Append data to file
    
- Copy one file to another
    
- Count number of lines/words
    
- Search a word in file
    
- Merge two files
    
- Delete all files in directory
    

---

## 16. File Handling Best Practices

- Close resources properly
    
- Use buffering
    
- Use NIO for large files
    
- Handle exceptions correctly
    
- Avoid hardcoded paths
    
- Use try-with-resources
    

---

## 17. Frequently Asked Interview Questions

- FileReader vs BufferedReader
    
- FileInputStream vs FileReader
    
- Scanner vs BufferedReader
    
- IO vs NIO
    
- Serialization vs Externalization
    
- What is transient?
    
- How to read large files efficiently?
    
- Why buffering improves performance?
    

---

## 18. Mini Programs to Practice

- Create file & write data
    
- Read file line by line
    
- Copy file content
    
- Serialize & deserialize object
    
- Count word frequency in file
    
- Read CSV file