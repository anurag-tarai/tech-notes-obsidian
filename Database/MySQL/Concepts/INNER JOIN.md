> The `INNER JOIN` keyword selects records that have matching values in both tables.

### INNER JOIN Syntax
```sql
SELECT _column_name(s)_  
FROM _table1_  
INNER JOIN _table2  
_ON _table1.column_name_ = _table2.column_name_;
```

---
## Demo Database
Below is a selection from the "Orders" table:

| OrderID | CustomerID | EmployeeID | OrderDate  | ShipperID |
| ------- | ---------- | ---------- | ---------- | --------- |
| 10308   | 2          | 7          | 1996-09-18 | 3         |
| 10309   | 37         | 3          | 1996-09-19 | 1         |
| 10310   | 77         | 8          | 1996-09-20 | 2         |
And a selection from the "Customers" table:

|CustomerID|CustomerName|ContactName|Address|City|PostalCode|Country|
|---|---|---|---|---|---|---|
|1|Alfreds Futterkiste|Maria Anders|Obere Str. 57|Berlin|12209|Germany|
|2|Ana Trujillo Emparedados y helados|Ana Trujillo|Avda. de la Constitución 2222|México D.F.|05021|Mexico|
|3|Antonio Moreno Taquería|Antonio Moreno|Mataderos 2312|México D.F.|05023|Mexico|

## Example
The following SQL statement selects all orders with customer information:
```sql
SELECT Orders.OrderID, Customers.CustomerName  
FROM Orders  
INNER JOIN Customers ON Orders.CustomerID = Customers.CustomerID;
```

Output :

|OrderID|CustomerName|
|--:|---|
|10308|Ana Trujillo Emparedados y helados|

---
## JOIN Three Tables
```sql
SELECT Orders.OrderID, Customers.CustomerName, Shippers.ShipperName  
FROM ((Orders  
INNER JOIN Customers ON Orders.CustomerID = Customers.CustomerID)  
INNER JOIN Shippers ON Orders.ShipperID = Shippers.ShipperID);
```