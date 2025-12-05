Used to **safely access nested properties**.
- If a property is `null` or `undefined`, it returns `undefined` instead of throwing an error.

**Example:**
```js
const user = { name: "John", address: null };
console.log(user.address?.city); // undefined
```
Can also be used with **function calls**:
```js
user.getName?.(); // safely calls if getName exists
```

**Benefits:**
- Prevents runtime errors
- Reduces **if checks** for deep objects