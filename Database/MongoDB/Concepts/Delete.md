### deleteOne()

```q
db.users.deleteOne({ name: "Amit" })
```

### deleteMany()

```q
db.users.deleteMany({ age: { $lt: 20 } })
```