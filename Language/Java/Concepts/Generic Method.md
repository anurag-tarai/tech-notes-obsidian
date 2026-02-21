> A **Generic Method** is a method that uses a **type parameter** to work with different data types.
### Why Do We Need It?
- To make methods **reusable**
- To provide **type safety**
- To avoid writing separate methods for different data types
### Syntax
```java
public <T> returnType methodName(T parameter) {
    // method body
}
```
👉 `<T>` is written **before** the return type.  
👉 `T` can be used as a parameter type, return type, or inside the method.

---
### Example 1: Simple Generic Method
```java
class Util {

    public static <T> void printValue(T value) {
        System.out.println(value);
    }
}
```
### Usage
```java
Util.printValue("Hello");
Util.printValue(100);
Util.printValue(3.14);
```
✔ Same method  
✔ Works with different data types

---
### Example 2: Generic Method with Return Type
```java
class Util {

    public static <T> T getFirstElement(T[] array) {
        return array[0];
    }
}
```
### Usage
```java
String[] names = {"Java", "Spring"};
String first = Util.getFirstElement(names);

Integer[] numbers = {10, 20, 30};
Integer num = Util.getFirstElement(numbers);
```
✔ No casting needed  
✔ Type is decided automatically

---
### Important Points
- Generic methods can be inside:
    - Normal class
    - Generic class
    - Non-generic class
- Type is inferred automatically in most cases.

