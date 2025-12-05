Log back into MySQL
`sudo mysql -u root -p`
pass - Root@123

Create a remote-access user
```java
CREATE USER 'farmer_user'@'%' IDENTIFIED BY 'Farmer@123';
GRANT ALL PRIVILEGES ON farmer_connect_db.* TO 'farmer_user'@'%';
FLUSH PRIVILEGES;

SELECT Host, User FROM mysql.user;
```
- `farmer_user@'%'` → can connect **remotely** from any IP (for your Spring Boot app).
- `farmer_user@'localhost'` → for local connections (from the same EC2).

then` EXIT;`

Edit MySQL config to listen on all interfaces
```java
sudo nano /etc/mysql/mysql.conf.d/mysqld.cnf

bind-address = 0.0.0.0

sudo systemctl restart mysql

```

Allow inbound traffic on EC2
In the AWS console → **EC2 → Security Groups → Inbound Rules → Edit rules**
Add:

| Type         | Protocol | Port range | Source    |
| ------------ | -------- | ---------- | --------- |
| MySQL/Aurora | TCP      | 3306       | 0.0.0.0/0 |

Test the remote connection
```java
mysql -u farmer_user -h <EC2_PUBLIC_IP> -p

pass - Farmer@123

ex - mysql -h 3.110.186.224 -u farmer_user -p

OR
mycli -h 13.201.88.250 -u farmer_user -p farmer_connect_db
- for mycli
```

Update your Spring Boot `application.properties` (or `application.yml`)
```java
spring.datasource.url=jdbc:mysql://<EC2-PUBLIC-IP>:3306/farmer_connect_db
spring.datasource.username=farmer_user
spring.datasource.password=Farmer@123
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```