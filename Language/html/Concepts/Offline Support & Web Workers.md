- **Offline Support**: Web apps can **work without internet** using **caching** (`Service Worker`).
- **Web Workers**: Run **background scripts** without blocking the main page.

Example :
```js
// Create a web worker
const worker = new Worker('worker.js');
worker.postMessage('Start task');
```