> **JPA (Java Persistence API)** is a **Java specification** used to **store, retrieve, and manage data between Java objects and a relational database**.

**JPA lets you work with database data using Java objects instead of writing SQL again and again.**

Read - [Specification](Specification.md) 
## Why JPA exists (the problem it solves)
Before JPA:
- You had to write a lot of **JDBC code**
- Manual SQL queries
- ResultSet → Object mapping (boring + error-prone)
- Lots of boilerplate code

JPA **solves this by providing ORM (Object-Relational Mapping)**.

---
## What JPA actually does
- Maps **Java classes → Database tables**
- Maps **fields → columns**
- Handles **CRUD operations** automatically
- Reduces boilerplate JDBC code
Example :
```java
@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int age;
}
```
You work with `Student` objects, JPA handles the SQL.

---
```ad-important
💡 JPA is only a specification, not an implementation
```
Popular implementations:
- **Hibernate** (most common)
- EclipseLink
- OpenJPA

So usually:
- You use **Spring Data JPA**
- Which internally uses **Hibernate**

---