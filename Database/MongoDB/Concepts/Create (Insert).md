Creating Collection :
```q
db.createCollection("users")
```

OR - 
MongoDB provides two main methods:
### insertOne()
Insert a single document.
```c
db.users.insertOne({
  name: "Anurag",
  age: 24,
  city: "Delhi"
})
```

---
### insertMany()

Insert multiple documents.

```c
db.users.insertMany([
  { name: "Amit", age: 28 },
  { name: "Riya", age: 22 }
])
```
If the collection does not exist → MongoDB creates it automatically on first insert.

---

```js
[{
  customerName: "Satay",
  items: [ObjectId('692ced59f6884f0b828de668'), ObjectId('692ced59f6884f0b828de669')],
  totalAmount: 650,
  status: "pending" / "completed"
},
{
  customerName: "Ramakanta",
  items: [ObjectId('692ced59f6884f0b828de66a'), ObjectId('692ced59f6884f0b828de66b')],
  totalAmount: 850,
  status: "pending" / "completed"
},
{
  customerName: "Divayrika",
  items: [ObjectId('692ced59f6884f0b828de66c')
, ObjectId('692ced59f6884f0b828de668')],
  totalAmount: 950,
  status: "pending" / "completed"
}
]

```