**Bean lifecycle** is the **sequence of events from bean creation to destruction** as managed by the Spring container.

### Bean Lifecycle Phases

1️⃣ **Instantiation**

- Spring creates bean instance using constructor
    

2️⃣ **Populate properties / Dependency Injection**

- Injects dependencies via **setter, constructor, or field**
    

3️⃣ **Aware interfaces (optional)**

- `BeanNameAware`, `ApplicationContextAware` give bean info about container
    

4️⃣ **Bean Post Processors – Before Initialization**

- `BeanPostProcessor` hooks called **before custom init methods**
    

5️⃣ **Initialization callbacks**

- `@PostConstruct` or `InitializingBean.afterPropertiesSet()`
    
- `@Bean(initMethod = "init")` in Java config
    

6️⃣ **Bean Post Processors – After Initialization**

- Hooks called **after init methods**
    

7️⃣ **Bean Ready to Use**

- Bean is fully initialized and ready for application use
    

8️⃣ **Destruction / Cleanup**

- Singleton beans: `@PreDestroy`, `DisposableBean.destroy()`
    
- Prototype beans: container **does not manage destruction**
    

---