**Highest priority queue.** also called Priority Queue.

Contains tasks that must run **immediately after the current Call Stack finishes**, before any macrotasks.

### **What goes into Microtask Queue?**

- `Promise.then()`
- `Promise.catch()`
- `Promise.finally()`
- `MutationObserver`
- `queueMicrotask()`
- (in Node.js: `process.nextTick` — even higher priority)
### **Priority**

Runs **before** macrotasks.  
Event Loop always empties the Microtask Queue **completely** before touching the Macrotask Queue.