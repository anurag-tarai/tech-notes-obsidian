## **Project: Terminal-Based File Analyzer**

**Objective:**  
Create a **menu-driven terminal application** to interact with a text file using **File class** and **I/O streams**.

---
### **Features / Menu**

1. **Show File Info**
    
    - Display file name, path, size, and whether it exists.
        
2. **Analyze File Content**
    
    - Count and display:
        
        - Number of lines
            
        - Number of words
            
        - Number of characters
            
3. **Append Text**
    
    - Let the user type text in the terminal to append to the file.
        
    - Ensure existing content is not overwritten.
        
4. **Display File Content (Optional)**
    
    - Print the entire content of the file in the terminal.
        
5. **Exit**
    
    - Exit the application safely.
        

---

### **Technical Requirements / Hints**

- Use `Scanner` to read user input from terminal.
    
- Use **`File` class** for file existence, name, size, etc.
    
- Use **BufferedReader** / **BufferedWriter** or FileReader / FileWriter for reading and writing.
    
- Implement **try-with-resources** to automatically close streams.
    
- Handle exceptions like `IOException`.
    
- Use loops to **keep the menu active** until the user chooses Exit.
    

---

### **Learning Outcome**

- Menu-driven **terminal interaction**
    
- File creation, info, reading, writing, appending
    
- Handling user input and exceptions
    
- Reinforces **File vs I/O stream vs Stream API concepts** in practice