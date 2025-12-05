Primitive = immutable + stored by value.
### 1. **String**
A text of characters enclosed in quotes
```js
let name = "Anurag";
```

### 2. **Number**
Represents integers + floating values.
```js
let age = 20;
let price = 99.99;
```

### 3. **BigInt**
For very large integers beyond `Number.MAX_SAFE_INTEGER`.
```js
let big = 12345678901234567890n;
```

### 4. **Boolean**
True/false values.
```js
let isLoggedIn = true;
```

### 5. **Undefined**
A variable declared but not assigned.
```js
let x;
console.log(x); // undefined
```

### 6. **Null**
Intentional empty value.
```js
let data = null;
```

### 7. **Symbol**
Unique and immutable identifiers.
```js
let id = Symbol("userId");
```
