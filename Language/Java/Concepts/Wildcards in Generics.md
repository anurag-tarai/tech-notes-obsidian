Wildcards are used with `?` when we don’t know the exact type.

### `?` (Unbounded Wildcard)
```java
List<?> list = new ArrayList<String>();
```
✔ Can reference any type of list  
❌ Cannot add elements (except null)x

```java
list.add(null); // allowed
list.add("Hello"); // error
```
#### Use Case:
When you only need to read from a structure.

---
### `? extends T` (Upper Bounded Wildcard)

```java
public static void printNumbers(List<? extends Number> list) {
    for (Number n : list) {
        System.out.println(n);
    }
}
```
✔ Accepts:

- `List<Integer>`
    
- `List<Double>`
    
- `List<Float>`
    
❌ Cannot add elements (except null)
👉 Because compiler doesn't know exact subtype.
### Rule:
> **Producer = extends**

If data is being **produced (read)** → use `extends`.

---
### `? super T` (Lower Bounded Wildcard)

```java
public static void addNumbers(List<? super Integer> list) {
    list.add(10);
}
```

✔ Accepts:
- `List<Integer>`
    
- `List<Number>`
    
- `List<Object>`
    

👉 Safe to add Integer.
### Rule:

> **Consumer = super**

If data is being **consumed (written)** → use `super`.