`Employee(emp_id, name, salary, dept_id, join_date)`
Find the **second highest salary**. :
```sql
SELECT salary 
FROM Employee
ORDER BY salary DESC
LIMIT 1 OFFSET 1;

My Answer:
SELECT MAX(salary) AS second_highest_salary
FROM Employee
WHERE salary < (SELECT MAX(salary) FROM Employee);
```

3rd Highest 
```sql
SELECT DISTINCT salary 
FROM Employees 
ORDER BY salary DESC 
LIMIT 1 OFFSET 2;

SELECT MAX(salary)
FROM Employees
WHERE salary < (
    SELECT MAX(salary)
    FROM Employees
    WHERE salary < (
        SELECT MAX(salary) FROM Employees
    )
);
```
`Employee(emp_id, name, salary, dept_id, join_date)

---
Find the **Nth highest salary**. `Window Function` - finish all then in the end
```SQL
SELECT salary
FROM (
    SELECT salary, DENSE_RANK() OVER (ORDER BY salary DESC) AS rnk
    FROM emp
) t
WHERE rnk = N;
```
---
Find **duplicate records** in a table.

```sql
SELECT *, COUNT(*) AS cnt
FROM employees
GROUP BY emp_id, name, salary, dept_id, join_date
HAVING COUNT(*) > 1;
```
---
Delete **duplicate records**.

---
Find employees whose **salary is between 30,000 and 50,000**.
```sql
SELECT *
FROM employees
WHERE salary BETWEEN 30000 AND 50000


my answer:
SELECT *
FROM employees
WHERE salary >= 30000 AND salary <= 50000;
```

Find employees whose **name starts with 'A'**.
```sql
SELECT *
FROM employees
WHERE name LIKE 'A%';
```
`'A%'` → matches any name **starting with 'A'**
- `%` → zero or more characters
    
- `_` → exactly one character
---
`Employee(emp_id, name, salary, dept_id, join_date)
Count employees **in each department**.
```sql
SELECT dept_id, COUNT(*) AS total_employees
FROM employees
GROUP BY dept_id;
```
---
Find departments having **more than 3 employees**.
```sql
SELECT dept_id, COUNT(*) AS employee_count
FROM employees
GROUP BY dept_id
HAVING COUNT(*) > 3;
```

---
 Find employees who **joined in the last 30 days**.
 ```sql
 SELECT *
FROM employees
WHERE join_date >= CURDATE() - INTERVAL 30 DAY;
 ```
 - `CURDATE()` → today’s date
    
- `INTERVAL 30 DAY` → 30 days before today
    
- `>=` ensures we include all employees who joined **in the last 30 days**
---
`Employee(emp_id, name, salary, dept_id, join_date)
 Find employees who **joined in the same year**.
 ```sql
 SELECT EXTRACT(YEAR FROM join_date) AS join_year, COUNT(*) AS total_employees
FROM employee
GROUP BY EXTRACT(YEAR FROM join_date)
HAVING COUNT(*) > 1;


if want to show the emp details
SELECT *
FROM employee
WHERE EXTRACT(YEAR FROM join_date) IN (
    SELECT EXTRACT(YEAR FROM join_date)
    FROM employee
    GROUP BY EXTRACT(YEAR FROM join_date)
    HAVING COUNT(*) > 1
);
 ```
---
Find **employees who earn more than their manager**. 
  ```sql
SELECT e1.name AS employee, e2.name AS manager
FROM emp e1
JOIN emp e2
ON e1.manager_id = e2.emp_id
WHERE e1.salary > e2.salary;
  ```
---
Find **highest salary employee in each department**. 
```sql
(Correlated Subquery)
SELECT *
FROM emp e
WHERE salary = (
    SELECT MAX(salary)
    FROM emp
    WHERE dept_id = e.dept_id
);

# JOIN Solutions
SELECT e.*
FROM emp e
JOIN (
    SELECT dept_id, MAX(salary) AS max_sal
    FROM emp
    GROUP BY dept_id
) t
ON e.dept_id = t.dept_id
AND e.salary = t.max_sal;
```
---
Find **second highest salary in each department**.
```java
SELECT e.dept_id, MAX(e.salary) AS second_highest
FROM emp e
JOIN (
    SELECT dept_id, MAX(salary) AS max_salary
    FROM emp
    GROUP BY dept_id
) r
ON e.dept_id = r.dept_id
WHERE e.salary < r.max_salary
GROUP BY e.dept_id;
```
---
Find **departments having more than 5 employees**.
```java
SELECT d.dept_name, COUNT(*) AS emp_count
FROM employee e
INNER JOIN dept d
ON e.dept_id = d.dept_id
GROUP BY d.dept_name
HAVING COUNT(*) > 5;
```

Find **department with highest average salary**.
```sql
SELECT dept_id, AVG(salary) AS avg_salary
FROM emp
GROUP BY dept_id
ORDER BY avg_salary DESC
LIMIT 1;
```
---
**Customers**

customer_id  
name  
city

**Orders**

order_id  
customer_id  
order_date  
amount

---
 Find **total order amount for each customer**.
```sql
SELECT c.customer_id, c.name, SUM(o.amount) AS total_amount
FROM Customers c
INNER JOIN Orders o ON c.customer_id = o.customer_id
GROUP BY c.customer_id, c.name;
```
---
Find the **customer with highest total order amount**.
```sql
SELECT c.customer_id, c.name, SUM(o.amount) AS total_amount
FROM Customers c
INNER JOIN Orders o ON c.customer_id = o.customer_id
GROUP BY c.customer_id, c.name
ORDER BY total_amount DESC
LIMIT 1;
```
---
Find customers who **placed more than 3 orders**.
```sql
SELECT c.customer_id, c.name, c.city, COUNT(o.order_id) AS total_orders
FROM Customers c
INNER JOIN Orders o ON c.customer_id = o.customer_id
GROUP BY c.customer_id, c.name, c.city
HAVING COUNT(o.order_id) > 3;
```

