These functions are called **methods**.
```js
const user = {
  name: "Anurag",
  greet() {
    console.log("Hello " + this.name);
  }
};

user.greet();  // Hello Anurag
```