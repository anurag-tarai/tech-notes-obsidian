**Event Propagation** describes **how events move through the DOM** when an interaction happens (like click, keydown, input).

When you click an element, the event doesn't fire only on that element—it travels through **three phases**.

Events travel through the DOM in **three phases**:

1. **Capturing Phase** → event travels from the root (`window`) down to the target
2. **Target Phase** → event reaches the target element
3. **Bubbling Phase** → event bubbles up from the target to the root

**Example of Capturing/Bubbling:**

```js
div.addEventListener("click", () => console.log("Div clicked"), true); // capturing

div.addEventListener("click", () => console.log("Div clicked"), false); // bubbling
```

- Default is **bubbling** (`false`)