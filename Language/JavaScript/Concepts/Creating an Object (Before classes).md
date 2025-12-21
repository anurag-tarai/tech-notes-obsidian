```js
const user = {
  name: "Anurag",
  age: 24,
  greet() {
    console.log("Hello " + this.name);
  }
};

user.greet(); // Hello Anurag
```
Good for small code
❌ not scalable.