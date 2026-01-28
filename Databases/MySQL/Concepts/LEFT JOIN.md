## Definition
> **LEFT JOIN returns all rows from the left table (Orders)**  
> and matching rows from the right table (Customers).  
> If no match → `NULL`.

Mean : If there is **no match in the right table**, the right table’s columns are filled with **NULL**

```sql
SELECT _column_name(s)_  
FROM _table1_  
LEFT JOIN _table2  
_ON _table1.column_name_ = _table2.column_name_;
```

## Example Tables

### Orders

|OrderID|CustomerID|
|---|---|
|10308|2|
|10309|37|
|10310|77|

### Customers

| CustomerID | CustomerName                       |
| ---------- | ---------------------------------- |
| 1          | Alfreds Futterkiste                |
| 2          | Ana Trujillo Emparedados y helados |
| 3          | Antonio Moreno Taquería            |

## LEFT JOIN Query

```sql
SELECT Orders.OrderID, Customers.CustomerName  
FROM Orders  
LEFT JOIN Customers  
ON Orders.CustomerID = Customers.CustomerID;
```
## Output

|OrderID|CustomerName|
|---|---|
|10308|Ana Trujillo Emparedados y helados|
|10309|NULL|
|10310|NULL|