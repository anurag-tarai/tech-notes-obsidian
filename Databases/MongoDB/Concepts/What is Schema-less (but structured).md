MongoDB is **schema-less**, meaning:
- Collections **do not enforce** a fixed schema like SQL tables.
- You can insert documents with different fields.

But MongoDB is also **schema-structured** because:
- Your application should follow a **consistent shape** for each document.
- You _define the schema in your code_ (Mongoose, backend validations, etc.)
    

**MongoDB does not enforce a schema, but you should.**

**Example:**
```json
// Both valid in MongoDB
{ "_id": 1, "name": "Anurag", "age": 23 }
{ "_id": 2, "name": "Rahul", "skills": ["Java", "Spring"] }
```

**Example 2 :**
You have:
```java
public class User {
  String name;
  String email;
}
```

MongoDB will allow this too:
```json
{ "name": "Anurag", "email": "aaa@a.com" }
{ "username": "Anu" }     // still accepted in DB
```
Your backend adds the structure.  
MongoDB gives flexibility.