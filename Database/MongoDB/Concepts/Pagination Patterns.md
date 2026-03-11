### a) Skip-Limit Pagination

```q
db.products.find().sort({ _id: 1 }).skip(20).limit(10)
```

⚠ Slow for large datasets.

### b) ObjectId-based Pagination (Recommended)

```q
// First page
db.products.find().sort({ _id: 1 }).limit(10)

// Next page
db.products.find({ _id: { $gt: ObjectId("LAST_ID") } })
           .sort({ _id: 1 }).limit(10)
```

✅ Fast and efficient for large collections.