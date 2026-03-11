## 1. Document (Smallest unit of data)
A **document** is a single record in MongoDB.
It is stored in **JSON-like (BSON)** format.
Think of a document as **one row** in SQL — but more flexible.
### Example Document:
```js
{
  "name": "Anurag",
  "age": 25,
  "skills": ["JS", "MongoDB"],
  "isActive": true
}
```
### Key points:
- Smallest unit in MongoDB
- JSON-like structure
- Fields can vary between documents (schema-less)
- Can store nested data (arrays, objects)

---
## 2. Collection (Group of documents)
A **collection** is a group of related documents.  
Think of it as the **equivalent of a table** in SQL — but without a fixed schema.
### Example:
Imagine a collection called **users**.
Inside `users`, you store many documents:

```js
{ "name": "Anurag", "age": 25 }
{ "name": "Riya", "email": "riya@mail.com" }
{ "name": "John", "skills": ["Node", "React"], "age": 30 }
```
### Key points:
- Group of documents
- No fixed schema → each document can have different fields
- Created automatically when you first insert a document
- Equivalent to a "table" in relational DBs

---
## 3. Database (Container for collections)
A **database** is an organized collection of data that can be **stored, managed, and retrieved easily**.

In MongoDB :
A **database** is a container that holds **multiple collections**.
### Example:
Database: **companyDB**

Inside this database:
- `users` collection
- `products` collection
- `orders` collection
Each collection contains multiple documents.
### Key points:
- Top-level namespace
- Contains many collections
- Helps organize data logically (per application or module)

---

# Simple Visual Structure

```js
Database
 └── Collection
       └── Document
```

Or with example:
```js
companyDB (database)
 ├── users (collection)
 │     ├── { name: "Anurag", age: 25 }        (document)
 │     └── { name: "Riya", email: "abc@mail.com" }
 │
 └── orders (collection)
       ├── { orderId: 1, total: 500 }
       └── { orderId: 2, total: 1200 }
```