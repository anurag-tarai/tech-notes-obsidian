```java
import java.io.*;

public class DeserializeDemo {
    public static void main(String[] args) throws Exception {

        ObjectInputStream ois =
            new ObjectInputStream(new FileInputStream("data.ser"));

        Student s = (Student) ois.readObject();
        ois.close();

        System.out.println(s.id + " " + s.name);
    }
}
```