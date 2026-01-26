### What is it?
A **unique identifier** for each serializable class.
```java
private static final long serialVersionUID = 1L;
```
### Why is it needed?
- Ensures **version compatibility**
- Prevents `InvalidClassException`
### Interview Answer:
> `serialVersionUID` is used to verify that sender and receiver of a serialized object have compatible class versions.

---