> Use **ArrayList** when fast access is needed, and **LinkedList** when frequent insertions or deletions are required.
### 🔹 ArrayList
- Uses a **dynamic array** internally
- Provides **fast random (index-based) access**
```java
List<Integer> list = new ArrayList<>();
list.add(10);
list.add(20);
System.out.println(list.get(0)); // 10
```
✅ **Best for:** Frequent **reading/searching** operations  
❌ **Not suitable for:** Frequent **insert/delete in the middle** (due to shifting)

---
### 🔹 LinkedList
- Uses a **doubly linked list**
- **No fast index-based access** (sequential traversal required)
```java
LinkedList<Integer> list = new LinkedList<>();
list.add(10);
list.addFirst(5);
```
✅ **Best for:** Frequent **insert and delete** operations  
❌ **Not suitable for:** Frequent access using index4

---
### 🔹 ArrayList vs LinkedList (Interview ⭐)
| Feature            | ArrayList            | LinkedList         |
| ------------------ | -------------------- | ------------------ |
| Internal structure | Dynamic array        | Doubly linked list |
| Access speed       | Fast (O(1))          | Slow (O(n))        |
| Insert/Delete      | Slow (start, middle) | Fast               |
| Memory usage       | Less                 | More               |
