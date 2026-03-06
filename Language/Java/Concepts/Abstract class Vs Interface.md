Abstract class is used when classes are closely related and need to share common implementation. It defines an IS-A relationship and can contain abstract methods, concrete methods, constructors, and instance variables.

Interface is used to define a contract or capability that a class can implement. It represents a CAN-DO relationship. By default, interface methods are public and abstract, and from Java 8 onward, it can also contain default and static methods. It supports multiple inheritance.
# ✅ Abstract Class

### 🔹 Definition

> An abstract class is used when multiple classes are closely related and share common code. It defines an **IS-A relationship**.

### 🔹 Key Points

- Cannot be instantiated
    
- Can contain:
    
    - Abstract methods
        
    - Concrete methods
        
    - Constructors
        
    - Instance variables
        
- Used to provide **partial implementation**
    
- Supports **single inheritance only**
    

### 🔹 Example Idea

Dog **is an** Animal → IS-A relationship  
So Animal can be an abstract class.

---

# ✅ Interface

### 🔹 Definition

> An interface defines a **CAN-DO relationship**. It specifies what a class can do, not what it is.

### 🔹 Key Points

- Methods are:
    
    - `public abstract` by default
        
- Variables are:
    
    - `public static final` (constants)
        
- Cannot have constructors
    
- Supports **multiple inheritance**
    
- From Java 8:
    
    - Can have `default` methods
        
    - Can have `static` methods
        

### 🔹 Example Idea

Dog **can run**  
Bird **can fly**  
So Runable / Flyable → interface

---