## Local Terminal
1. Copy your endpoint (from RDS Console → Connectivity):
    
    `database-1.c1s8mymewzh3.ap-south-1.rds.amazonaws.com`
    
2. Connect using MySQL CLI:
    
    `mysql -h database-1.c1s8mymewzh3.ap-south-1.rds.amazonaws.com -u admin -p`
    
3. Once inside:
    
    `SHOW DATABASES; CREATE DATABASE farmer_connect_db; USE farmer_connect_db;`
    
If it fails — likely a **security group** or **VPC** issue.

## Spring Boot

### 4.1. Add dependency

If you’re using Maven, include:

```java
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <scope>runtime</scope>
</dependency>
```

---

### 4.2. Set up your environment variables (for security)

```java
export RDS_ENDPOINT=jdbc:mysql://database-1.c1s8mymewzh3.ap-south-1.rds.amazonaws.com:3306/farmer_connect_db
export RDS_USERNAME=admin
export RDS_PASSWORD=YourPassword123
```

---

### 4.3. Configure `application.properties`

```java
spring.datasource.url=${RDS_ENDPOINT}
spring.datasource.username=${RDS_USERNAME}
spring.datasource.password=${RDS_PASSWORD}
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.show-sql=true
```

✅ You can also hardcode temporarily (not recommended for production):

---

### 4.4. Test the Connection

Run your Spring Boot app:

`./mvnw spring-boot:run`

Expected log:
```java
HikariPool-1 - Starting...
HikariPool-1 - Start completed.
```

If you get `Communications link failure`, check:

- ✅ Security group inbound rules
    
- ✅ Correct endpoint and port
    
- ✅ Your IP hasn’t changed (mobile network often changes it)
Or maybe because of Internet Issue!