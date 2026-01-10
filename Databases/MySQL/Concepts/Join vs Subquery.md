## JOIN

> **JOIN combines rows from multiple tables in a single query result.**

---

## Subquery

> **A subquery is a query inside another query**, used to filter or compute values.

---

## Example Problem

**Find customers who have placed orders**

---

### Using JOIN
```sql
SELECT DISTINCT c.CustomerName
FROM Customers c
JOIN Orders o
ON c.CustomerID = o.CustomerID;
```
JOIN  ≡  INNER JOIN

---

### Using Subquery
```sql
SELECT DISTINCT c.CustomerName
FROM Customers c
JOIN Orders o
ON c.CustomerID = o.CustomerID;

```

---

## Comparison: JOIN vs Subquery

|Feature|JOIN|Subquery|
|---|---|---|
|Performance|Faster (usually)|Slower for large data|
|Readability|Better for relationships|Simpler for conditions|
|Result Type|Combined columns|Filtered rows|
|Optimization|Optimizer-friendly|May execute repeatedly|
|Best For|Fetching related data|Existence / filtering|

---

## Important Notes (Interview ⭐)

- **JOIN is generally preferred** for performance
- Subqueries are useful for:
    - `IN`, `EXISTS`
    - Scalar values
- Many subqueries can be **rewritten as JOINs**

---

### EXISTS vs JOIN (Extra Tip)

```sql
SELECT CustomerName
FROM Customers c
WHERE EXISTS (
    SELECT 1
    FROM Orders o
    WHERE o.CustomerID = c.CustomerID
);
```

✔ Efficient for existence checks