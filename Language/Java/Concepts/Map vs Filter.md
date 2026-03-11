### Filter
Select elements based on condition.
```java
list.stream()  
    .filter(x -> x > 10);
```

---
### Map
Transform elements.
```java
list.stream()  
    .map(x -> x * 2);
```

Example:
```java
Input : [1,2,3]  
map(x->x*2)  
  
Output : [2,4,6]
```