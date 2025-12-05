```html
<button onclick="alert('Clicked!')">Click</button>
```

- Works, but **separates HTML and JS poorly**
- Harder to manage for multiple events

---

## Best Practices

- Use `addEventListener` instead of inline `onclick`
- Avoid anonymous functions if you need to remove the listener
- Use event delegation for many similar elements

**Example of Event Delegation:**
```js
document.getElementById("list").addEventListener("click", (e) => {
  if (e.target.tagName === "LI") {
    console.log("Item clicked:", e.target.textContent);
  }
});
```