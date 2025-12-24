> **Attributes provide extra information about an HTML element.**

They define **behavior, appearance, or identity** of an element.

### Basic Syntax :
```html
<tag attribute="value">content</tag>
```

### Example :
```js
<a href="https://google.com">Google</a>
```
- `href` → attribute
- `"https://google.com"` → value

## Common HTML Attributes
### 1️⃣ Global Attributes (work on most elements)

|Attribute|Purpose|
|---|---|
|`id`|Unique identifier|
|`class`|Group elements for CSS/JS|
|`style`|Inline CSS|
|`title`|Tooltip text|
|`hidden`|Hide element|

`<p id="para1" class="text">Hello</p>`

---

### 2️⃣ Element-Specific Attributes

#### Anchor `<a>`

`<a href="page.html" target="_blank">Open</a>`

#### Image `<img>`

`<img src="photo.jpg" alt="Profile photo" />`

#### Input `<input>`

`<input type="text" placeholder="Enter name" />`

---

## Boolean Attributes

Attributes that **don’t need a value**.

`<input type="checkbox" checked /> <input type="text" disabled />`

Examples:

- `checked`
    
- `disabled`
    
- `readonly`
    
- `required`
    
- `autofocus`