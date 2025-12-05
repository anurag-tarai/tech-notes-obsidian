Events travel through three phases:
1. **Capturing** (document → target)
2. **Target** (event hits element)
3. **Bubbling** (target → document)
Default is **bubbling**.
### To use capturing:
```js
element.addEventListener("click", handler, true);
```