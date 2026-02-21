## Before Generics
Before Generics (introduced in **Java 5**), collections like `ArrayList` and `HashMap` could store **any type of object**.

Everything was treated as an `Object`.
### Problem:
- Java did not remember the actual type of the object.
- We had to manually **cast** the object while retrieving it.
- If we cast it to the wrong type → it caused a **runtime error**.
### Example (Before Generics)
```java
import java.util.ArrayList;

ArrayList list = new ArrayList();
list.add("Hello");
list.add(100);   // Allowed

String str = (String) list.get(1);  // Runtime error (ClassCastException)
```
❌ Problem: Error happens at **runtime**, not compile time.

## After Generics
With Generics, we can specify what type of data a collection should hold.

Example: `ArrayList<String>`

Now Java knows the expected type and checks it at **compile time**.
### Example (With Generics)
```java
import java.util.ArrayList;

ArrayList<String> list = new ArrayList<>();
list.add("Hello");
list.add(100);   // Compile-time error

String str = list.get(0);  // No casting needed
```
✔ No manual casting  
✔ No runtime type error  
✔ Safer and cleaner code

## Simple Conclusion
- Before Generics → Collections stored objects as `Object`, required casting, and errors happened at runtime.
    
- After Generics → We specify the type (like `<String>`), and Java checks type safety at compile time.

---
## Other Defintion
**Generics** allow you to write classes, interfaces, and methods that work with different data types while providing **type safety at compile time**.