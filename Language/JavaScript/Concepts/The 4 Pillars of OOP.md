### 1️⃣ Encapsulation
**Bundling data and methods together**

```js
class BankAccount {
  constructor(balance) {
    this.balance = balance;
  }

  deposit(amount) {
    this.balance += amount;
  }
}
```
---

### 2️⃣ Abstraction

**Hiding internal details**

```js
class Car {
  start() {
    this.#igniteEngine();
    console.log("Car started");
  }

  #igniteEngine() {
    console.log("Engine ignited");
  }
}
```

`#` → private method (ES2022)

---

### 3️⃣ Inheritance

**One class inherits from another**

```js
class Person {
  constructor(name) {
    this.name = name;
  }

  greet() {
    console.log("Hello " + this.name);
  }
}

class Student extends Person {
  constructor(name, course) {
    super(name);
    this.course = course;
  }
}

const s1 = new Student("Anurag", "MCA");
s1.greet();
```
---

### 4️⃣ Polymorphism

**Same method, different behavior**
```js
class Animal {
  speak() {
    console.log("Animal makes sound");
  }
}

class Dog extends Animal {
  speak() {
    console.log("Dog barks");
  }
}

const a = new Dog();
a.speak();
```