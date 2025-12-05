Promise combinators let you run **multiple promises together** and handle their results in different ways.
They are essential for managing **concurrency** and handling groups of asynchronous operations in JavaScript.

## 1. `Promise.all()`

- **Purpose:** Waits for **all** promises to resolve.
- **Resolves with:** An array of results in the **same order** as input.
- **Rejects when:** **Any** promise fails → rejects **immediately** with the first error.
- **Best for:** When _every_ task must succeed.

**Example**
```js
Promise.all([p1, p2, p3])
  .then(results => {
    // [value1, value2, value3]
  })
  .catch(error => {
    // first rejected promise's error
  });
```
**Analogy:** Planning a trip and waiting for everyone to say “Yes.”  
If even one says “No,” the plan is cancelled.

---

## 2. `Promise.allSettled()`

- **Purpose:** Waits for all promises to **finish** (resolve OR reject).
- **Always resolves:** Returns array of result objects:
    
    - `{ status: 'fulfilled', value: ... }`
    - `{ status: 'rejected', reason: ... }`
        
- **Best for:** When you want results from _all_ tasks, even if some fail.

**Example**
```js
Promise.allSettled([p1, p2, p3])
  .then(results => {
    // [
    //   { status: 'fulfilled', value: ... },
    //   { status: 'rejected', reason: ... },
    // ]
  });
```
**Analogy:** Taking attendance — mark everyone present or absent, but complete the list.

---

## 3. `Promise.race()`

- **Purpose:** Settles with the **first promise that finishes**,  
    whether it resolves **or** rejects.
- **Output:** Whatever the first promise returns (value or error).
- **Best for:** Timeouts or selecting the fastest response.

**Example**
```js
Promise.race([p1, p2, p3])
  .then(result => {
    // first resolved value OR first rejected error (if no catch yet)
  })
  .catch(error => {
    // if the first settled promise was rejected
  });
```

**Analogy:** Actual race — whoever finishes first decides the outcome.

---

## 4. `Promise.any()`

- **Purpose:** Waits for the **first resolved** promise.
- **Ignores rejections** unless _all_ fail.
- **Rejects only if:** Every promise rejects → throws `AggregateError`.
- **Best for:** When only one successful result is enough.

**Example**
```js
Promise.any([p1, p2, p3])
  .then(result => {
    // first successful result
  })
  .catch(error => {
    // runs only if ALL promises failed (AggregateError)
  });
```
**Analogy:** Looking for the first shop that’s open — you don't care which one, only the first “Yes.”