## 1. Scope
- **var** → Function-scoped (NOT block-scoped)
- **let** → Block-scoped
- **const** → Block-scoped

---

## 2. Redeclaration
- **var** → Can be redeclared in the same scope  
- **let** → Cannot be redeclared  
- **const** → Cannot be redeclared

---

## 3. Reassignment
- **var** → Allowed
- **let** → Allowed
- **const** → Not allowed (but object properties can change)
```js
const age = 25;
age = 30; // Error → you can't give a new value


const user = { name: "Anu", age: 22 };
user.name = "Anurag";   // Allowed
user.age = 23;          // Allowed

console.log(user); 
// { name: "Anurag", age: 23 }

user = {}; // ❌ Not allowed
```

---

## 4. Hoisting
- **var** → Hoisted with default value `undefined`  
- **let / const** → Hoisted but in Temporal Dead Zone (TDZ), cannot access before declaration

---

## 5. Behavior Summary
| Feature   | var               | let         | const       |
| --------- | ----------------- | ----------- | ----------- |
| Scope     | Function          | Block       | Block       |
| Redeclare | ✔ Yes             | ❌ No        | ❌ No        |
| Reassign  | ✔ Yes             | ✔ Yes       | ❌ No        |
| Hoisting  | ✔ Yes (undefined) | ✔ Yes (TDZ) | ✔ Yes (TDZ) |

---

## 6. Best Practices
- Avoid **var**
- Use **let** when value changes
- Use **const** by default for stable values
