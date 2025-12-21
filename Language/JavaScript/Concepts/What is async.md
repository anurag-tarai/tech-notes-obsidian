### Definition:
`async` is a keyword used before a function to make it **asynchronous**.

```js
async function getData() {
}
```

### Important rule:
 **An async function always returns a Promise**

Example:
```js
async function getNumber() {
  return 5;
}

console.log(getNumber());
```

output:
```js
Promise { <fulfilled>: 5 }
```
Even though we returned `10`, JS **wraps it in a Promise**.