
> A stream pipeline has **three stages**:
### 1. Source
Data source such as:
- Collection
- Array
- I/O channel
    
Example:
```java
list.stream()
```

### 2. Intermediate Operations

Operations that **transform the stream**.
Examples:
- `filter()`
- `map()`
- `sorted()`
- `distinct()`
- `limit()`
    
These operations return **another stream**.
Example:
```java
.filter(x -> x > 10)
.map(x -> x * 2)
```

### 3. Terminal Operation

This produces the **final result**.
Examples:
- `forEach()`
- `collect()`
- `reduce()`
- `count()`
- `findFirst()`

Example:
```java
.forEach(System.out::println)
```