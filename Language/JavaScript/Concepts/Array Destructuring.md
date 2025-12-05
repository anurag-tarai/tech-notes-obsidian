Array Destructuring allows you to **extract values from an array** and assign them to variables in a single, simple step.

Example:
```js
let [a, b, c] = [10, 20, 30];
let [x, , y] = [1, 2, 3]; // skip 2nd
```

Using Rest Operator with Destructuring:
```js
const arr = [1, 2, 3, 4, 5];

const [first, ...rest] = arr;

console.log(first); // 1
console.log(rest);  // [2, 3, 4, 5]
```

Default Values
```js
const arr = [10];

const [a, b = 20] = arr;

console.log(a); // 10
console.log(b); // 20
```

Swapping Variables
```js
let x = 5;
let y = 10;

[x, y] = [y, x];

console.log(x, y); // 10 5
```

Nested Destructuring
```js
const arr = [1, [2, 3]];

const [a, [b, c]] = arr;

console.log(a); // 1
console.log(b); // 2
console.log(c); // 3
```

Destructuring Function Return Values
```js
function compute() {
    return [10, 20, 30];
}

const [x, y, z] = compute();
```