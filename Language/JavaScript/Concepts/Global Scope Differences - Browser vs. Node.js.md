## 1. `window` in Browser (Top-Level Global Object)

* In browsers, the **global object** is $\text{window}$.
* Any variable declared with $\text{var}$ (or a global function) **automatically becomes a property of $\text{window}$**.
* **Example:**
    ```javascript
    var a = 10;
    console.log(window.a); // 10
    console.log(this === window); // true (at top-level)
    ```
* The $\text{window}$ object also provides **browser APIs** like $\text{alert()}$, $\text{fetch()}$, $\text{setTimeout()}$, $\text{document}$, etc.

---

## 2. `{}` in Node.js (Module Scope)

* In Node.js, **there is no $\text{window}$**. Instead, the true global object is $\text{global}$.
* When you run a file in Node, **the top-level scope is actually a module wrapper**, not the true global scope.

### 💡 The Module Wrapper
* Node wraps your file code internally:
    ```javascript
    (function(exports, require, module, __filename, __dirname) {
        // Your code here
    });
    ```
* This module structure means $\text{var}$ is **module-scoped**, preventing accidental global variable pollution.
    ```javascript
    var a = 10;
    console.log(global.a); // undefined 
    // 'a' is local to the module function
    ```

### 🤷‍♂️ What is `{}` in Node?
* The empty object $\text{\{\}}$ is often seen when logging $\text{this}$ at the top level in a Node file:
    ```javascript
    console.log(this); // {}
    ```
* So $\text{this}$ at the top level of a Node file **refers to the $\text{module.exports}$ object alias, which is an empty object** until something is exported. It is **not the $\text{global}$ object**.

---

## 📝 Summary Table: Global vs. Module Scope

| Environment | Global Object   | Top-Level $\text{this}$      | Notes                                                               |
| :---------- | :-------------- | :--------------------------- | :------------------------------------------------------------------ |
| **Browser** | $\text{window}$ | $\text{window}$              | All top-level $\text{var}$s/functions are added to $\text{window}$. |
| **Node.js** | $\text{global}$ | $\text{\{\}}$ (module scope) | Top-level $\text{var}$s are **module-scoped**, not global.          |