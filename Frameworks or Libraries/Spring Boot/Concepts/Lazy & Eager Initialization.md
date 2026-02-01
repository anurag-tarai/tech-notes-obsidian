## Lazy Initialization
**Lazy initialization** means that **Spring creates a bean only when it is first requested**, not during application startup.
### Key Points
- Beans are created **on demand**
- Reduces application startup time
- Enabled using `@Lazy`
- Useful for heavy or rarely used beans

## Eager Initialization
Eager initialization is a process where Spring instantiates all singleton beans at application startup.
### Key Points
- Beans are created **at application startup**
- Default behavior of **ApplicationContext**
- Applies only to **singleton beans**
- Increases startup time but improves runtime performance