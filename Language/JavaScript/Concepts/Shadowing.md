**Shadowing** happens when a **variable in an inner scope** has the **same name** as a variable in an outer scope. 
The inner variable **“shadows”** (hides) the outer one within that scope.

```js
let x = 10;     // outer variable

function test() {
  let x = 20;   // inner variable → shadows outer x
  console.log(x); // 20 (inner x is used)
}

test();
console.log(x);  // 10 (outer x is still intact)
```

## Key Points

- Only the **inner scope** sees the shadowed variable.
- It does **not overwrite** or modify the outer variable.
- Common in functions and block scopes.

## ❗ Illegal Shadowing (JS)

In JavaScript, you **cannot** shadow a variable with a different declaration type in the same functional scope.

```js
let a = 10;

function demo() {
  var a = 20;  // ❌ illegal shadowing (var vs let in same scope)
}
```


| Outer Scope     | Inner Scope (Block)              | Allowed? | Notes                                                                  |
| --------------- | -------------------------------- | -------- | ---------------------------------------------------------------------- |
| `var`           | `var`                            | ✅ Yes    | Inner `var` shadows outer `var` in function/global scope.              |
| `var`           | `let` / `const`                  | ✅ Yes    | Inner block variable shadows outer `var`. Independent.                 |
| `let` / `const` | `let` / `const`                  | ✅ Yes    | Inner block variable shadows outer. Type can differ (`let` → `const`). |
| `let` / `const` | `var`                            | ❌ No     | Cannot redeclare in same function/global scope → SyntaxError.          |
| `var`           | `var` (same scope) Not Shadowing | ✅ Yes    | Allowed in same function/global scope (redeclares same var).           |
| `let` / `const` | `let` / `const` (same scope)     | ❌ No     | Cannot redeclare in the same scope → SyntaxError.                      |
