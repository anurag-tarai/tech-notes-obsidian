DOM events are **actions or occurrences** that happen in the browser, which JavaScript can respond to.  
Examples include user interactions, browser actions, or programmatic triggers.

## 1. **Event Types**

**User Interaction Events:**
- `click` → mouse click
- `dblclick` → double-click
- `mouseover` / `mouseout` → mouse enters/leaves element
- `mousedown` / `mouseup` → mouse button pressed/released
- `keydown` / `keyup` → keyboard keys pressed/released
- `input` / `change` → user input changes

**Browser Events:**
- `load` → page or resource finished loading
- `resize` → browser window resized
- `scroll` → page scrolled

**Form Events:**
- `submit` → form submitted
- `focus` / `blur` → element gains or loses focus

---

## 2. **Event Listeners**
JavaScript can **listen and respond** to events using event listeners.

**Syntax:**
```js
element.addEventListener(event, callback, options);
```

**Example:**
```js
const button = document.getElementById("btn");
button.addEventListener("click", () => {
  alert("Button clicked!");
});
```

**Removing an Event Listener:**
```js
button.removeEventListener("click", callbackFunction);
```

## **Common Event Methods**

|Method|Description|
|---|---|
|`addEventListener()`|Listen to an event|
|`removeEventListener()`|Remove listener|
|`preventDefault()`|Stop default action|
|`stopPropagation()`|Stop bubbling/capturing|
|`dispatchEvent()`|Manually trigger an event|
