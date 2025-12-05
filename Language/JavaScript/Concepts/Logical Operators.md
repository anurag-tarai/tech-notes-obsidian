Operate on **boolean values**, return boolean results.

| Operator | Description                 | Example         | Result |
| -------- | --------------------------- | --------------- | ------ |
| &&       | AND → true if **both true** | true && false   | false  |
| \|\|     | OR → true if **any true**   | true \|\| false | true   |
| !        | NOT → negates value         | !true           | false  |

**Short-circuiting:**

- `&&` → stops evaluation if first operand is `false`.
- `||` → stops evaluation if first operand is `true`.
```js
console.log(false && (5/0)); // false, right-hand not evaluated
console.log(true || (5/0));  // true, right-hand not evaluated
```