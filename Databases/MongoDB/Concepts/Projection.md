Control which fields are returned:

- `1` → include field
- `0` → exclude field
```q
db.users.find(
  { age: { $gte: 18 } },
  { name: 1, email: 1, _id: 0 }
)
```
Returns only `name` and `email`.