## Intermediate Operations

| Method     | Purpose            |
| ---------- | ------------------ |
| filter()   | Select elements    |
| map()      | Transform elements |
| sorted()   | Sort elements      |
| distinct() | Remove duplicates  |
| limit()    | Limit results      |
| skip()     | Skip elements      |
Example:
```java
list.stream()  
    .filter(x -> x > 5)  
    .map(x -> x * 2)
```

---
## Terminal Operations

|Method|Purpose|
|---|---|
|forEach()|Iterate elements|
|collect()|Convert stream to collection|
|reduce()|Aggregate values|
|count()|Count elements|
|findFirst()|Get first element|
|anyMatch()|Condition check|

Example:
```java
list.stream()  
    .count();
```