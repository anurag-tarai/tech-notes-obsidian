# 🔹 A. Adding & Removing Elements

## 1️⃣ **push()** → Add to END of array
- Adds new element at the **last position**.
- **Mutates** (changes) original array.

```js
let arr = [10, 20];
arr.push(30);  
console.log(arr); // [10, 20, 30]
```

---

## 2️⃣ **pop()** → Remove from END
- Removes the **last element**.
- Returns the removed value.

```js
let arr = [10, 20, 30];
let removed = arr.pop();

console.log(arr);     // [10, 20]
console.log(removed); // 30
```

---

## 3️⃣ **unshift()** → Add to START
- Inserts element at **index 0**.
- Shifts all elements to the right.

```js
let arr = [20, 30];
arr.unshift(10);

console.log(arr); // [10, 20, 30]
```

---

## 4️⃣ **shift()** → Remove from START
- Removes the **first element**.
- Returns removed item.

```js
let arr = [10, 20, 30];
let removed = arr.shift();

console.log(arr);     // [20, 30]
console.log(removed); // 10
```

---

# 🔹 B. Splice & Slice

## 1️⃣ **splice()** — Add/Remove anywhere  
✔ Changes original array  
✔ Can delete, insert, or replace elements

```js
// syntax: splice(start, deleteCount, ...items)
let arr = [10, 20, 30, 40];

// remove 2 items from index 1 and insert "A", "B"
arr.splice(1, 2, "A", "B");

console.log(arr); // [10, "A", "B", 40]
```

Another example: **delete only**
```js
let arr = [1,2,3,4];
arr.splice(1, 2);  // removes 2 and 3

console.log(arr); // [1, 4]
```

Another example: **insert only**
```js
let arr = [1, 4];
arr.splice(1, 0, 2, 3); // insert at index 1

console.log(arr); // [1, 2, 3, 4]
```

---

## 2️⃣ **slice()** — Copy part of array  
✔ Does **NOT** change original  
✔ Extracts elements from start to end-1

```js
let arr = [10, 20, 30, 40];

let part = arr.slice(1, 3); 
console.log(part); // [20, 30]
console.log(arr);  // unchanged
```

---

# 🔹 C. Searching Methods

## 1️⃣ **indexOf()** → Get index of item
```js
let arr = [10, 20, 30];

arr.indexOf(30); // 2
arr.indexOf(50); // -1 (not found)
```

---

## 2️⃣ **includes()** → Check if exists
```js
let arr = ["apple", "banana"];

arr.includes("banana"); // true
arr.includes("grape");  // false
```

---

## 3️⃣ **find()** → Returns FIRST matching element
```js
let arr = [5, 12, 8, 130];

arr.find(x => x > 10); // 12
```

---

## 4️⃣ **findIndex()** → Returns index of FIRST match
```js
let arr = [5, 12, 8, 130];

arr.findIndex(x => x > 10); // 1
```

---

# 🔹 D. Transforming Methods

## 1️⃣ **map()** — Transform each element  
(Returns **new array**)

```js
let arr = [1, 2, 3];

let doubled = arr.map(x => x * 2);
console.log(doubled); // [2, 4, 6]
```

---

## 2️⃣ **filter()** — Keep only those that pass condition  
(Returns **new array**)

```js
let arr = [1, 2, 3, 4, 5];

let evens = arr.filter(x => x % 2 === 0);
console.log(evens); // [2, 4]
```

---

## 3️⃣ **reduce()** — Reduce array to single value
```js
let arr = [1, 2, 3, 4];

let sum = arr.reduce((acc, cur) => acc + cur, 0);
console.log(sum); // 10
```

---

# 🔹 E. Iteration Methods

## 1️⃣ **forEach()** → Loop through each element
```js
let arr = [10, 20, 30];

arr.forEach((value, index) => {
  console.log(index, value);
});
```

---

## 2️⃣ **for…of** → Best for values
```js
let arr = ["a", "b", "c"];

for (let value of arr) {
  console.log(value);
}
```

---

## 3️⃣ **for…in** → Loops over keys (indexes)
❌ Not recommended for arrays (use for objects)

```js
let arr = ["a", "b", "c"];

for (let key in arr) {
  console.log(key); // 0,1,2
}
```

---

# 🔹 F. Combining / Joining

## 1️⃣ **concat()** → Merge arrays
```js
let a = [1, 2];
let b = [3, 4];

let result = a.concat(b);
console.log(result); // [1, 2, 3, 4]
```

---

## 2️⃣ **join()** → Convert array to string with separator
```js
let arr = ["a", "b", "c"];

arr.join("-"); // "a-b-c"
```

---

## 3️⃣ **toString()** → Convert to string
```js
let arr = [1, 2, 3];

arr.toString(); // "1,2,3"
```

---

# 🔹 G. Sorting

## 1️⃣ **sort()** — Sorts array (mutates)
Default → Converts to strings

```js
let num = [40, 1, 5, 200];

num.sort(); // [1,200,40,5] (wrong)
```

Correct numeric sort:
```js
num.sort((a, b) => a - b); // [1,5,40,200]
```

---

## 2️⃣ **reverse()** → Reverse array
```js
let arr = [1, 2, 3];

arr.reverse(); // [3,2,1]
```

---

# 🔹 H. Flattening

## 1️⃣ flat() → Flatten nested arrays
```js
array.flat(depth)
// depth = how many levels of nested arrays you want to flatten

let arr = [1, [2, 3], [4, [5]]];

arr.flat(2); // [1,2,3,4,5]
```

---

## 2️⃣ flatMap() → Map + Flat (1 level)
`flatMap()` = **map + flat(1)** combined.
It:
1. **Maps** each element to something new
2. **Flattens** the result by **1 level**
```js
let arr = [1,2,3];

arr.flatMap(x => [x, x * 2]);
// [1,2, 2,4, 3,6]
```
### Step-by-step:

##### ✔ Step 1: `map()` part

For each `x`, you return this array:

```js
x = 1 → [1, 2]
x = 2 → [2, 4]
x = 3 → [3, 6]
```

So after mapping, you get:

```js
[[1, 2], [2, 4], [3, 6]]   // nested array
```

##### ✔ Step 2: `flat(1)` part

Now it flattens ONLY **one level**, so we get:
```js
[1, 2, 2, 4, 3, 6]
```

---

# 🔹 I. Checking Arrays

## 1️⃣ **Array.isArray()** → Best way to check
```js
Array.isArray([1,2,3]); // true
Array.isArray("hello"); // false
```

---

## 2️⃣ **typeof** (NOT reliable, always returns "object")
```js
typeof [1,2,3]; // "object"
```

Use `Array.isArray()` instead.
