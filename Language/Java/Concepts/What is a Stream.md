A **Stream** is a sequence of elements that supports **functional-style operations** to process data.

Important points:
- A stream **does not store data**
- It **processes data from collections**
- It supports **pipeline operations**
- It can run **sequentially or in parallel**

Example:
```java
List<Integer> list = List.of(1,2,3,4,5);

list.stream()
    .filter(x -> x % 2 == 0)
    .forEach(System.out::println);
```
---
