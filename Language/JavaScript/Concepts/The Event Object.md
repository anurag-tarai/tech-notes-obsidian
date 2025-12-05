When an event occurs, the callback receives an **event object** with details:

**Properties:**
- `event.target` → element that triggered the event
- `event.type` → type of event (click, keydown, etc.)
- `event.preventDefault()` → prevents default browser behavior
- `event.stopPropagation()` → stops event from bubbling up

**Example:**
```js
document.querySelector("a").addEventListener("click", (e) => {
  e.preventDefault(); // prevents link from navigating
  console.log(e.target.href);
});
```
