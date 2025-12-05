Embed (nested documents) when:
- The data is **always accessed together**
- The relationship is **1-to-few**
- The child entity **does not need to stand alone**
- You want **better read performance**

**Example (Good for embedding):**
`User → Address`

```json
{
  "name": "Anurag",
  "email": "a@a.com",
  "address": {
    "city": "Bhubaneswar",
    "pin": 751001
  }
}
```

### Why embed?
- No second query
- Faster reads
- Simple JSON response