### Pure
- Same input → same output
- No side effects
```js
function add(a, b) {
  return a + b;
}
```
### Impure
- Changes something outside OR depends on external state
```js
let count = 0;
function increment() {
  count++;
}
```