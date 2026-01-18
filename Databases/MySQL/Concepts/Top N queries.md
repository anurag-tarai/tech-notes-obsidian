### Top 1 highest paid employee
```sql
select emp_name, salary
from employees
order by salary desc
limit 1;
```

### Top 3 highest paid employees
```sql
select emp_name, salary
from employees
order by salary desc
limit 3;
```

### Top 2 employees per department (INTERVIEW 🔥)
```sql
select *
from (
  select emp_name, dept_id, salary,
         dense_rank() over (partition by dept_id order by salary desc) as rnk
  from employees
) x
where rnk <= 2;
```
Don’t worry if this feels advanced—we’ll cover **window functions** later.