## Definition

> **RIGHT JOIN returns all records from the right table and the matching records from the left table.  
> If a row in the right table has **no match in the left table**, then **left table columns are filled with NULL**
## Syntax
```sql
SELECT column_name(s)
FROM table1
RIGHT JOIN table2
ON table1.common_column = table2.common_column;
```

## Example Tables

### Orders (Left table)

|OrderID|CustomerID|
|---|---|
|10308|2|
|10309|37|
|10310|77|

### Customers (Right table)

|CustomerID|CustomerName|
|---|---|
|1|Alfreds Futterkiste|
|2|Ana Trujillo Emparedados y helados|
|3|Antonio Moreno Taquería|

---

## Example Query

```sql
SELECT Orders.OrderID, Customers.CustomerName  
FROM Orders  
RIGHT JOIN Customers  
ON Orders.CustomerID = Customers.CustomerID;
```

---

## Output

| OrderID | CustomerName                       |
| ------- | ---------------------------------- |
| NULL    | Alfreds Futterkiste                |
| 10308   | Ana Trujillo Emparedados y helados |
| NULL    | Antonio Moreno Taquería            |