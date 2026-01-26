> `throws` keyword is used to declare exceptions that a method may pass to its caller instead of handling them itself.

```java
void readFile() throws IOException {
    FileReader fr = new FileReader("data.txt");
}
```