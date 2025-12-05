## some()
Checks if **at least one** element satisfies the condition.
#### Example
```js
const arr = [10, 20, 30];

const result = arr.some(x => x > 25);

console.log(result); // true

```
#### Notes
- Returns **true** if **any** element matches
- Returns **false** if none do

---

## every()

Checks if **all elements** satisfy the condition.
#### Example
```js
const arr = [10, 20, 30];

const result = arr.every(x => x > 5);

console.log(result); // true
```
#### Notes
- Returns **true** only if **all** meet the condition
- Returns **false** as soon as one fails