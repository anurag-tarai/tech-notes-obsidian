# 1️⃣ Most Important Single Table SQL Questions

Assume table:

`Employee(emp_id, name, salary, dept_id, join_date)`

1. Find the **second highest salary**. `Done`
    
2. Find the **third highest salary**. `Done`
    
3. Find the **Nth highest salary**. `Window Function` - finish all then in the end
    
4. Find employees whose **salary is greater than the average salary**. `Done`
    
5. Find employees whose **salary is equal to the maximum salary**. `Done`
    
6. Find **duplicate records** in a table. `Again`
    
7. Delete **duplicate records**. `In the end`
    
8. Find employees whose **salary is between 30,000 and 50,000**.`Done`
    
9. Find employees whose **name starts with 'A'**.`Done`
    
10. Find employees whose **name ends with 'n'**. `Done`
    
11. Find employees whose **name contains 'ar'**. `Done`
    
12. Count **total number of employees**.`Done`
    
13. Count employees **in each department**. `Done`
    
14. Find departments having **more than 3 employees**. `Done`
    
15. Find employees who **joined in the last 30 days**. `Again`
    
16. Find employees who **joined in the same year**. `Done`
    
17. Find employees with **same salary**. `Done`
    
18. Find **minimum salary in each department**. `Done`
    
19. Find **maximum salary in each department**. `Done`
    
20. Find **average salary of each department**. `Done`
    

---

# 2️⃣ Most Important Multi-Table SQL Questions

Assume tables:

**Employee**

emp_id  
name  
salary  
dept_id  
manager_id

**Department**

dept_id  
dept_name

---
 
21. Find **employee name with department name**. `Done`
    
22. Find **employees who do not belong to any department**. `Done`
    
23. Find **departments with no employees**. `Done`
    
24. Find **employees who earn more than their manager**. `Done`
    
25. Find **employees and their manager names**. `Done`
    
26. Find **highest salary employee in each department**. `Again`
    
27. Find **second highest salary in each department**. `Good`
    
28. Find **departments having more than 5 employees**. `Done`
    
29. Find **employees whose salary is greater than department average**. `Done`
    
30. Find **department with highest average salary**. `Again`

---

# 3️⃣ Customer & Order Type Questions (Very Common)

Tables:

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

31. Find customers who **placed orders**. `Done`
    
32. Find customers who **never placed any order**.  `Done`
    
33. Find **total order amount for each customer**. `Done`
    
34. Find the **customer with highest total order amount**. `Again`
    
35. Find customers who **placed more than 3 orders**. `Again`
    

---

# 4️⃣ Product & Order Questions

Tables:

**Products**

product_id  
product_name  
price

**Order_Items**

order_id  
product_id  
quantity

---

36. Find **products that were ordered at least once**.
    
37. Find **products that were never ordered**.
    
38. Find **most sold product**.
    
39. Find **total sales amount for each product**.
    
40. Find **top 5 most sold products**.

