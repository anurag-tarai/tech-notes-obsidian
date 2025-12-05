Splits a string into an **array** based on a **separator**.
```js
let str = "Apple, Banana, Cherry";
console.log(str.split(", ")); // ["Apple", "Banana", "Cherry"]
console.log(str.split(""));   // ["A", "p", "p", "l", "e", ...]
```
**Notes:**

- Separator can be a string or a regex.
- Optional second parameter → limit of items.

```js
str.split(", ", 2); // ["Apple", "Banana"]
```

---