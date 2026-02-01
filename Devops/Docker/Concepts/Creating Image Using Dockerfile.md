## 2️⃣ Correct Dockerfile for Spring Boot

Here’s a **ready-to-run Dockerfile** that works:
```sh
# Use Java 17 runtime
FROM eclipse-temurin:17

# Set working directory inside container
WORKDIR /app

# Copy JAR into container
COPY target/app.jar app.jar

# Expose port (Spring Boot default)
EXPOSE 8080

# Run the JAR
ENTRYPOINT ["java","-jar","app.jar"]
```

✅ Key points:

1. `WORKDIR /app` → sets working directory inside container
    
2. `COPY target/app.jar app.jar` → JAR now lives at `/app/app.jar`
    
3. `ENTRYPOINT ["java","-jar","app.jar"]` → runs the JAR correctly
    

---

## 3️⃣ Rebuild Your Image

```sh
docker build -t anurag/rest-demo:v4 .
```

---

## 4️⃣ Run Container With Port Mapping

```sh
docker run -p 8080:8080 anurag/rest-demo:v4
```

- Now the container will **start Spring Boot**
    
- Should **stay UP** and listen on port 8080