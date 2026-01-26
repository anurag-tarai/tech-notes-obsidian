```java
public interface Serializable {
}
```

### Key Points:
- [Marker Interface](Marker%20Interface.md) 
- JVM checks this before serialization
- If not implemented → `NotSerializableException` 