## 1️⃣ Synchronous (Sync) Code

* **Execution:** Executed **line by line**, one statement at a time.
* **Waiting:** Each statement waits for the previous one to finish before executing.
* **Blocking:** If one task takes a long time, **everything else waits**. This is **blocking** behavior.
    * *Analogy:* Waiting in a line for one cashier.

* **Example 1 (Basic):**
    ```javascript
    console.log("A");
    console.log("B");
    console.log("C");
    ```
    **Output:**
    ```
    A
    B
    C
    ```
    ✅ Each line runs one after the other in sequence.

* **Example 2 (Blocking Delay):**
    ```javascript
    function wait(ms) {
      const start = Date.now();
      while (Date.now() - start < ms) {} // Blocks the main JS thread
    }
    
    console.log("Start");
    wait(2000); // 2 seconds of blocking execution
    console.log("End");
    ```
    Here, the JavaScript engine **waits 2 seconds** before printing $\text{"End"}$.

---

## 2️⃣ Asynchronous (Async) Code

- **Code that does not block the main thread.**
- Async code **starts execution and immediately allows the main thread to continue** executing other tasks, and **when the async operation completes, its result is placed in a queue and handled later by the main thread**.

* **Mechanism:** Achieved using **callbacks, Promises, $\text{async/await}$, timers ($\text{setTimeout}$), $\text{fetch}$, and event handlers.**
    * *Analogy:* Ordering food and then sitting down to read while you wait for the food to be delivered to your table.

* **Example 1 (Macrotask/Timer):**
    ```javascript
    console.log("Start");
    setTimeout(() => {
      console.log("After 2 seconds");
    }, 2000); // Handed off to the browser/Node API
    console.log("End");
    ```
    **Output:**
    ```
    Start
    End
    After 2 seconds
    ```
    **$\text{"End"}$ prints immediately**, even though the timer hasn't finished. The callback function is placed into the **macrotask queue** and executed later.

* **Example 2 (Microtask/Promise):**
    ```javascript
    console.log("Start");
    Promise.resolve().then(() => {
      console.log("Promise done");
    }); // Handed off to the microtask queue
    console.log("End");
    ```
    **Output:**
    ```
    Start
    End
    Promise done
    ```
    The **Promise callback** executes after the current execution stack is empty, but **before** macrotasks (like $\text{setTimeout}$) are checked.

---

## 3️⃣ Key Differences Table

| Feature | Synchronous (Sync) | Asynchronous (Async) |
| :--- | :--- | :--- |
| **Execution Flow** | Line by line, sequentially | Can happen later, non-blocking |
| **Blocking?** | **Yes** (Blocks the main thread) | **No** (Frees the main thread) |
| **Examples** | $\text{console.log}$, Math operations, simple loops | $\text{setTimeout}$, $\text{fetch}$, $\text{Promise}$, Event Handlers |
| **Call Stack** | Executes directly on the stack | May go to **Queues** (Microtask/Macrotask), executed later by the **Event Loop** |

### 💡 Rule of Thumb
* If JS **waits** for it to finish $\rightarrow$ **Synchronous**
* If JS **does something else** while waiting $\rightarrow$ **Asynchronous**