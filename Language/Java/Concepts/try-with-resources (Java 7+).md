> Automatically closes resources.

```java
try (FileReader fr = new FileReader("data.txt")) {
    // use file
} catch (IOException e) {
    e.printStackTrace();
}
```
✔ Cleaner  
✔ Safer  
✔ Recommended