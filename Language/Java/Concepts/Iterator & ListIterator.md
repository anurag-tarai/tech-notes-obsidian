## **1️⃣ Iterator**

### Definition:

> An `Iterator` is used to **traverse a collection** (forward only) and optionally **remove elements** during iteration.

### Key Points:
- Works for **all Collection types** (`List`, `Set`, `Queue`)
- **Forward traversal only**
- Methods:
    - `hasNext()` → checks if more elements exist
    - `next()` → returns next element
    - `remove()` → removes last returned element
### Example:

```java
List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
Iterator<String> it = list.iterator();

while(it.hasNext()) {
    String s = it.next();
    if(s.equals("B")) it.remove(); // remove element B
}
System.out.println(list); // [A, C]
```
---

## **2️⃣ ListIterator**

### Definition:

> `ListIterator` is **an enhanced iterator for Lists** that allows **bidirectional traversal** and **modification** during iteration.

### Key Points:

- Works **only for List** (`ArrayList`, `LinkedList`)
- Can move **forward and backward**
- Can **add** or **modify** elements
- Methods:
    - `hasNext()`, `next()` → forward
    - `hasPrevious()`, `previous()` → backward
    - `add(element)` → insert new element        
    - `set(element)` → replace last returned element
    - `remove()` → remove last returned element

### Example:
```java
List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
ListIterator<String> it = list.listIterator();

// Forward iteration
while(it.hasNext()) {
    String s = it.next();
    if(s.equals("B")) it.set("X"); // replace B with X
}

// Backward iteration
while(it.hasPrevious()) {
    System.out.print(it.previous() + " "); // prints C X A
}
System.out.println(list); // [A, X, C]
```