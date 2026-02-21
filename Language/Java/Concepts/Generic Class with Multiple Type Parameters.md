### Syntax
```java
class ClassName<T, U> {
}
```
### Example: Pair Class
```java
class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
```
### Usage
```java
Pair<String, Integer> student = new Pair<>("Age", 22);

String key = student.getKey();
Integer value = student.getValue();
```
Here:
- `K` → Type of key
- `V` → Type of value