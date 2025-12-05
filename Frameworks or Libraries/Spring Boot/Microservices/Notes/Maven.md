**Maven** is a **build automation and project management tool** for Java projects. It helps you:

1. **Compile code**
2. **Manage dependencies** (download libraries your project needs)
3. **Run tests**
4. **Package your app** (like JAR, WAR)
5. **Build consistently** across machines

Think of it as a **recipe manager** for your project: you define ingredients (dependencies) and steps (build lifecycle), and Maven handles the rest automatically.

---

**Example Commands**:

- `mvn clean` → **delete old compiled files**
    
- `mvn compile` → **compile your code**
    
- `mvn package` → **create a JAR/WAR file**
    
- `mvn install` → **install your package to local repo**
    

---

💡 **Analogy:** Maven is like a **kitchen robot for Java projects** — you just give it the recipe (`pom.xml`), and it builds your app for you.