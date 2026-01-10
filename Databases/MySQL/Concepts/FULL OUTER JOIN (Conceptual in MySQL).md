## Definition

> **FULL OUTER JOIN returns all records when there is a match in either table.  
> Unmatched rows contain NULL values.**

## MySQL Limitation

❌ MySQL does **not support FULL OUTER JOIN directly**

---
## MySQL Workaround
```sql
SELECT *
FROM table1
LEFT JOIN table2 ON table1.id = table2.id
UNION
SELECT *
FROM table1
RIGHT JOIN table2 ON table1.id = table2.id;
```
## Key Point
- Combines results of **LEFT JOIN and RIGHT JOIN**
- Includes **all rows from both tables**