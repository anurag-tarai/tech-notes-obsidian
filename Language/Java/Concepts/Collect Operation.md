`collect()` converts a stream into a collection.

Uses:
```java
Collectors.toList()
```

Example:
```java
List<Integer> result =  
list.stream()  
    .filter(x -> x > 5)  
    .collect(Collectors.toList());
```

---