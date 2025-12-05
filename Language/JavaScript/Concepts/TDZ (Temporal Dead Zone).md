TDZ is the period between hoisting and actual declaration where the variable exists but is not accessible.
### let & const are hoisted BUT put in TDZ

They exist in memory but cannot be used until the code reaches their line.
```js
console.log(a); // ReferenceError → a is in TDZ
let a = 10;
```