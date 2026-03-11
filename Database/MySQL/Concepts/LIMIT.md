`LIMIT` **cuts the result** to only N rows.
##### E.g : Get first 3 employees
```sql
select emp_name, salary
from employees
order by salary desc
limit 3;
```