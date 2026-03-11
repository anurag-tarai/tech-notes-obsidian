## ORM (Object-Relational Mapping)
- its is a **technique** or a **mechanism** that maps Java objects with relational tables so we don’t have to write SQL queries or JDBC mapping and can interact with the database using Java objects.
- Maps:
	- **Class** $\rightarrow$ **Table**
	- **Object/Instance** $\rightarrow$ **Row**
	- **Attribute/Field** $\rightarrow$ **Column**
	
- Eliminates manual SQL and JDBC mapping
- Core idea behind JPA & Hibernate
---
## JPA
- **Specification (rules)** for ORM
- Defines:
    - ORM concepts
    - Annotations like `@Entity`, `@Id`
    - Interfaces like `EntityManager`
- **No actual code to talk to DB**
	
👉 _What to do, not how_

---
## Spring Data JPA 
- **Abstraction on top of JPA**
- Removes boilerplate even more
- You don’t write:
    - `EntityManager`
    - Queries for common CRUD
- Uses Hibernate internally (by default)
---
## Hibernate
- **Implementation of JPA**
- Actually:
    - Generates SQL
    - Talks to the database
    - Manages transactions
- Most commonly used JPA provider
    
👉 _Does the real work_

---
## Repository
- **Repository** is a Spring Data JPA abstraction and,
- Act as **Data access layer abstraction**
- Interface where you define DB operations
- Spring generates implementation at runtime
- Spring Data JPA internal uses hibernate which generate sql query and execute them.

```java
public interface StudentRepository extends JpaRepository<Student, Long> {
}
```