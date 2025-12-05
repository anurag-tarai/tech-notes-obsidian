An **Execution Context** is the **environment where JavaScript code runs**.  
It decides **what variables, functions, and `this` keyword refer to** when your code is being executed.

---
## **Types of Execution Context**

### **1. Global Execution Context (GEC)**

- Created when the JS file starts running
- `this` → `window` (browser) or `{}` (Node) - [Global Scope Differences - Browser vs. Node.js](Global%20Scope%20Differences%20-%20Browser%20vs.%20Node.js.md)
- Contains global variables and functions
### **2. Function Execution Context (FEC)**

- Created every time a function is called
- Has its own:
    - **Variable Environment**
    - **Lexical Environment**
    - **`this` binding**
    - **arguments object**

### **3. Eval Execution Context** (rarely used)

- For code inside `eval()` (almost never asked)

---
## **What happens inside an Execution Context?**

Each Execution Context has **two phases**:

### **1. Creation Phase**

- Memory is allocated
- Variables → **undefined**
- Functions → stored fully
- Creates:
    - Lexical Environment
    - Variable Environment
    - Outer Environment Reference
    - `this` binding

### **2. Execution Phase**

- JS runs your code line-by-line
- Variables get real values
- Functions execute