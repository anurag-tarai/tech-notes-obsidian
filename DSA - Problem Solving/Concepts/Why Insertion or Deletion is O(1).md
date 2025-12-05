### Reason 1: No shifting like arrays
In arrays:
- To insert at index 0, all elements shift right → O(n).
- To delete element at index 2, all elements shift left → O(n).

In LinkedList:
- Each element has a pointer to the next.
- You only reconnect pointers, no shifting.
### **Insertion at Head (O(1))**
Steps:
1. Create new node
2. Set newNode.next = head
3. Move head to newNode

Constant time — no traversal, no shifting.

### **Deletion at Head (O(1))**

Steps:
1. head = head.next
2. Node automatically gets garbage-collected

Constant time.
### **Insertion at Tail (O(1))**

(Because we maintain tail pointer)
Steps:
1. tail.next = newNode
2. tail = newNode
Constant time.

### ⚠ Important Clarification

Only these three operations are truly **O(1)**:
- Insert at head
- Insert at tail (when tail is maintained)
- Remove at head

All other operations like inserting at a middle index require traversal → O(n).