
| Feature          | File                  | Directory                        |
| ---------------- | --------------------- | -------------------------------- |
| Meaning          | Stores data           | Stores files and sub-directories |
| Extension        | Yes (`.txt`, `.java`) | No                               |
| Can contain data | Yes                   | No (contains files)              |
| Size             | Has size              | Size is sum of files             |
| Example          | `notes.txt`           | `Documents/`                     |
### Java Representation

Both **files and directories** are represented by:
```java
java.io.File
```

Example :
```java
File file = new File("data.txt");      // File
File dir = new File("documents");      // Directory
```