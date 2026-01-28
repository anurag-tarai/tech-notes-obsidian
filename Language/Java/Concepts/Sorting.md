### Definition:

> Sorting means arranging elements in a **particular order** — ascending or descending.
### How to sort:

- **Natural order** (default) → using `Comparable`
    
- **Custom order** → using `Comparator`
    
- Using **Collections utility class**
    

```java
List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 2));
Collections.sort(list); // ascending
```