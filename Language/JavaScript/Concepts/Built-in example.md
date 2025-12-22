```js
const arr = [1, 2, 3];

arr.push(4); // Where does push come from?
```

Answer:
```js
arr → Array.prototype → Object.prototype → null
```

That’s why:
```js
Array.prototype.myMethod = function () {
  console.log("custom method");
};

arr.myMethod(); // works
```

