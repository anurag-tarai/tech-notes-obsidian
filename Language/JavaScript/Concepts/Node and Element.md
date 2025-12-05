### Node

A **Node** is the **base interface** for _every_ single part of the DOM tree.  
Everything in the DOM — elements, text, comments, document — is a **Node**.

**Types of Nodes include:**
- **Element Node** → `<div>`, `<p>`, `<span>`
- **Text Node** → actual text content inside elements
- **Comment Node** → `<!-- comment -->`
- **Document Node** → `document`
- **Attribute Node** → `class="box"` (rarely used directly today)

👉 In short:  
**Node = any object in the DOM tree.**

---

### Element

An **Element** is a _specific type_ of Node — one that represents an **HTML element**.

Examples:  
`<div>`, `<p>`, `<h1>`, `<span>`, `<section>` — all are **Element nodes**.

An Element Node:

- has tag names (`DIV`, `P`, `SPAN`…)
- can have attributes
- can have children
- can be selected with `querySelector`, `getElementById`, etc.

👉 In short:  
**Element = a Node that corresponds to an HTML tag.**