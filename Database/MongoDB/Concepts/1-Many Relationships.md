### **Two choices:**
---
### A. Embed when “few”

Example: User with few (2–5) addresses

```json
{
  "name": "Anurag",
  "addresses": [
    { "city": "BBSR" },
    { "city": "Cuttack" }
  ]
}

```

---
### B. Reference when “many”

Example:
User → Notifications (thousands)
    
```json
{
  "_id": 1,
  "name": "Anurag",
  "notificationIds": [1,2,3,4]
}
```

```json
{
  "_id": 1,
  "message": "Order shipped",
  "read": false
}
```