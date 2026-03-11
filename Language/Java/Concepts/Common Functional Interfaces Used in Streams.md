Streams heavily use functional interfaces from  
`java.util.function`

|Operation|Functional Interface|
|---|---|
|filter()|Predicate|
|map()|Function|
|forEach()|Consumer|
|reduce()|BinaryOperator|
|sorted()|Comparator|

Example:
```java
list.stream()  
    .filter(x -> x > 10)  
    .forEach(System.out::println);
```