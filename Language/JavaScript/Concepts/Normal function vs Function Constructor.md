## 1️⃣ Normal function (regular use)
```js
function greet(name) {
  return "Hello " + name;
}

greet("Anurag"); // "Hello Anurag"
```
### What is this?
- Just a **function**
- You **call it normally**
- It **returns a value**
- `this` is **not important** here

👉 Used for:
- calculations
- utilities
- business logic
---
## 2️⃣ Function Constructor

> A function becomes a constructor only when called with `new`.
```js
function User(name) {
  this.name = name;
}

const u1 = new User("Anurag");
```

### What is this?
- Still a **normal function**
- BUT it is **used with `new`**
- It is used to **create objects**
- `this` is VERY important

👉 Used for:
- creating multiple similar objects
- like a **blueprint**
### What happening when use new to call?
```js
new User("Anurag");
```
JavaScript does magic 👇
1. Creates empty object `{}`
2. Sets `this` to that object
3. Links prototype
4. Returns the object

---
> The difference is HOW you call it
## Call vs new (THIS is the key)
Normal function
```js
function show() {
  console.log(this);
}

show(); 
// window (non-strict)
// undefined (strict)
```

Constructor function
```js
function Show() {
  console.log(this);
}

new Show();
// {}
```
---
## Naming convention
Constructor functions are written in **PascalCase**
```js
function User() {}
function Car() {}
function Product() {}
```
Normal functions use camelCase:
```js
function calculateSum() {}
```

---
## Why constructors existed (history)
Before ES6 (`class`), JS had **NO classes**.

So developers used:
```js
function User() {}
```
to behave like a **class**.

Later ES6 added:
```js
class User {}
```
But internally it still uses **prototypes**.

---
## Constructor vs class (truth)
Constructor function:
```js
function User(name) {
  this.name = name;
}

User.prototype.greet = function () {
  console.log("Hi " + this.name);
};
```

ES6 class:
```js
class User {
  constructor(name) {
    this.name = name;
  }

  greet() {
    console.log("Hi " + this.name);
  }
}
```
💡 `class` is **just cleaner syntax**.
