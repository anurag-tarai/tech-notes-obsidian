##  Stack
- Stores **primitive values** (number, string, boolean, null, undefined, symbol, bigint).
- Stores **references (pointers)** to objects in the heap.
- Very fast, fixed-size memory.
- Values are stored **directly**.
- When reassigned, old value is **discarded** (overwritten).
### **Example**

```js
let a = 10;   // stored directly in stack
let b = a;    // copy made → independent
a = 20;       // b remains 10
```

### **ASCII Diagram (Stack)**

```js
STACK (Memory)
+------------------+
| b : 10           |
+------------------+
| a : 20           |
+------------------+
```

---

##  Heap
- Stores **objects, arrays, functions**. (Reference or Not Primitive Data Types)
- Dynamic, flexible memory.
- Variables keep a **reference (pointer)** to heap memory.
- Two variables can reference the **same object**.
### **Example**
```js
let obj1 = { age: 20 };  // stored in heap
let obj2 = obj1;         // copies reference, not value
obj1.age = 30;           // obj2 also sees 30
```
### **ASCII Diagram (Heap + Stack)**

```js
STACK                                HEAP
+------------------+          +----------------------+
| obj2 : ref ------|--------> | { age: 30 }          |
+------------------+     |    +                      +
| obj1 : ref ------|-----+    |                      |
+------------------+          +----------------------+

```

---

# **📌 Key Differences**
| Stack                          | Heap                              |
| ------------------------------ | --------------------------------- |
| Stores primitives & references | Stores objects, arrays, functions |
| Very fast                      | Slower                            |
| Fixed-size                     | Dynamic memory                    |
| Data stored directly           | Data stored by reference          |
| Cleared when scope ends        | Cleared by garbage collector      |
DEEP DIVE :- https://pashazade-nazar.medium.com/memory-life-cycle-heap-stack-call-stack-string-pool-bba2569524cb