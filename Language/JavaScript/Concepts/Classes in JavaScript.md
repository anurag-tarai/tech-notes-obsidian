Basic class :
```js
class User {
  constructor(name, age) {
    this.name = name;   // property
    this.age = age;     // property
  }

  greet() {
    console.log(`Hello, I am ${this.name}`);
  }
}

const u1 = new User("Anurag", 24);
const u2 = new User("Ravi", 22);

u1.greet();
u2.greet();
```

Common confusion :
> “You didn’t define properties”

> ✅ Properties **ARE defined inside constructor**

```js
this.name = name;
this.age = age;
```