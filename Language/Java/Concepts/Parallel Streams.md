Streams can run in **parallel** for better performance.
```java
list.parallelStream()
    .forEach(System.out::println);
```
Useful for **large datasets**.

| Feature     | stream()      | parallelStream()      |
| ----------- | ------------- | --------------------- |
| Execution   | Sequential    | Parallel              |
| Thread      | Single thread | Multiple threads      |
| Performance | Normal        | Faster for large data |
