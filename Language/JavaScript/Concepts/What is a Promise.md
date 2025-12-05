A **Promise** is an object in JavaScript that represents the **future result** of an asynchronous operation.

It tells JavaScript:
👉 “I’m doing something in the background.  
When I’m done, I’ll either **succeed** or **fail**.”

### A Promise can be in one of `three states`: 
- [Three States of a Promise](Three%20States%20of%20a%20Promise.md)
### resolve() and reject()

Inside a Promise:
- **`resolve(value)`** → marks promise as **fulfilled**
    
- **`reject(error)`** → marks promise as **rejected**

Example:
```js
let p = new Promise((resolve, reject) => {
  let success = true;

  if (success) {
    resolve("Order successful");
  } else {
    reject("Order failed");
  }
});

```