```ad-note
# Definition
Prototype is a mechanism in JavaScript by which objects inherit properties and methods from other objects through a prototype chain.
```

>If a property or method is **not found on the object itself**, JavaScript **looks for it in its prototype**.

This is called **prototype chaining**.

```js
object → prototype → prototype's prototype → null
```

Example :
```js
const user = {
  name: "Anurag"
};

console.log(user.name);       // found on user
console.log(user.toString()); // NOT on user
```
--> `toString()` is not in `user`

JavaScript does:
```js
user → Object.prototype → null
```
--> `toString()` is found in **Object.prototype** 
### Where does prototype come from?
##### When you create an object like this:

```js
const obj = {};
```

Internally JS does:

```js
obj.[[Prototype]] → Object.prototype
```

You can see it using:

```js
Object.getPrototypeOf(obj) === Object.prototype // true
```

⚠️ `__proto__` exists, but prefer `Object.getPrototypeOf()`.

### Object.prototype
```js
Object.prototype = {
  constructor: ƒ Object(),

  hasOwnProperty: ƒ hasOwnProperty(),
  isPrototypeOf: ƒ isPrototypeOf(),
  propertyIsEnumerable: ƒ propertyIsEnumerable(),

  toLocaleString: ƒ toLocaleString(),
  toString: ƒ toString(),
  valueOf: ƒ valueOf(),

  __defineGetter__: ƒ __defineGetter__(),
  __defineSetter__: ƒ __defineSetter__(),
  __lookupGetter__: ƒ __lookupGetter__(),
  __lookupSetter__: ƒ __lookupSetter__(),

  __proto__: {
    get: ƒ __proto__(),
    set: ƒ __proto__()
  }
}
```