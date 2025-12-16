A **function expression** in JavaScript is a function that is **assigned to a variable**.  
The function is **created at runtime** and **does not get hoisted like function declarations**.
```js
const greet = function() {
  console.log("Hello");
};

greet();
```
Here:

- `greet` → variable
    
- `function () { ... }` → function expression

### Key Points

- Function expressions are **not hoisted**
- They can be **anonymous** or **named**
- The function can be used **only after it is defined**
### Example (Named Function Expression)
```js
const factorial = function fact(n) {
  if (n === 1) return 1;
  return n * fact(n - 1);
};

console.log(factorial(5)); // 120
```

## Hoisting Difference
❌ Function Expression (Error)
```js
sayHi(); // ❌ Error

const sayHi = function () {
  console.log("Hi");
};
```

✅ Function Declaration (Works)
```js
sayHi(); // ✅ Works

function sayHi() {
  console.log("Hi");
}
```
---
