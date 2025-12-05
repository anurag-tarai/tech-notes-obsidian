## 1. How to Create a Function (Declaration
```js
function greet() {
  console.log("Hello Anurag");
}

greet();  // calling the function
```

- `function` → keyword
- `greet` → function name
- `{}` → function body
- `greet()` → invoking / calling the function

---

## 2. Functions with Parameters

Parameters = inputs to function

```js
function add(a, b) {
  console.log(a + b);
}

add(5, 10);  // 15
```

---

## 3. Functions with Return Value

`return` sends a value back to where the function was called.

```js
function multiply(x, y) {
  return x * y;
}

const result = multiply(4, 5);
console.log(result);  // 20
```

---
## 4. Default Parameters
Provide fallback values.

```js
function greet(name = "Guest") {
  console.log("Hello " + name);
}

greet(); // Hello Guest
```

---
## 5. Rest Parameters
Collects multiple arguments into an array.

```js
function sum(...nums) {
  return nums.reduce((a, b) => a + b);
}

sum(1, 2, 3, 4); // 10
```

---
## 6. Function Scope
Variables inside a function are not accessible outside.

```js
function test() {
  let x = 10;
}
console.log(x); // ❌ Error
```