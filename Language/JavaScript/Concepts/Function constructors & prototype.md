Example:
```js
function User(name) {
  this.name = name;
}

User.prototype.greet = function () {
  console.log("Hello, " + this.name);
};

const u1 = new User("Anurag");
const u2 = new User("Rahul");

u1.greet(); // Hello, Anurag
u2.greet(); // Hello, Rahul
```

## step-by-step Explanation
```js
function User(name) {
  this.name = name;
}
```
This is a **function constructor**.

> When you use it with `new`, JavaScript does **4 hidden steps**.
```js
const u1 = new User("Anurag");
```

### Step 1: Create an empty object
```js
const u1 = {};
```

### Step 2: Link the object to the prototype
```js
u1.__proto__ = User.prototype;
```
Now `u1` is _connected_ to `User.prototype`.

### Step 3: Call the constructor with `this = u1`
```js
User.call(u1, "Anurag");
```
So inside the function:
```js
this.name = name;
// becomes
u1.name = "Anurag";
```

### Step 4: Return the object
```js
return u1;
```

#### Where does `greet` live?
```js
User.prototype.greet = function () {
  console.log("Hello, " + this.name);
};
```
🚫 **`greet` is NOT inside `u1`**  
🚫 **`greet` is NOT copied**
Instead:
```js
User.prototype = {
  greet: function () { ... }
}
```

So the structure is:
```js
u1
 ├─ name: "Anurag"
 └─ __proto__ ──► User.prototype
                    └─ greet()
```
Same for `u2`.

#### What happens when you call `u1.greet()`?
JavaScript looks for `greet` in this order 👇

Step 1: Check inside `u1`
```js
u1 = {
  name: "Anurag"
}
```
❌ Not found

Step 2: Go to `u1.__proto__`
```js
u1.__proto__ === User.prototype
```
✅ Found `greet`

Step 3: Call it with `this = u1`
```js
console.log("Hello, " + this.name);
```
`this.name` → `"Anurag"`

output:
```js
Hello, Anurag
```
#### Why does `u2.greet()` print Rahul?
Because `this` depends on **who calls the function**.
```js
u2.greet();
```
Now :
```js
this === u2
this.name === "Rahul"
```
Same function.  
Different `this`

#### Why is this memory-efficient?
❌ BAD (each object gets its own copy):
```js
function User(name) {
  this.name = name;
  this.greet = function () {
    console.log("Hello, " + this.name);
  };
}
```
If you create **10,000 users** → **10,000 greet functions in memory** ❌

✅ GOOD (prototype):
```js
User.prototype.greet = function () { ... };
```
Now:
- **1 greet function**
- **Shared by all instances**
- Less memory
- Faster object creation

#### Final mental model
>Objects don’t copy methods.  
  They delegate method lookup to their prototype.

```js
u1 → User.prototype → Object.prototype → null
```
