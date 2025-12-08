## 1. `Lexical Environment (LE)` — _“Where the variable lives based on where you wrote the code.”_
A Lexical Environment is the memory space that stores `let`, `const`, and function declarations, and also keeps a reference to its parent scope.

**What it does:**
- Controls scope
- Helps JS find variables using the **scope chain**
- Keeps track of variables based on where the code is written (lexical position)
### **Key idea:**
👉 LE is created **based on the physical position of code** (lexical = written).

### Example:

```js
function hello() {
  let a = 10;   // stored in Lexical Environment
}
```

---

## 2. `Variable Environment (VE)` — _“Special memory for `var` variables.”_

JavaScript keeps `var` variables **separate** from `let`/`const`.
- `var` → goes to **Variable Environment**
- `let`/`const` → go to **Lexical Environment**
### Why separate?
Because `var` has:
- **function scope**
- **hoisting**
- **no block scope**

Example:
```js
function test() {
  var x = 5;    // stored in Variable Environment
  let y = 10;   // stored in Lexical Environment
}
```
---

## 3. `this` Binding — _“Who called the function?”_

`this` tells JS **which object the function belongs to when running**.

Examples:
### Case 1: method call
```js
const obj = {
  name: "Anurag",
  show() { console.log(this.name); }
};

obj.show();  // this = obj
```

### Case 2: normal function
```js
function test() { console.log(this); }
test();  // this = window (browser) or global (Node)
```

### Case 3: arrow function
```js
const fun = () => console.log(this);
```

👉 Arrow functions **do not** have their own `this`.  
They **inherit** `this` from the parent scope.

---

## 4. `arguments Object`— _“All values passed into a normal function.”_

Inside a function, JS automatically creates an **array-like object**:
```js
function add(a, b) {
  console.log(arguments);
}

add(2, 3);
```

Output:
```js
{0: 2, 1: 3, length: 2}
```
- Only in **normal functions**
- Not in arrow functions
- Useful for variable parameters (old way before `...rest`)