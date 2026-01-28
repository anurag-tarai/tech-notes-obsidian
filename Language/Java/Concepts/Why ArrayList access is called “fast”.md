```java
list.get(0);
```
- Access by **index**
- Internally uses an array
- Direct memory jump
- Time complexity: **O(1)**

This is called **random access**.

### How `HashMap` access works
```java
map.get(key);
```
### Internally:
1. HashMap calculates **hashcode of the key**
2. Finds the **bucket index**
3. Looks for the key in that bucket
4. Returns the value

👉 Average time: **O(1)**  
👉 But **only if you know the key**