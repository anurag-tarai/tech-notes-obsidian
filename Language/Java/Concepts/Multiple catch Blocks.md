```java
try {
    int[] arr = new int[3];
    System.out.println(arr[5]);
} catch (ArithmeticException e) {
    System.out.println("Arithmetic error");
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Index error");
}
```
**Order matters**: Child first → Parent later

- **Parent exception** → more **general** : e.g. `RuntimeException`
    
- **Child exception** → more **specific** : e.g.  `ArithmeticException`

