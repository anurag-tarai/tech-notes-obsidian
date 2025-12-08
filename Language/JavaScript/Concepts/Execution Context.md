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
Read : [Lexical Environment, Variable Environment, this Binding, arguments Object](Lexical%20Environment,%20Variable%20Environment,%20this%20Binding,%20arguments%20Object.md)
### **3. Eval Execution Context** (rarely used)

- For code inside `eval()` (almost never asked)

---
## **What happens inside an Execution Context?**

Each Execution Context has **two phases**:

### **1. Memory Creation Phase**

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

```js

/* Basics :
-Execution Contex : An execution context is an abstract concept that includes all the necessary information to execute a piece of code, it consist of -variable environment,-Lexical Environment,-This binding
>global ec, function ec, eval ec

-Call Stack : The call stack is a data structure used to manage the execution context of JavaScript code. It follows the Last In, First Out (LIFO) principle, meaning the last function added to the stack is the first one to be executed.
*/

// HOW CODE EXECUTE IN JAVASCRIPT ?-------------------------------------------------------------

// In two phase : 1. Memory creation phase and 2. Execution Phase

// Example --------------------
let val1 = 10
let val2 = 5
function add(num1,num2){
     let total = num1 + num2
     return total
}
let result1 = add(val1,val2)
let result2 = add(10,2)
//-----------------------------
// Step 1 : Global Execution Context(global environment) will create, and allocate to 'this'

// Step 2 : Memory Phase.
/*
stores :
val1 -> undefined
val2 -> undefined
add -> definition
result1 -> undefined
result2 -> undefined
*/

// step 3 : Execution phase/context
/* for result1---------------------
val1 <- 10
val2 <- 5
result1 <- 15 // after delete of below EC the value we get is stored in result1

add -> create new execution context : new variable environment + Execution Thread
and for add same Memory Creation and Execution phase will repeat.
Memory Phase :
val1 -> undefined
val2 -> undefined
total -> undefined
Execution Phase/context:
num1 -> 10
num2 -> 5
total -> 15
G.E.C <- total
Delete this Execution Context
*/
/* for result2-------------
same will repeat////
 */
/*----------------------------------------------------------------------------*/
// -----Call Stack ---------
/*
   |                |
   ------------------
   |                |
   ------------------
   |                |
   ------------------
   | Global E.C.    |
   ------------------
// During the execution of the any block of Js code the first Global Execution Context will enter the call stack.

*/
/* go to source of web page and there you can create snippet : check call stack,Dom break points,global listener,Event Listener breakpoints,.. */
```