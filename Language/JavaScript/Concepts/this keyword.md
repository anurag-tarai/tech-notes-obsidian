- Refers to **current object**
- Depends on **how function is called**
```js
class User {
  sayName() {
    console.log(this.name);
  }
}
```