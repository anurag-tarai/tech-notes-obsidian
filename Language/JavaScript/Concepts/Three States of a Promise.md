### **1. pending**
- The async task is still running
- No result yet
- Neither success nor failure
	
Example:
```js
let p = new Promise(() => {});
console.log(p);  // Promise { <pending> }
```

---
### **2. fulfilled**
- The async task finished successfully
- Promise gives a result
- Calls the `resolve()` function

Example:
```js
let p = new Promise((resolve) => {
  resolve("Task completed!");
});
```

---

### **3. rejected**
- The async task failed
- Promise gives an error
- Calls the `reject()` function

Example:
```js
let p = new Promise((resolve, reject) => {
  reject("Something went wrong!");
});
```