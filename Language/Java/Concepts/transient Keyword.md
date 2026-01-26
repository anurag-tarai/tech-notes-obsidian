> Fields marked as `transient` are **NOT serialized**

```java
transient int password;
```
### Example:
```java
class User implements Serializable {
    String username;
    transient String password;
}
```

After deserialization:
```java
username → restored
password → null
```