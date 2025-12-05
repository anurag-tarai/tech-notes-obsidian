Contains _normal_ asynchronous callbacks.
### **What goes into Macrotask Queue?**
- `setTimeout`
- `setInterval`
- `setImmediate` (Node)
- DOM events (`click`, `scroll`, etc.)
- `I/O callbacks`
- `MessageChannel`
- AJAX callbacks (older XHR)
- `requestAnimationFrame` (special scheduling but usually macro-level)
### **Priority**
Runs **after** Microtasks.  
Event Loop takes **one macrotask at a time**, executes it, then checks microtasks again.