`mongosh` — start MongoDB shell

`show dbs` — list all databases

`use myDatabase` — switch to a database (does NOT create it yet)

`show collections` — list all collections inside the current DB

---
`db.collection.drop()` — delete a collection

`db.dropDatabase()` — delete the entire database

---
`Ctrl + L` — clear shell screen

---
`db.books.countDocuments()` — count total documents in the collection

`db.books.stats()` — show collection size + storage details

`db.books.find().pretty()` — display documents in readable (formatted) output

`db.runCommand({ ping: 1 })` — test if MongoDB server is reachable/alive

`db.books.getIndexes()` — list all indexes created on the collection

---
## 7. Create Database
```q
// Step 1: Switch to the database (does NOT create it yet)
use my_store

// Step 2: Create a collection (this actually creates the database)
db.createCollection("laptop")

// Step 3: Show all databases
show dbs
```
But,
`MongoDB Compass` : 
- You can **create a database without a collection** because Compass will:
    - write database metadata for you
    - optionally let you add a collection later
- Essentially, Compass abstracts away the “must-have collection” rule that Shell enforces.
