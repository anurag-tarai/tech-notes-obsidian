## Definition

>**FULL OUTER JOIN returns all records from both tables. Matching rows from the two tables are combined, and for non-matching rows from either table filled with NULL in place of missing values.

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