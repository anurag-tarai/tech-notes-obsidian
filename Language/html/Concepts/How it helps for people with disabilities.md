“People with disabilities” are users who may have **difficulty seeing, hearing, moving, or processing content**, and semantic HTML helps **make websites usable for them**.

### Why It Matters for Websites

- These users may **rely on assistive technologies** like:
    - Screen readers (reads out text aloud)
    - Voice navigation
    - Keyboard-only navigation
- Websites that are **semantic, structured, and accessible** ensure everyone can navigate and understand the content.
### Example

Without semantic tags:
```html
<div>My Blog Post</div>
<div>Content goes here...</div>
```

> Screen reader may not understand what’s the heading vs content.

With semantic tags:
```html
<article>
  <h1>My Blog Post</h1>
  <p>Content goes here...</p>
</article>
```

> Screen reader knows `<h1>` is the title and `<p>` is content. Easier for visually impaired users to follow.