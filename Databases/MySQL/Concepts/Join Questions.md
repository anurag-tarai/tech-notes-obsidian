### `employees` 

|emp_id|emp_name|dept_id|salary|
|---|---|---|---|
|1|Rahul|10|50000|
|2|Ankit|20|60000|
|3|Priya|10|55000|
|4|Neha|NULL|45000|
|5|Aman|30|70000|

### `departments`

|dept_id|dept_name|
|---|---|
|10|Engineering|
|20|HR|
|30|Sales|
|40|Marketing|

### `projects`

| project_id | emp_id | project_name |
| ---------- | ------ | ------------ |
| 101        | 1      | Website      |
| 102        | 2      | Recruitment  |
| 103        | 1      | Backend      |
| 104        | 5      | CRM          |

### **Q4**

Show **department names** that **have no employees**.

### **Q10**

Get employee names who work in the **same department as Rahul** (do not hardcode dept_id).

### **Q20**

Find employees who **share a project with Rahul** (excluding Rahul).