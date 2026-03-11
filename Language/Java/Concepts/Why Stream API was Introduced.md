Before Java 8:
- We used **loops**
- Code became **long and less readable**
    
Example:
```java
for(Integer n : list) {
    if(n % 2 == 0) {
        System.out.println(n);
    }
}
```

Stream version:
```java
list.stream()
    .filter(n -> n % 2 == 0)
    .forEach(System.out::println);
```

