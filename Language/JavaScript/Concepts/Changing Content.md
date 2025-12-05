### 1. innerText
`innerText` returns or sets the **visible text** of an element.

**Key concepts:**
- Respects **CSS** (e.g., `display:none`, `visibility:hidden`)
- Triggers **reflow/repaint**, so it's **slower**
- Ignores hidden text
- Gives text as it appears _to the user_
```html
<p id="p1">Hello <span style="display:none">World</span></p>
```

```js
document.getElementById("p1").innerText
// "Hello"
```

### 2. textContent
`textContent` returns or sets the **full textual content** of an element.

**Key concepts:**
- Does **NOT** respect CSS (includes hidden text)
- Faster (no layout calculations)
- Returns **all text**, even if not visible
- Gives raw text node content

```html
<p id="p2">Hello <span style="display:none">World</span></p>
```

```js
document.getElementById("p2").textContent
// "Hello World"
```
### 3. `innerHTML`
`innerHTML` returns or sets the **HTML markup** inside an element.

**Key concepts:**
- Parses HTML strings
- Can insert **elements, attributes, and nested structure**
- Powerful but **slower and less safe** (XSS risk)
- Replaces the entire inner DOM structure
```js
element.innerHTML = "<b>Bold text</b>";
```

```html
<b>Bold text</b>
```




