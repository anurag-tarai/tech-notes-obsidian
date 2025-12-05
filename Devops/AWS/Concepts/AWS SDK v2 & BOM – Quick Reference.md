**1️⃣ What is BOM?**

- BOM = **Bill of Materials**
    
- Defines **compatible versions** for a set of dependencies (like AWS SDK modules)
    
- Ensures all modules (S3, DynamoDB, Lambda…) work together without conflicts
    

**2️⃣ Why use BOM?**

- Automatic version management ✅
    
- Safe for multi-module projects ✅
    
- Recommended for AWS SDK v2 ✅
    

**3️⃣ Do you need it?**

- ✅ Yes, if using multiple AWS SDK modules
    
- ❌ Optional if only using a single module (like S3), but safer to use BOM anyway
    

**4️⃣ Maven example**

```sql
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>software.amazon.awssdk</groupId>
            <artifactId>bom</artifactId>
            <version>2.36.0</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>

<dependencies>
    <dependency>
        <groupId>software.amazon.awssdk</groupId>
        <artifactId>s3</artifactId>
    </dependency>
</dependencies>
```

**5️⃣ Key Notes**

- Always put BOM in `<dependencyManagement>`
    
- Import AWS modules normally in `<dependencies>`
    
- Reload Maven after changes