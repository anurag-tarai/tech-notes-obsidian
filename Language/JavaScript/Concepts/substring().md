Similar to `slice()`, but **does not accept negative indices**.  
**Syntax:** `str.substring(start, end)`
```js
let text = "Hello World";
console.log(text.substring(0, 5)); // "Hello"
console.log(text.substring(6));    // "World"
```
**Difference from slice():**

- `substring()` swaps start/end if start > end.
- `slice()` can use negative indices.

```js
text.slice(-5)       // "World"
text.substring(-5)   // "" (negative ignored)
```