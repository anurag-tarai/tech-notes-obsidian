# ❌ **ArrayList does NOT use LinkedList internally**

### **ArrayList → uses an array internally**

Specifically:

`Object[] elementData;`

This is a **dynamic array**, not a linked list.

---

# ❌ **LinkedList does NOT use arrays**

LinkedList uses **Node objects**, each with:

`Node {     E data;     Node next;     Node prev; }`

---

# ✅ Clear Difference

| Feature              | ArrayList           | LinkedList                |
| -------------------- | ------------------- | ------------------------- |
| Internal structure   | **Resizable array** | **Doubly-linked nodes**   |
| Access               | O(1) random access  | O(n) slow access          |
| Insert/Delete middle | O(n) shifting       | O(1) if you have the node |
| Memory usage         | Compact             | Heavy (many node objects) |