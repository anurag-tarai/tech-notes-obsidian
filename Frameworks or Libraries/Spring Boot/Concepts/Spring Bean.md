A **Spring Bean** is a **Java object whose complete lifecycle (creation, dependency injection, initialization, and destruction) is managed by the Spring IoC container**.

## Main Ways to Define a Spring Bean
### 1. Using Component Scanning (`@Component` and stereotypes)

**Definition:**  
Beans are defined by **annotating classes with `@Component` or its specialized annotations (`@Service`, `@Repository`, `@Controller`)**, which are automatically detected and registered by Spring during component scanning.

---

### 2. Using Java Configuration (`@Bean`)

**Definition:**  
Beans are defined by **declaring methods annotated with `@Bean` inside a `@Configuration` class**, giving explicit control over bean creation and configuration.

```java
public class Bird {  
    private String name;  
    private String color;  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public String getColor() {  
        return color;  
    }  
    public void setColor(String color) {  
        this.color = color;  
    }  
  
    @Override  
    public String toString() {  
        return "Bird [name=" + name + ", color=" + color + "]";  
    }  
  
}
```

```java
@Configuration  
public class AppConfig {  
  
    @Bean  
    public Bird bird() {  
        return new Bird(); // This bean will be managed by Spring  
    }  
}
```

- `@Configuration`: This annotation in Spring Framework indicates that a class is a source of bean definitions. (Class-leve annotation)
- `@Bean` : This Annotation in Spring is used to define a method that produces a bean to be managed by the Spring IOC (Inversion of Control) container. (Method-level annotation)

---
### 3. Using XML Configuration
**Definition:**  
Beans are defined by **declaring them in an XML configuration file**, where Spring manages their lifecycle based on the provided metadata.