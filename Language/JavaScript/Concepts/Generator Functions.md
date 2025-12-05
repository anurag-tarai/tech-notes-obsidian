Functions that can pause & resume.
```js
function* gen() {
  yield 1;
  yield 2;
}

const g = gen();
console.log(g.next()); // {value:1, done:false}
```