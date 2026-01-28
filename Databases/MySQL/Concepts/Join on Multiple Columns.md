### Definition

> **Joining on multiple columns means using more than one column in the `ON` condition** to match rows between tables.

---
### Syntax

```sql
SELECT column_name(s)
FROM table1
JOIN table2
ON table1.col1 = table2.col1
AND table1.col2 = table2.col2;
```

---
### Example

**Orders**

| OrderID | CustomerID | OrderDate  |
| ------- | ---------- | ---------- |
| 1       | 101        | 2024-01-01 |

**Payments**

|PaymentID|CustomerID|OrderDate|
|---|---|---|
|5001|101|2024-01-01|

```sql
SELECT o.OrderID, p.PaymentID
FROM Orders o
JOIN Payments p
ON o.CustomerID = p.CustomerID
AND o.OrderDate = p.OrderDate;
```

---

### Key Points

- All join conditions must be satisfied (`AND`)
- Used when **single column is not enough**
- Common with **composite keys**

---
### Use Cases

- Composite primary/foreign keys
- Date + ID based matching
- Multi-attribute relationships