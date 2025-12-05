`findOneAndUpdate(filter, update, options)` — update a single document **and return it**

- Returns **old document** by default
    
- Option `{ returnDocument: "after" }` → returns **updated document**
    
---
`findOneAndReplace(filter, replacement, options)` — replace a single document completely **and return it**

- Old document returned by default
    
- Option `{ returnDocument: "after" }` → returns new document
    
---
`findOneAndDelete(filter, options)` — delete a single document **and return it**

- Returns the deleted document
    

---

### **Quick Comparison Table**

|Command|Action|Returns Document?|Notes|
|---|---|---|---|
|`findOneAndUpdate()`|Update one|✅ Yes|Can return old/new document|
|`findOneAndReplace()`|Replace one|✅ Yes|Full document replacement|
|`findOneAndDelete()`|Delete one|✅ Yes|Returns deleted document|

---

💡 **Summary:**  
These are **advanced CRUD helpers** — they combine the operation (update/replace/delete) with **returning the affected document**, unlike the basic `updateOne()` / `deleteOne()`.