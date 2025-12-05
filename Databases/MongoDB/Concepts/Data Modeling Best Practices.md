### **1. Model data based on queries, not structure**

MongoDB is not SQL.  
Design for the **most common queries**.

### **2. Embed for small + frequent read data**

### **3. Reference for large + shared + frequently updated data**

### **4. Avoid deep nesting**

Don’t go beyond **2–3 levels**.

Bad:
`{ level1: { level2: { level3: { level4: {} }}}}`

### **5. Keep documents under 16MB** (MongoDB limit)

### **6. Use ObjectId for references**

### **7. Avoid unnecessary joins (`$lookup`)**

### **8. Duplicate only when it improves performance**

This is called **controlled denormalization**.

Example:  
Store user `name` inside order for faster history loading.

### **9. Plan indexes early**

Every frequently used field should be indexed.