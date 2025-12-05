### **User ↔ Orders (1:Many Large → Referenced)**

User:
```json
{
  "_id": 1,
  "name": "Anurag",
  "orders": [1001, 1002]
}
```

Order:
```json
{
  "_id": 1001,
  "total": 599,
  "status": "Delivered"
}
```

---