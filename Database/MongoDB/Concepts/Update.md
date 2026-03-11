update() : is the old method (before MongoDB 3.2)
### updateOne()
Update first matching document.

```q
db.users.updateOne(
  { name: "Anurag" },
  { $set: { city: "Bangalore" } }
)
```
### updateMany()
Update all documents matching the filter.
```q
db.users.updateMany(
  { age: { $lt: 25 } },
  { $set: { status: "student" } }
)
```
### Common update operators:
- `$set` → set or update a field
- `$unset` → remove a field
- `$inc` → increment
- `$push` → add value in array
- `$pull` → remove value from array
- `$lt` -> less than

Example:

```q
db.users.updateOne(
  { name: "Anurag" },
  { $inc: { points: 10 } }
)
```
---