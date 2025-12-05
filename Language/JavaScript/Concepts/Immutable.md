**Primitive types are immutable meaning their values cannot be changed once created. Any update creates a new value in memory.  
Objects are mutable, so their internal properties can be updated without creating a new object.**

```js
let a = "hello";
a[0] = "H";   // ❌ does NOT work


let a = "hello";
a = "Hello"; // new string created, old one untouched
// 👉 Old becomes unused,  
// 👉 no variable points to it,  
// 👉 and then avaScript’s Garbage Collector removes it automatically.

let user = { name: "Anurag" };
user.name = "Tarai";   // ✅ allowed (mutated)

let arr = [1, 2, 3];
arr.push(4);  // ✅ mutates the array
```