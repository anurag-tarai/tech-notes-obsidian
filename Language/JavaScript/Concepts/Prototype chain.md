>If a property or method is **not found on the object itself**, JavaScript **looks for it in its prototype**.

This is called **prototype chaining**.
```js
u1 → User.prototype → Object.prototype → null
```

Example :
```js
const myObject = {
  city: "Madrid",
  greet() {
    console.log(`Greetings from ${this.city}`);
  },
};

myObject.greet(); // Greetings from Madrid
```

![](https://developer.mozilla.org/en-US/docs/Learn_web_development/Extensions/Advanced_JavaScript_objects/Object_prototypes/myobject-prototype-chain.svg)