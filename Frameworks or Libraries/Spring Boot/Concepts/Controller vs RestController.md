### 1️⃣ `@Controller`

**Definition:**  
`@Controller` is a **Spring annotation used to define a web controller** that handles HTTP requests and returns **views** (like JSP, Thymeleaf, HTML).

**Key Points:**
- Used in **Spring MVC applications** 
- Returns **view names** by default 
- Needs `@ResponseBody` on methods to return **JSON or XML** 
```java
@Controller
public class UserController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World"; // JSON/Plain text only if @ResponseBody is used
    }
}
```

---

### 2️⃣ `@RestController`

**Definition:**  
`@RestController` is a **specialized version of `@Controller`** that **automatically adds `@ResponseBody` to all methods**, used for **RESTful web services**.

**Key Points:**
- Introduced in Spring 4
- Returns **JSON or XML directly**
- No need to annotate each method with `@ResponseBody`

```java
@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World"; // Returned as plain text or JSON
    }
}
```

| Aspect               | `@Controller`                          | `@RestController`                   |
| -------------------- | -------------------------------------- | ----------------------------------- |
| Response             | Returns views (HTML, JSP) by default   | Returns data (JSON/XML)             |
| `@ResponseBody`      | Required on each method to return JSON | Not required, applied automatically |
| Use case             | MVC web applications                   | RESTful APIs / microservices        |
| Introduced in Spring | All versions                           | Spring 4+                           |