**Promise chaining** means linking multiple asynchronous tasks one after another using **`.then()`**, so the output of one `.then()` becomes the input of the next.
- Each step runs **after** the previous one finishes.  
- You return a value or a Promise from each step.
```js
doTask1()
  .then(result1 => doTask2(result1))
  .then(result2 => doTask3(result2))
  .then(result3 => console.log(result3));
```

## Using multiple `.then()`

A `.then()` returns **another Promise**, allowing the next `.then()` to run.

### Example: Step-by-step operations
```js
new Promise((resolve) => {
  resolve(10);
})
  .then(num => {
    console.log("Step 1:", num);  // 10
    return num * 2;
  })
  .then(num => {
    console.log("Step 2:", num);  // 20
    return num + 5;
  })
  .then(num => {
    console.log("Step 3:", num);  // 25
  });
```
### Key point:
Whatever you **return** inside a `.then()` is passed to the **next `.then()`**.