The **Browser Object Model (BOM)** refers to the **set of objects provided by the browser** (not JavaScript itself) that allow JavaScript to interact with the **browser window**, **tabs**, **history**, **location**, **timers**, **alerts**, etc.

BOM is **not part of JavaScript the language** → it is provided by the **browser environment**.

# **Why BOM Exists**

BOM gives JavaScript the power to:
- Control the browser window
- Work with URL, navigation, history
- Show alerts, prompts
- Manage timers
- Handle browser storage (localStorage, sessionStorage)
- Work with device APIs (geolocation, clipboard, notifications etc.)

Everything outside the **document** is part of **BOM**.

---

# **Main BOM Objects**

## **1. `window` (Global Object in Browser)**

The top-level object.  
Everything in browser JS sits inside `window`.

Examples:

```js
window.alert("Hi");
window.console.log("Hello");
window.location;
window.setTimeout;
```

You can also use them without `window`:

```js
alert();
console.log();
setTimeout();
```

---

## **2. `location` (URL & Navigation Control)**

Used to read or change the URL.

Examples:
```js
location.href        // full URL
location.pathname    // "/home"
location.reload();   // reload page
location.assign("https://google.com"); // navigate
```

---

## **3. `history` (Browser Navigation History)**

Used to move back/forward in navigation.

Examples:
```js
history.back();   
history.forward();
history.go(-1);   // same as back
history.go(2);    // move forward 2 steps
```

---

## **4. `navigator` (Browser & Device Info)**

Gives information about the browser, OS, device, permissions etc.

Examples:
```js
navigator.userAgent
navigator.onLine
navigator.geolocation.getCurrentPosition(...)
```
---

## **5. `screen` (Display Info)**

Information about the user's screen.

Examples:

```js
screen.width
screen.height
screen.availWidth
```

---

## **6. Timers (`setTimeout`, `setInterval`)**

These are not JS functions — they are BOM APIs.

Examples:

```js
setTimeout(() => console.log("Delayed"), 1000);
setInterval(() => console.log("Repeating"), 1000);
```
---

## **7. Dialog APIs**

Provided by BOM:
```js
alert("Hello");
confirm("Are you sure?");
prompt("Enter your name");
```

---

## **8. Web Storage APIs**

Also part of BOM:

### **localStorage**

Persists data until cleared.
```js
localStorage.setItem("name", "Anurag");
localStorage.getItem("name");
```
### **sessionStorage**

Cleared when tab closes.

---

## **9. Other Web APIs (Browser APIs)**

Modern browsers expose many APIs:

- Fetch API
- Clipboard API
- Notifications API
- IntersectionObserver
- MutationObserver
- Web Workers
- Speech API
- WebRTC
- Canvas API
- File API
- Streams API

All are part of the **Browser APIs ecosystem (BOM)**.
