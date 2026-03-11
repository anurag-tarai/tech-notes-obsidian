## Definition

>  **SELF JOIN is used to join a table with itself to represent relationships between rows in the same table, such as employees and their managers.**

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