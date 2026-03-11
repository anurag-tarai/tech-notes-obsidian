- `limit(n)` → number of documents to return
- `skip(n)` → skip first n documents
```q
db.users.find().sort({ age: -1 }).skip(10).limit(5)
```
