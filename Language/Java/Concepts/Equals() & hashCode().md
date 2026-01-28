- Used in **Hash-based collections**: `HashSet`, `HashMap`, `Hashtable`
- Determine **uniqueness** of objects

## equals()
- Checks **logical equality** of objects
- Defined in `Object` class → can override
```java
class Student {
    int id;
    String name;

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Student s = (Student) o;
        return id == s.id && name.equals(s.name);
    }
}
```

## hashCode()
- Returns an **int** representing object in hash table
- Contract with equals(): [Contract](equals()%20&%20hashCode()%20Contract.md) 
    
> **Rule:** If `a.equals(b)` → `a.hashCode() == b.hashCode()`  
> But not necessarily the other way around

```java
@Override
public int hashCode() {
    return Objects.hash(id, name);
}
```

### Why needed?
- Hash-based collections first use **hashCode()** to find bucket
    
- Then use **equals()** to check exact object
    
- If not overridden → default `Object.hashCode()` used → may break `Set`/`Map` uniqueness

### Example :
```java
Set<Student> set = new HashSet<>();
Student s1 = new Student(1, "Anurag");
Student s2 = new Student(1, "Anurag");

set.add(s1);
set.add(s2); // added only if equals() & hashCode() not correctly overridden
```
Without overriding both : Two logically equal objects may go into **different buckets** → duplicates appear

If you store a custom object in HashSet/HashMap/Hashtable → always override **both `equals()` and `hashCode()`** to maintain uniqueness.


> **TreeSet/TreeMap** → rely on **Comparable/Comparator**, no need for hashCode