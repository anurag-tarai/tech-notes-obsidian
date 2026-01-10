## Definition

> **A SELF JOIN is a join where a table is joined with itself** to compare rows within the same table.

## Syntax
```sql
SELECT A.column, B.column
FROM table A
JOIN table B
ON A.common_column = B.common_column;
```

## Key Points
- Uses **table aliases**
- Same table appears **twice**
- Can be INNER, LEFT, etc., logically
## Example (Employee–Manager)
```sql
SELECT e.name AS Employee, m.name AS Manager
FROM Employees e
LEFT JOIN Employees m
ON e.manager_id = m.emp_id;
```