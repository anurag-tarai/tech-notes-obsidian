> `<div>` is a block-level container used for layout, while `<span>` is an inline container used for styling small portions of content.
### 1️⃣ `<div>`

- **Block-level element**
- Starts on a **new line**
- Takes **full width**
- Used to **group large sections/layouts**
```html
<div>
  <h2>Title</h2>
  <p>Description</p>
</div>
```

---

### 2️⃣ `<span>`

- **Inline element**
- Does **not start a new line**
- Takes **only content width**
- Used to **style or target small text**

```html
<p>Hello <span>World</span></p>
```

Styling with CSS :
```css
div {
  background: lightblue;
}

span {
  color: red;
}
```