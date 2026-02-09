### Set return false if already present
```java
Set<Character> set = new HashSet<>(List.of('a','b','c'));
System.out.println(set.add('c')); // false
```
