Extracts a part of a string.
**Syntax:** `str.slice(start, end)` → includes `start`, excludes `end`.
```js
let text = "Hello World";
console.log(text.slice(0, 5)); // "Hello"
console.log(text.slice(6));    // "World" (till end)
console.log(text.slice(-5));   // "World" (negative → from end)
```
**Notes:**
- Does **not modify** the original string.
