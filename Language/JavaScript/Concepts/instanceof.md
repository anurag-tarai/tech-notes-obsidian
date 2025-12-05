`instanceof` is a JavaScript operator used to check whether **an object was created by a specific constructor or class**.
- It returns **true/false**.
## Syntax
```js
object instanceof Constructor
```

## How it works internally

`instanceof` checks the **prototype chain**:

It returns `true` if:
```js
Constructor.prototype  exists in  object.__proto__ chain
```
## Examples

### **Basic object check**
```js
const person = {};
console.log(person instanceof Object);  
// true
```
### **Array**
```js
const arr = [1,2,3];
arr instanceof Array      // true
arr instanceof Object     // true (because Array → Object)
```
### **Function**
```js
const arr = [1,2,3];
arr instanceof Array      // true
arr instanceof Object     // true (because Array → Object)
```
### **Custom class**
```js
class Car {}
const c = new Car();

c instanceof Car;     // true
```

---

##  With Built-in Types
```js
"hello" instanceof String   // false (because primitive)
new String("hello") instanceof String   // true
```

---

## Important Notes

- Works only on **objects**, not primitives.
- Primitives must be **wrapped** for `instanceof` to work.
- Depends on prototype chain → can be changed with `Object.setPrototypeOf()`
- Use for checking:
    
    - arrays
    - classes
    - custom objects
    - dates
    - regex
### Example:

```js
new Date() instanceof Date   // true
```

---

## ⚠️ When NOT to use `instanceof`

- When values come from **different iframes/windows**, prototypes differ → returns false.
- For type checking primitives → use `typeof`.
    
---

## ⭐ `typeof` vs `instanceof` (Quick Difference)

|Operator|Best For|Works On|Checks|
|---|---|---|---|
|**typeof**|primitive types|primitives + functions|returns a string|
|**instanceof**|objects/classes|objects only|prototype chain|

---

## ⭐ Example: Difference

```js
typeof []          // "object"
[] instanceof Array  // true
```

---

# ✔️ Summary

- `instanceof` checks if an object belongs to a constructor/class.
    
- Works using **prototype chain lookup**.
    
- Does **not** work for primitives.
    
- Ideal for checking **arrays, dates, custom classes**.