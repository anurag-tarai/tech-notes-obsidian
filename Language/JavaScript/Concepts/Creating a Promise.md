Basic structure:
```js
const myPromise = new Promise((resolve, reject) => {
  // async task
});
```

Example with setTimeout:

```js
const fetchData = new Promise((resolve, reject) => {
  setTimeout(() => {
    resolve("Data received!");
  }, 2000);
});
```

> If a Promise is **not inside a function**, it executes immediately.  

> If a Promise is **returned from a function**, it executes only when the function is called.

Example :
```js
let p = new Promise(() => {
  console.log("I run immediately");
});

function test() {
  return new Promise(() => {
    console.log("I run only when called");
  });
}

// test();  // comment this line
```
output:
```js
I run immediately
```