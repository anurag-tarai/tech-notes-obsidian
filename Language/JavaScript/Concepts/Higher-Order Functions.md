A function that:
- takes another function as an argument  
    OR
- returns another function
    
Examples: `map`, `filter`, `reduce`

```js
function process(arr, fn) {
  return fn(arr);
}

process([1,2,3], arr => arr.map(x => x * 2));
```