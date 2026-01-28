## **1️⃣ Comparable**

### Definition:

> `Comparable` is an interface used to define **natural ordering** of objects.  
> A class implements `Comparable` to tell Java **how to compare its own objects**.
### Key Points:
- Package: `java.lang`
- One sorting logic (natural order)
- Implements `compareTo()` method
- Used in `Collections.sort(list)` by default

### Syntax:

```java
class Student implements Comparable<Student> {
    int age;
    public int compareTo(Student s) {
        return this.age - s.age; // ascending order
    }
}
```
### Example:
```java
List<Student> students = new ArrayList<>();
students.add(new Student(20));
students.add(new Student(18));

Collections.sort(students); // uses compareTo()
```
---

## **2️⃣ Comparator**

### Definition:

> `Comparator` is an interface used to define **custom ordering** of objects.  
> You don’t need to modify the class itself; you can create **external sorting logic**.

### Key Points:
- Package: `java.util`
- Multiple sorting logic possible
- Implements `compare()` method
- Used in `Collections.sort(list, comparator)`

### Syntax (lambda style):
```java
Comparator<Student> cmp = (s1, s2) -> s2.age - s1.age; // descending order
Collections.sort(students, cmp);
```

---

## **3️⃣ Comparison Table (Interview Quick Reference)**

|Feature|Comparable|Comparator|
|---|---|---|
|Purpose|Natural order sorting|Custom order sorting|
|Interface method|`compareTo()`|`compare()`|
|Class modification|Must modify class to implement|No need to modify class|
|Multiple sorting|Not possible|Possible|
|Package|`java.lang`|`java.util`|