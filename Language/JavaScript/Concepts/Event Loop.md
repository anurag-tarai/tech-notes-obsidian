The Event Loop is a mechanism that allows JavaScript to handle asynchronous operations despite being single-threaded.
##### Why do we need the Event Loop?
JavaScript is **single-threaded**, so it can run only **one thing at a time**.  
But the browser can do many things (timers, fetch, events, rendering).

The Event Loop connects JavaScript with the browser’s async systems.

##### How the Event Loop Works (Step-by-Step)

###### 1. JS runs code in the Call Stack
Only one function at a time.
###### 2. Async functions go to Web APIs (browser)
Examples:
- `setTimeout`
- `fetch`
- DOM events
- console I/O
These run _outside_ JS, handled by the browser.
###### 3. When a Web API finishes, it places the callback into a queue:

- **Promises → Microtask Queue**
- **setTimeout, events → Macrotask/Callback Queue**

###### 4. Event Loop checks:

```js
Is Call Stack empty?
    Yes → push all microtasks to stack
           (Promises run first)
    After microtasks → push 1 macrotask to stack
```
###### 5. Repeat forever

![](https://media.geeksforgeeks.org/wp-content/uploads/20250208123836185275/Event-Loop-in-JavaScript.jpg)