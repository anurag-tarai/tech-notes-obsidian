### **1️⃣ Definition**

|Feature|Fail-Fast|Fail-Safe|
|---|---|---|
|**Behavior**|Throws **ConcurrentModificationException** if collection is modified while iterating|Does **not throw exception** if collection is modified while iterating|
|**How**|Iterates **directly on original collection**|Iterates on a **clone / copy** of the collection|
|**Example classes**|`ArrayList`, `HashMap`, `HashSet`|`CopyOnWriteArrayList`, `ConcurrentHashMap`|
|**Performance**|Faster (direct iteration)|Slower (copy/clone overhead)|

---

### **2️⃣ Fail-Fast Example**
```java
List<String> list = new ArrayList<>();
list.add("Java");
list.add("Python");

for(String s : list) {
    list.add("C++"); // modifying during iteration
}
```
⚠ Output: **ConcurrentModificationException**

- ArrayList iterator is **fail-fast** → cannot modify collection while iterating
    

---

### **3️⃣ Fail-Safe Example**
```java
List<String> list = new CopyOnWriteArrayList<>();
list.add("Java");
list.add("Python");

for(String s : list) {
    list.add("C++"); // allowed
}

System.out.println(list); // [Java, Python, C++]
```
- CopyOnWriteArrayList iterator is **fail-safe** → works on a **separate copy**
    

---

### **4️⃣ Key Points for Interviews**

- **Fail-Fast** → **direct iteration**, throws exception on modification
    
- **Fail-Safe** → **works on copy**, no exception, slower
    
- **Fail-Fast** = `ArrayList`, `HashMap`, `HashSet`
    
- **Fail-Safe** = `ConcurrentHashMap`, `CopyOnWriteArrayList`