```js
function User(name) {
  this.name = name;
}

User.prototype.greet = function () {
  console.log("Hello " + this.name);
};

const u1 = new User("Anurag");
u1.greet();
```