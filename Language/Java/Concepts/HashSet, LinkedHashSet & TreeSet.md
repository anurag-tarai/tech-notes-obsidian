### 🔹 HashSet
- Uses **hashing**
- Allows **one null**

```java
Set<Integer> set = new HashSet<>();
set.add(10);
set.add(10); // ignored
```
---

### 🔹 LinkedHashSet

- Maintains insertion order
    

---

### 🔹 TreeSet
- Sorted set (Ascending)
- No null allowed

```java
Set<Integer> set = new TreeSet<>();
set.add(30);
set.add(10);
```


---
### 🔹 HashSet vs TreeSet

| Feature     | HashSet | TreeSet     |
| ----------- | ------- | ----------- |
| Order       | No      | Sorted      |
| Performance | Faster  | Slower      |
| Null        | Allowed | Not allowed |
