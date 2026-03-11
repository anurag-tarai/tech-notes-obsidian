| Operator | Meaning               | Example                           |
| -------- | --------------------- | --------------------------------- |
| `$eq`    | Equal to              | `{ age: { $eq: 25 } }` → age = 25 |
| `$ne`    | Not equal             | `{ age: { $ne: 25 } }` → age ≠ 25 |
| `$gt`    | Greater than          | `{ price: { $gt: 100 } }`         |
| `$gte`   | Greater than or equal | `{ price: { $gte: 100 } }`        |
| `$lt`    | Less than             | `{ price: { $lt: 100 } }`         |
| `$lte`   | Less than or equal    | `{ price: { $lte: 100 } }`        |
Example :
```q
// Fetch products priced between 100 and 500.
db.products.find({ price: { $gte: 100, $lte: 500 } })
```
