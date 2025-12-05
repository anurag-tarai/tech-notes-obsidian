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