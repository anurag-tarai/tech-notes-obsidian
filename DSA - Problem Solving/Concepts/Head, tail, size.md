### **Head**
- A reference pointing to the **first node** of the linked list.
- If head is `null`, the list is empty.
### **Tail**
- A reference pointing to the **last node** of the list.
- Helps in O(1) insertion at the end.
- Tail’s `next` is always `null`.
### **Size**
- Keeps count of how many nodes are present.
- Helps avoid traversing for counting every time.
### Example:
```js
head → [10] → [20] → [30] → null
                       ↑
                      tail
size = 3
```