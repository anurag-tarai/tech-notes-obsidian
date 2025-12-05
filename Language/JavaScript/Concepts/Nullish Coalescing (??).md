Returns right-hand value only if left-hand value is `null` or `undefined`.
```js
let a = null ?? "default"; // "default"
let b = 0 ?? 42;           // 0   (0 is NOT null/undefined)
let c = "" ?? "empty";     // ""  ("" is NOT null/undefined)
```
**Difference from `||`:**
- `||` returns right-hand value if left-hand is **falsy** (`0`, `""`, `false`)
    
- `??` only triggers on `null` or `undefined`
```js
const a = 0 || 42 // 42
const b = 0 ?? 42 // 0
```