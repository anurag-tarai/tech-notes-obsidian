### Creating a StringBuilder
```java
StringBuilder sb = new StringBuilder();
StringBuilder sb = new StringBuilder("Hello");
StringBuilder sb = new StringBuilder(50); // initial capacity
```

### Add / Append
```java
sb.append("World");
sb.append(10);
sb.append(true);
sb.append('A');
sb.append(3.14);
```

### Insert
```java
sb.insert(5, "Java");
```

### Delete

```java
sb.delete(0, 3);
sb.deleteCharAt(2);
```
---

### Reverse

```java
sb.reverse();
```

### Access Characters
```java
sb.charAt(1);
sb.setCharAt(1, 'X');
```

## Length & Capacity

```java
sb.length();
sb.capacity();
sb.ensureCapacity(100);
sb.trimToSize();
```
---

## Substring

```java
sb.substring(0, 5);
sb.substring(3);
```
---

## Search

```java
sb.indexOf("lo");
sb.indexOf("lo", 2);
sb.lastIndexOf("o");
```
---

## Convert to String

```java
String str = sb.toString();
```
---

## Clear StringBuilder

```java
sb.setLength(0);
```

---

## Compare (NO direct equals)

```java
sb.toString().equals("Hello");
```

---

## Important Interview Points ⭐

- `StringBuilder` is **mutable**
    
- **Not thread-safe**
    
- Faster than `StringBuffer`
    
- Introduced in **Java 5**
    

---

### One-line interview answer:

> _StringBuilder is a mutable class used to create and modify strings efficiently without creating new objects._