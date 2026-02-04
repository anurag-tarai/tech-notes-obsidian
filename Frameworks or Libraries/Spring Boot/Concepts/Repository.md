Spring Data JPA provides **CrudRepository** or **JpaRepository**.

```java
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // You can add custom query methods
    Student findByName(String name);
}
```
- **CrudRepository**: basic CRUD (`save`, `findById`, `delete`, etc.)
- **JpaRepository**: extends CrudRepository + pagination and sorting