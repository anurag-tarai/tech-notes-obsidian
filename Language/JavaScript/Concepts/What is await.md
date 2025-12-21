### Definition:
`await` pauses the execution **inside the async function** until a Promise is resolved.

```js
const result = await somePromise;
```
### What it does:
- Pauses execution **inside the async function**
- Waits until the Promise is **resolved**
- Returns the **resolved value**
- It does **not block the main thread**