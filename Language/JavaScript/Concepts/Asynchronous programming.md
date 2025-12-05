Asynchronous programming is a style where long-running tasks (like network requests, file reads, timers) start and then complete later, without blocking the main thread.

- Instead of waiting and freezing the UI until a task finishes, the program registers some “work to do later” (a callback, promise, or async function) and immediately moves on to other code.
    
- When the async task completes, the result is delivered via a callback, a promise’s handlers (`then`/`catch`), or `async/await`.
    

In JavaScript (single-threaded in the browser), async programming is crucial to keep pages responsive while doing things like API calls or animations.

```ad-note
read diff - [Sync vs Async code](Sync%20vs%20Async%20code.md)
```