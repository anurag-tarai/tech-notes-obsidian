Hoisting is JavaScript’s default behavior of moving variable and function declarations to the top of their scope before code execution.

Important points:
- Only **declarations** are hoisted
- **Initializations (values)** are **NOT** hoisted
- Behavior differs for `var`, `let`, and `const`
---
### Explaination
Before running your code, JavaScript does a **two-pass process**:

- **Memory creation phase** → declarations are stored (hoisted)
- **Execution phase** → code runs line-by-line

##### 1. How `var` Hoisting Works
- `var` is hoisted and **initialized with `undefined`**
- You can access it before declaration (but value will be `undefined`)
##### 2. How `let` and `const` Hoisting Works (TDZ)
- `let` and `const` are hoisted but **NOT initialized**
- They stay in the **Temporal Dead Zone (TDZ)** until the line where they are declared
- Accessing them before declaration causes a **ReferenceError**
##### 3. Function Hoisting
Function declarations are fully hoisted:
```js
sayHi(); // "Hello"

function sayHi() {
  console.log("Hello");
}
```
Function expressions are NOT fully hoisted:
```js
sayHello(); // ❌ TypeError (sayHello is undefined)

var sayHello = function() {
  console.log("Hello");
};
```