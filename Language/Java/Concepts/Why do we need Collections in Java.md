### 1️⃣ Arrays have limitations

Before collections, Java mainly used **arrays**, but arrays have problems:
- ❌ Fixed size (cannot grow or shrink)
- ❌ No built-in methods for searching, sorting, inserting, deleting
- ❌ Can store only **same type of data**
- ❌ Manual logic required → more bugs

👉 Collections solve all these issues.

---
### 2️⃣ Dynamic size
- Collections can **grow and shrink at runtime**
- Example: `ArrayList`, `HashMap`

```java
List<Integer> list = new ArrayList<>();
list.add(10);
list.add(20);
```
No need to worry about size 👌

---
### 3️⃣ Ready-made data structures
Collections provide different structures for different needs:
- `List` → ordered data, duplicates allowed
- `Set` → unique data
- `Queue` → FIFO processing
- `Map` → key-value pairs

👉 You don’t need to implement these from scratch.

---
### 4️⃣ Better performance
- Optimized implementations like:
    - `HashMap` → fast search
    - `ArrayList` → fast access [Read Here..](Why%20ArrayList%20access%20is%20called%20“fast”.md)
    - `LinkedList` → fast insert/delete

You choose the right collection based on use case.

---
### 5️⃣ Standardized API
- Same methods across collections (`add`, `remove`, `size`, `iterator`)
- Easy to learn and use
- Code becomes **clean, readable, and consistent**

Imagine this nightmare :
```java
ArrayList → addItem()
HashSet   → insert()
LinkedList → push()

// But in collection
list.add(10);
set.add(10);
queue.add(10);

list.remove(10);
set.remove(10);
```
---

### 6️⃣ Support for Generics
- Type safety at compile time
- No need for casting

```java
List<String> names = new ArrayList<>();
```

---