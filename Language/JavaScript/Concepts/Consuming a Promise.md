You use **.then()**, **.catch()**, and **.finally()** to read/use the result of a Promise.

Example :
```js
const fetchData = new Promise((resolve, reject) => {
  setTimeout(() => {
    resolve("Data received!");
  }, 2000);
});
```
### 1. `.then()` → runs when Promise is fulfilled
```js
fetchData.then((result) => {
  console.log(result);     // "Data received!"
});
```
---

### 2. `.catch()` → runs when Promise is rejected

```js
fetchData.catch((error) => {
  console.log("Error:", error);
});
```

---

### 3. `.finally()` → runs ALWAYS (success or failure)

Useful for cleanup (closing loaders, buttons, spinners).
```js
fetchData.finally(() => {
  console.log("Task finished!");
});
```

---