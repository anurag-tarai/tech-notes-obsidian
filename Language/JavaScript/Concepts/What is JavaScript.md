**JavaScript** is a lightweight, high-level, interpreted programming language used to make web pages interactive and dynamic. It runs in the browser and can also run on servers using environments like Node.js.

- everything from animations, form validation, API calls, to handling user events, is done using Js.

example :
```js
<p id="msg">Hello</p>

<script>
  document.getElementById("msg").textContent = "Hello from JavaScript!";
</script>
```
---
- **Interactive** → How the page _responds_ to user actions.
- **Dynamic** → How the page _updates or changes_ itself automatically.
## ✅ **Interactive**

**Interactive = The user can _interact_ with the webpage and the page responds.**

JavaScript lets the webpage react to:
- Clicks
- Typing
- Scrolling
- Hovering
- Drag & drop
- Form submissions

### Example:

When you click a button and something happens:
```js
button.onclick = () => alert("You clicked me!");
```

## ✅ **Dynamic**

**Dynamic = The content of the webpage can _change automatically_ without reloading the page.**

JavaScript can:
- Change text/images
- Add or remove elements
- Update styles
- Fetch data from server (AJAX / fetch API)
- Update UI in real-time

Example:
```js
document.getElementById("msg").textContent = "Hello World!";
```