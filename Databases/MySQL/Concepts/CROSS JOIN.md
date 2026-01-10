## Definition

> **CROSS JOIN returns the Cartesian product of two tables**,  
> i.e., every row of the first table is combined with every row of the second table.

## Syntax
```sql
SELECT column_name(s)
FROM table1
CROSS JOIN table2;
```

## Key Points

- ❌ No join condition (`ON` not required)
- Result rows =  
    **rows(table1) × rows(table2)**
- Can produce **very large result sets**
- If a `WHERE` condition is added, the result may look like an `INNER JOIN`

---
## Example

If table1 has 3 rows and table2 has 4 rows → result has **12 rows**.

---

## Use Cases
- Generating combinations
- Test data creation
- Mathematical/cartesian operations
