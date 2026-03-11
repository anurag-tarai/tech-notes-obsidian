Sort results by field(s):
- `1` → ascending
- `-1` → descending
```q
db.products.find().sort({ price: -1 })
db.users.find().sort({ age: 1, name: 1 })
```