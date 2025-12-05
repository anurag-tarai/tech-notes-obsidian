JSON = **JavaScript Object Notation**  
A text-based format used for data exchange (APIs, config files).
### Key points
- Human-readable
- Text format
- Limited data types:
    - string
    - number
    - boolean
    - null
    - array
    - object
### Example JSON

```js
{
  "name": "Anurag",
  "age": 25,
  "isActive": true
}
```
But JSON has **limitations**:
- No special data types (e.g., Date, ObjectId, Binary data)
- Not optimized for:
    - fast storage
    - fast scanning
    - database-level performance
- Everything stored as text → slower for machines