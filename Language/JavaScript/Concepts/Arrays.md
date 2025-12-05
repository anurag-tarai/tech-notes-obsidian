## 🟦 1. What is an Array?
- An **Array** is an **ordered**, **indexed**, **mutable** list-like object.
- Index starts from **0**.
- Arrays can store **any data type** (numbers, strings, objects, arrays).

```js
let arr = [1, "hello", true, {a:1}, [5,6]];
```

---

## 🟦 2. How to Create Arrays
```js
let a = [10, 20, 30];
let b = new Array(10, 20, 30);
let empty = Array();      // []
let fixed = Array(5);      // creates array with length 5, empty slots
```

---

## 🟦 3. Access & Modify Elements
```js
arr[0]          // access
arr[1] = 50     // modify
arr.length      // gets length
arr[arr.length] = 100 // append
```

	
---

## 🟦 4. Multi-Dimensional Arrays

```js
let matrix = [
  [1, 2],
  [3, 4],
  [5, 6]
];

matrix[1][1]; // 4
```
