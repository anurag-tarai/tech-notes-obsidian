**Web APIs** are **features provided by the browser**, not by the JavaScript language itself.  
They allow JavaScript to interact with the browser and perform tasks like:

- **Timers** → `setTimeout`, `setInterval`
    
- **DOM Manipulation** → `document`, `querySelector`
    
- **Networking** → `fetch`, `XMLHttpRequest`
    
- **Browser Features** → `localStorage`, `geolocation`, `notifications`, `canvas`, `console`

`window` = the global object in the browser
- Everything the browser provides—DOM, timers, storage, fetch—is attached to this global `window` object.

---
### Async
JavaScript itself is **synchronous & single-threaded**.  
But the browser enables async behavior through Web APIs.

**How it works:**
1. JS calls a Web API → e.g. `setTimeout(() => { ... }, 1000)`
2. The function is **handed over** to the browser’s Web API system.
3. JS Call Stack becomes free and continues executing.
4. After the timer/network is done, the callback is sent to:
    - **Microtask Queue** (e.g. for `Promise.then`)
    - **Callback Queue** (for `setTimeout`, events)
5. Event loop moves it to the Call Stack when it’s free.

This is why JS appears asynchronous.