Function declarations are hoisted (moved to top at runtime).

```js
greet(); // Works

function greet() {
  console.log("Hello");
}
```

But function expressions are NOT hoisted:
```js
greet(); // ❌ Error

const greet = function() {
  console.log("Hello");
};
```