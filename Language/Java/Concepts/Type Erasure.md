> Java implements generics using **Type Erasure**.

Type erasure is the process by which Java removes generic type information at compile time and replaces it with raw types to maintain backward compatibility.

👉 Generic type information is removed at runtime.

Example
```java
List<String> list1 = new ArrayList<>();
List<Integer> list2 = new ArrayList<>();

System.out.println(list1.getClass() == list2.getClass());
```

output
```java
true
```
 
Because at runtime both become: `ArrayList`
## What Happens During Erasure?
1. Generic types are replaced with their bound.
    - If no bound → replaced with `Object`
2. Type casting is inserted automatically.
3. Generic type info is removed at runtime.