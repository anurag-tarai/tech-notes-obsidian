> A **Generic Class** is a class that can work with different data types using a **type parameter**.

- we use <> to specify parameter types in generic class creation. To create objects of a generic class, we use the following syntax:
```java
// To create an instance of generic class  
BaseType <Type> obj = new BaseType <Type>()
```

```ad-note
In Parameter type, we can not use primitives like "int", "char" or "double". Use wrapper classes like Integer, Character, etc.
```
### Why Do We Need It?
- To make code **reusable**
- To provide **type safety**
- To avoid writing separate classes for different data types
```java
class Box<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
```
`T` is called a **type parameter**.
### Using the Generic Class
```java
Box<String> stringBox = new Box<>();
stringBox.set("Java");
String data = stringBox.get();

Box<Integer> intBox = new Box<>();
intBox.set(100);
Integer number = intBox.get();
```

### Before Generic Class (Problem)
Without generics, we would write:
```java
class Box {
    Object value;
}
```
Then we would need casting while retrieving → unsafe and error-prone.