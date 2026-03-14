Create a table **Employee** with columns id, name, salary, department. 
```sql
create table employee (
    id int primary key,
    name varchar(40) not null,
    salary decimal(10,2),
    dept varchar(20),
    joining_date date
);
```

Create a table with **DEFAULT value** for salary.
```sql
create table employee(
	id int primary key,
	name varchar(40),
	salary decimal(10,2) default 20000.00
);
```

Create a table with **CHECK constraint** to ensure salary > 0.
```sql
create table employee(
    id int primary key,
    name varchar(40),
    salary decimal(10,2) check (salary > 0)
);
```

Create a table with **AUTO_INCREMENT id**.
```SQL
create table employee(
    id int primary key auto_increment,
    name varchar(40),
    salary decimal(10,2)
);
```

For Postgres :
```sql
create table employee(
    id serial primary key,
    name varchar(40),
    salary decimal(10,2)
);
```

### FK Ref
Create a table Employee with **Foreign Key referencing Department**.
```sql
create table employee (
    id int primary key,
    name varchar(40) not null,
    salary decimal(10,2),
    dept_id int,
    foreign key (dept_id) references department(department_id)
);
```

Create a table Orders referencing Customer table.
```sql
create table Orders(
    order_id int primary key,
    customer_id int,
    product_id int,
    total_amount decimal(10,2),
    foreign key (customer_id) references customer(id),
    foreign key (product_id) references product(id)
);
```

**ON DELETE CASCADE** : If a **row in the parent table is deleted**, all **related rows in the child table are automatically deleted**.

**ON UPDATE CASCADE** : If the primary key in the parent table is updated, the foreign key in the child table updates automatically.

# Just Go Through These Questions GPT
```java
### Alter Table

16. Add a new column **email** to Employee table.
    
17. Add a new column **date_of_joining**.
    
18. Modify column **salary datatype**.
    
19. Rename column **name to employee_name**.
    
20. Drop column **email** from table.
    

---

### Constraints Modification

21. Add **PRIMARY KEY** to an existing table.
    
22. Add **UNIQUE constraint** to a column.
    
23. Add **FOREIGN KEY constraint** to existing table.
    
24. Remove **FOREIGN KEY constraint**.
    
25. Drop **UNIQUE constraint**.
    

---

### Table Management

26. Rename table **Employee to Employees**.
    
27. Delete all rows without deleting table structure.
    
28. Drop table **Project**.
    
29. Create an **INDEX on employee name**.
    
30. Create a **VIEW for employees with salary > 50,000**.
```