Strings enclosed in **backticks `` ` ` ``**.  
Allows **interpolation** and **multi-line strings**.
```js
let name = "John";
let age = 25;

// Interpolation
let greeting = `Hello, my name is ${name} and I am ${age} years old.`;
console.log(greeting);

// Multi-line
let text = `This is line 1
This is line 2`;
console.log(text);
```
**Notes:**

- `${expression}` → evaluates any JS expression inside.
- Great for dynamic strings and HTML templates.