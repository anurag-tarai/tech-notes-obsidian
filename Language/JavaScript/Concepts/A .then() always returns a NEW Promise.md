Even if you return a normal value:
```js
return 5;
```

It becomes:
```js
Promise.resolve(5)
```
This is why chaining works.