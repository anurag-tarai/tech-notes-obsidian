|Operator|Meaning|Example|
|---|---|---|
|`$in`|Field value matches any value in array|`{ status: { $in: ["Active", "Pending"] } }`|
|`$nin`|Field value matches none in array|`{ status: { $nin: ["Inactive", "Deleted"] } }`|
|`$elemMatch`|Match embedded document in array|`{ scores: { $elemMatch: { math: { $gte: 90 }, english: { $gte: 80 } } } }`|
```q
db.orders.find({
  items: { $elemMatch: { price: { $gt: 500 }, quantity: { $gte: 2 } } }
})
```