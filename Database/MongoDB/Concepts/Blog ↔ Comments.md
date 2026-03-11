## Blog ↔ Comments (Many → Embed or Reference?)

Two patterns:

---
### Option 1: Embed (few comments)
```json
{
  "_id": 1,
  "title": "MongoDB Guide",
  "comments": [
    { "author": "Anurag", "text": "Great post!" }
  ]
}
```

---
### Option 2: Reference (many comments)

```json
// post
{
  "_id": 1,
  "title": "MongoDB Guide",
  "commentIds": [10,11]
}
```

```json
// comment
{
  "_id": 10,
  "postId": 1,
  "text": "Nice article!"
}
```