### Step 1: Implement `Serializable`

```java
class Student implements Serializable {
    int id;
    String name;
}
```
### Step 2: Use `ObjectOutputStream`

```java
ObjectOutputStream oos =
    new ObjectOutputStream(new FileOutputStream("student.ser"));

oos.writeObject(student);
oos.close();
```
---

## **6. Steps to Perform Deserialization**

### Step 1: Use `ObjectInputStream`

```java
ObjectInputStream ois =
    new ObjectInputStream(new FileInputStream("student.ser"));

Student s = (Student) ois.readObject();
ois.close();
```

---

## **7. Complete Example**

### Serializable Class
```java
import java.io.Serializable;

class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
```
---

### Serialization

```java
import java.io.*;

public class SerializeDemo {
    public static void main(String[] args) throws Exception {
        Student s = new Student(1, "Anurag");

        ObjectOutputStream oos =
            new ObjectOutputStream(new FileOutputStream("data.ser"));

        oos.writeObject(s);
        oos.close();

        System.out.println("Object Serialized");
    }
}
```