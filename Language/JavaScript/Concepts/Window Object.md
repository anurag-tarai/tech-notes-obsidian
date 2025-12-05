`window` is the **global object** in the browser environment.

Think of `window` as:
- the **browser tab**
- the **top-level container**
- the **environment in which your JS code runs**
```js
window  
├── document      (the webpage)
├── console       (for logs)
├── localStorage  (browser storage)
├── setTimeout    (timer API)
├── alert         (browser dialog)
└── many more...
```

#### Why is it called the `global object`?
Because:
- Any global variable or function you create automatically becomes a property of `window`
- You can access browser APIs through `window`
```js
console.log(window.document);      // same as document
window.alert("Hello");             // same as alert()
window.setTimeout(() => {}, 1000); // same as setTimeout()
```