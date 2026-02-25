Due to type erasure, generics have limitations.

---

## ❌ 1. Cannot use Primitive Types

```java
List<int> list; // Error
```

✔ Use wrapper classes:

```java
List<Integer>
```

---

## ❌ 2. Cannot Create Object of Type Parameter

```java
class Test<T> {  
    T obj = new T(); // Error  
}
```

---

## ❌ 3. Cannot Create Generic Array

```java
T[] arr = new T[10]; // Error
```

---

## ❌ 4. Cannot Use `instanceof` with Generic Type

```java
if (list instanceof List<String>) // Error
```

✔ Allowed:

```java
if (list instanceof List<?>)
```

---

## ❌ 5. Static Members Cannot Use Type Parameter

```java
class Test<T> {  
    static T value; // Error  
}
```

Because static belongs to class, not object.

---

## ❌ 6. Overloading Methods Based Only on Generic Type Not Allowed

```java
void print(List<String> list) {}  
void print(List<Integer> list) {} // Error
```

Because both become:

```java
void print(List list)
```
after type erasure.