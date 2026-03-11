### Auth Service DB
users  
notifications

---

### Application Service DB
applications  
categories

---

### Review Service DB
reviews  
downloads

---
Example:
### When user downloads an app

Flow:
```java
User -> Review Service -> Application Service -> Auth Service
```
Steps:
1️⃣ User downloads app  
2️⃣ Review Service saves record in `downloads`  
3️⃣ Review Service calls Auth Service  
4️⃣ Auth Service creates notification for owner