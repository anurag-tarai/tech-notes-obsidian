A **Singly Linked List** is a linear data structure made of **nodes**, where each node stores:
1. `data` → actual value
2. `next` → reference to the next node
Nodes are connected **in one direction only**.

```q
 head →[data] → [data] → [data] → null
```
### Features
- Can move only **forward**
- Uses less memory than doubly linked list (only one pointer)
- Insert/delete at **head is O(1)**
- Searching takes **O(n)**
### When to use
- Lightweight structure
- Insertion at start is frequent
- Memory usage should be minimal

