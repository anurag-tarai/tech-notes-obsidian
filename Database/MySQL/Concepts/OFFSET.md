`OFFSET` **skips rows before returning data**
#### Example: Skip first 2 rows
```sql
select emp_name, salary
from employees
order by salary desc
limit 3 offset 2;
```
**Explanation:**
- Sort salaries high → low
- Skip first **2**
- Show next **3**

## OFFSET for pagination (page concept)
|Page|Query|
|---|---|
|Page 1|`LIMIT 5 OFFSET 0`|
|Page 2|`LIMIT 5 OFFSET 5`|
|Page 3|`LIMIT 5 OFFSET 10`|