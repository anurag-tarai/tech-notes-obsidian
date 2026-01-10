### Definition
> In **SQL**, a **JOIN** is used to **combine rows from two or more tables** based on a **related column** between them.

Or 

> **JOIN helps you fetch data that is spread across multiple tables.** 

### Why JOIN is needed ?
In relational databases, data is stored in **separate tables** to avoid duplication.  
To get meaningful results, we **join** these tables using a common key (usually a **primary key–foreign key** relationship).

### Basic Syntax
```sql
SELECT columns
FROM table1
JOIN table2
ON table1.common_column = table2.common_column;
```