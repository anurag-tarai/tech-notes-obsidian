| Term        | Belongs to           | Meaning                           |
| ----------- | -------------------- | --------------------------------- |
| `prototype` | Constructor function | Object used for inheritance       |
| `__proto__` | Instance (object)    | Points to constructor’s prototype |
```js
u1.__proto__ === User.prototype // true
```
 
 `__proto__` is **internal link**, not a method container