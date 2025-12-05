
`document` is the root object of the DOM (Document Object Model) that represents the entire HTML page loaded in the browser.
```js
Document
└── html
    └── body
        └── elements...
```
The **very top (root)** of this tree is called the **Document Node**.

## Why it is the entry point to the DOM
When the browser loads an HTML file:
1. It parses the HTML.
2. Builds a **tree structure** called the DOM.
3. Exposes this tree to JavaScript through the **`document` object**.

Therefore:
- `document` is the **entry point** to the DOM.
- All DOM operations start with `document`.
Example
```js
document.querySelector("h1");
document.getElementById("app");
document.createElement("div");
```