### find() → returns multiple documents
```q
db.users.find()
```
### With filter:
```q
db.users.find({ age: { $gt: 25 } })
```
### With projection (select fields)

```js
db.users.find(
  { age: { $gt: 25 } },
  { name: 1, age: 1, _id: 0 }
)
```
### findOne() → returns the first matching document

```js
db.users.findOne({ name: "Anurag" })
```

---