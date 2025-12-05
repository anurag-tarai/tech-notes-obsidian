If **any `.then()` throws an error** or returns `reject()`:
- All the **next** `.then()` steps are skipped  
- The error jumps to the nearest `.catch()`

---

### Example: Error in the middle of chain

```js
new Promise((resolve) => resolve(10))
  .then(num => {
    console.log("Step 1:", num);
    return num * 2;
  })
  .then(num => {
    throw new Error("Something went wrong in Step 2");
  })
  .then(num => {
    console.log("Step 3:", num); // ❌ skipped
  })
  .catch(err => {
    console.log("Caught:", err.message);
  });
```

### Output:
```bash
Step 1: 10
Caught: Something went wrong in Step 2
```

### What happens?

- Step 2 throws error
- Step 3 gets skipped
- Error moves down to `.catch()` automatically

This is called **error propagation**.

---

## Rules of Error Propagation

##### Rule 1: Any error jumps to the nearest `.catch()`
##### Rule 2: `.catch()` also returns a Promise, so chaining continues after it

Example:
```js
new Promise((resolve) => resolve(10))
  .then(num => {
    throw "Error in Step 1";
  })
  .catch(err => {
    console.log("Handled:", err);
    return 20; // continues chain
  })
  .then(num => {
    console.log("Next step:", num);
  });
```
Output:
```bash
Handled: Error in Step 1
Next step: 20
```

---

##### ✔ Rule 3: If `.catch()` throws another error, it also propagates to next catch

```js
Promise.resolve()
  .then(() => { throw "Err1"; })
  .catch(err => {
    console.log("Handled first:", err);
    throw "Err2";
  })
  .catch(err => {
    console.log("Handled second:", err);
  });
```

Output:
```js
Handled first: Err1
Handled second: Err2
```

---

##### Rule 4: `.finally()` does NOT receive data

- It does NOT get the resolved value
- It does NOT catch errors
- It only runs after everything

```js
Promise.reject("Boom")
  .finally(() => console.log("Cleanup"))
  .catch(err => console.log(err));
```
Output:
```js
Cleanup
Boom
```
