### What it is
- A **command-line tool** to interact with MongoDB.
- You write **JavaScript-like commands** to query, insert, update, delete, or manage the database.
### Best for
- Developers comfortable with commands.
- Scripts, automation, DevOps.
- Fast operations.
- Learning real MongoDB queries (benefits interviews!).
### Pros
- Very fast, keyboard-based.
- Supports advanced operations.
- Good for production tasks.
- Easy to automate.
- Lightweight—runs anywhere.
### Cons
- Not visually friendly.
- Harder for beginners to explore data.
- Requires remembering syntax.

### **Example**

```c
show dbs
use student
db.users.find({ age: { $gt: 20 } })
```

### How to Use :
```c
mongosh --version

mongosh

mongodb://127.0.0.1:27017

// MongoDB Atlas
mongosh "mongodb+srv://cluster-url.mongodb.net/sample" --apiVersion 1
```
