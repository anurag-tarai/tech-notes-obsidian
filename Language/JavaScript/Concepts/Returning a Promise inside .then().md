```js
.then(() => {
  return fetchData(); // returns a promise → chaining waits
})
```

If you **don’t** return the promise:
```js
.then(() => {
  fetchData(); // ❌ not returned → next .then() runs immediately
})
```

This causes bugs like:
- next `.then()` running before async task finishes
- incorrect values
- unexpected ordering

👉 **Add this rule: Always return your Promise inside `.then()` if you want the chain to wait.**