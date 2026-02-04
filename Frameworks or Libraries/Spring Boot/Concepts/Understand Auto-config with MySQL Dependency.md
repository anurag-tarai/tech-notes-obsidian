## Spring Boot
- Add **MySQL driver** and **Spring Data JPA** dependency
- Provide DB details in `application.properties`
- Spring Boot **detects dependencies in classpath**
- `@EnableAutoConfiguration` triggers auto-config
- Conditional checks (`@ConditionalOnClass`) pass
- Spring Boot **automatically creates beans**:
    - `DataSource`
    - `EntityManagerFactory`
    - `TransactionManager`
- Uses **default (opinionated) configuration**
- Manual configuration **not required**
- Defaults can be **overridden if needed**

👉 In **Spring (without Boot)**, all these beans must be configured **manually**.

---
## Spring
In **Spring (without Boot)** you must:
- Define **DataSource bean**
- Configure **EntityManagerFactory**
- Configure **TransactionManager**
- Set **Hibernate properties**
- Manage **XML / Java config**
- Add external server config

👉 **Everything is manual**