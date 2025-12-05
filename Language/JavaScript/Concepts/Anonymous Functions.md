Functions `without a name.`

Used in callbacks:
```js
setTimeout(function() {
  console.log("Delayed");
}, 1000);
```
Or arrow function:
```js
setTimeout(() => console.log("Delayed"), 1000);
```