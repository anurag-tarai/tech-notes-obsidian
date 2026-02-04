A **specification** is a **set of rules, guidelines, or contracts** that defines **what should be done**, **not how it is implemented**.

---

## Example
**JPA = Specification**

It defines things like:
- `@Entity`
- `@Id`
- `EntityManager`
- Rules for persistence

But JPA **does NOT**:
- Connect to DB
- Generate SQL
- Execute queries

That is done by implementations like:
- **Hibernate**
- EclipseLink

So:
- **JPA** → rules
- **Hibernate** → actual working code
---
## Another common example

- **JDBC** → specification
    
- **MySQL Driver / PostgreSQL Driver** → implementation