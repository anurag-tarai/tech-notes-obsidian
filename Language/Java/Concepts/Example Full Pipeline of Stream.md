```java
List<Integer> list = List.of(3,7,2,9,5);

List<Integer> result =
list.stream()
    .filter(x -> x > 4)
    .sorted()
    .map(x -> x * 2)
    .collect(Collectors.toList());

System.out.println(result);
```

Steps:
1. filter numbers > 4
2. sort them
3. multiply by 2
4. collect into list