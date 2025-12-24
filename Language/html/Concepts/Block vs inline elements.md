>Block elements start on a new line and take full width, while inline elements stay in the same line and take only required width.
### Block Elements
Block elements:
- Start on a **new line**
- Take **full width** available
- Can contain **other block and inline elements**
#### Examples:
```html
<div>Block</div>
<p>Paragraph</p>
<h1>Heading</h1>
<section>Section</section>
```
#### Behavior:
```html
<p>First paragraph</p>
<p>Second paragraph</p>
```

➡️ These appear **one below the other**

---

### Inline Elements
Inline elements:
- Do **not start on a new line**
- Take **only required width**
- Cannot contain block elements (generally)
#### Examples:
```html
<span>Inline</span>
<a href="#">Link</a>
<strong>Bold</strong>
<img />
```
#### Behavior:
```html
<span>Hello</span>
<span>World</span>
```

➡️ These appear **on the same line**