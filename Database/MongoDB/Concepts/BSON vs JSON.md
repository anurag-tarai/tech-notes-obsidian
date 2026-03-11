## Summary
[JSON](JSON.md) = human-readable data format  
[BSON](BSON.md) = MongoDB’s binary representation of JSON

---
## Why MongoDB uses BSON?
Because MongoDB needs:
- **Speed** → binary is faster to read & write
- **Efficiency** → compact storage
- **Rich data types** → store real database data (dates, IDs, binary)
- **Better indexing** → numeric & date types can be indexed properly
- **Scalability** → faster parsing across distributed systems

JSON cannot provide these benefits.