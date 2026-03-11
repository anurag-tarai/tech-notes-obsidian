## collect(Collectors.toList()) - Old way
```java
list.stream()
    .collect(Collectors.toList());
```
## New way (Java 16+)
```java
list.stream().toList();
```
---
## Important Difference

