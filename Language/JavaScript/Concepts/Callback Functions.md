A **callback function** in JavaScript is simply a **function passed as an argument to another function**, and then **executed later** by that function.

It’s a way to say:
> “Do this… and **when you’re done**, call this other function.”

---
### Why callbacks exist?

For **asynchronous** (non-blocking) js code, especially for things like:
- API calls
- Timers
- Reading files
- Events
Because these things take time, JavaScript uses callbacks to run code **after** the task finishes.

```js
function greet(name, callback) {
  console.log("Hello " + name);
  callback();   // calling the callback
}

function sayBye() {
  console.log("Goodbye!");
}

greet("Anurag", sayBye);
```

### [Practice Callback](Practice%20Callback.md)