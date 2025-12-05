## 1. ARRAY
#### [Memory Allocation and Storage for Java Arrays](https://medium.com/@AlexanderObregon/memory-allocation-and-storage-for-java-arrays-c68b64ba08bb)
### Definition:
An array stores elements in **continuous (contiguous) memory locations**.
### Properties
- **Fixed Size:** Must decide size when creating the array.
- **Contiguous Memory:** All elements stay next to each other in RAM.
- **Costly Insert/Delete (O(n)):** Because shifting is required.

### Diagram: Array in memory
```bash
Index:   0     1     2     3     4
        +-----+-----+-----+-----+-----+
Value:  | 10  | 20  | 30  | 40  | 50  |
        +-----+-----+-----+-----+-----+
Memory: 1000 1004 1008 1012 1016 (continuous)
```
All elements are stored _back-to-back_.
### Example: Insert a value at index 2**

Insert **99** at index **2**:

Before:
`10 20 30 40 50`

After:
`10 20 99 30 40 50`

👉 **Problem:**  
To insert 99, elements `[30, 40, 50]` must shift right → **O(n)**.
### Example: Delete at index 1

Delete value at index **1**:

Before:
`10 20 30 40 50`

After:
`10 30 40 50`

Elements shift left → **O(n)**.

---
## 2. LINKED LIST

### ✅ **Definition:**

A Linked List stores data in **separate nodes**, each containing:
- **data**
- **pointer/reference to next node**

Nodes can be anywhere in memory.

### Properties
- **Dynamic Size:** Grows or shrinks as needed.
- **No Contiguous Memory:** Nodes stored anywhere.
- **Fast Insert/Delete (O(1)):** If pointer is known.
### Diagram: Linked List in memory

```bash
 Node1           Node2          Node3
+-------+      +-------+      +-------+
|  10   | ---> |  20   | ---> |  30   |
| next  |      | next  |      | next  |
+-------+      +-------+      +-------+
   ^              ^              ^
 memory:       memory:        memory:
 5000           9200           1500   (NOT continuous) And stored in heap memory
```

Nodes can be anywhere in RAM (Heap) — linked through pointers.

### Example: Insert 99 after node containing 10

Before:
`10 → 20 → 30`

Steps:
- Create a new node: 99
- Point 99 → 20
- Point 10 → 99

After:
`10 → 99 → 20 → 30`

No shifting  
Only pointer changes  
**O(1)** (constant time)
### Example: Delete node 20

Before:
`10 → 20 → 30`

Delete 20:
- Change pointer of 10 → 30

After:
`10 → 30`

 No shifting  
Just skip the node  
 **O(1)**

---

# **Final Clear Comparison**

| Feature         | Array       | Linked List            |
| --------------- | ----------- | ---------------------- |
| Memory          | Contiguous  | Non-contiguous         |
| Size            | Fixed       | Dynamic                |
| Insert (middle) | Slow (O(n)) | Fast (O(1))            |
| Delete (middle) | Slow (O(n)) | Fast (O(1))            |
| Index access    | Fast (O(1)) | Slow (O(n))            |
| Memory usage    | Less        | More (stores pointers) |

---