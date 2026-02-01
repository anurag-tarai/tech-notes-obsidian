**Bean scope** defines **the lifecycle and visibility of a Spring bean**—how long the bean exists and whether it is shared.

### 1️⃣ Singleton Scope

**Definition:**
> Singleton beans are **created once per Spring IoC container** and **shared** across the entire application.

**Key Points:**
- **Default scope** in Spring
- Only **one instance** per container
- Good for **stateless beans**

```java
@Component
@Scope("singleton") // optional, default
public class MyService { }
```

---

### 2️⃣ Prototype Scope

**Definition:**
> Prototype beans are **created each time they are requested** from the container.

**Key Points:**
- A **new instance** is returned on every `getBean()`
- Used for **stateful beans**
- Spring **does not manage the full lifecycle** (no destruction callback)

```java
@Component
@Scope("prototype")
public class MyService { }
```

---

### 3️⃣ Request / Session Scope (Web-Aware Beans)

**Definition:**
- **Request Scope:** One bean instance per **HTTP request**
- **Session Scope:** One bean instance per **HTTP session**

**Key Points:**
- Used in **Spring Web applications**
- Only valid in **web-aware ApplicationContext**
- Annotated as:

```java
@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RequestBean { }
```

```java
@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionBean { }
```
---

### Quick Scope Table

|Scope|Instance|Lifetime|Typical Use|
|---|---|---|---|
|Singleton|1|Container lifetime|Stateless beans|
|Prototype|New each time|Requested time|Stateful beans|
|Request|1 per HTTP request|During request|Web controllers|
|Session|1 per HTTP session|During session|User session data|

---