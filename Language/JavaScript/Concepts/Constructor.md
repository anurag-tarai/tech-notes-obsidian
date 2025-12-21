A **constructor** is a **special function**/method that:
- Runs **automatically** when you create an object using `new`
- Is used to **initialize (set up) properties** of an object
```js
constructor(name, age) {
  this.name = name;
  this.age = age;
}
```

Why do we need a constructor?
Without constructor:
```js
const user1 = { name: "Anurag", age: 24 };
const user2 = { name: "Ravi", age: 22 };
```
❌ Repeating code  
❌ No structure  
❌ Hard to manage for many users

---

With constructor:
```js
class User {
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }
}

const u1 = new User("Anurag", 24);
const u2 = new User("Ravi", 22);
```

✔️ Clean  
✔️ Reusable  
✔️ Structured