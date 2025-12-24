**Accessibility** means making your website usable for everyone, including **people with disabilities**.

> [How it helps for people with disabilities](How%20it%20helps%20for%20people%20with%20disabilities.md)
### How semantic tags help:

1. **Screen readers understand page structure:**
    - `<header>` → “Page header”
    - `<nav>` → “Navigation region”
    - `<main>` → “Main content”
    - `<footer>` → “Footer”
    
2. **Keyboard navigation is easier:** Users can jump to `<main>` or `<nav>` quickly.
    
3. **Assistive technologies:** Semantic tags provide context for images, articles, and sections.
    
    - Example: `<figure>` + `<figcaption>` → screen reader reads “Figure: Website layout diagram”
        
4. **Landmarks & ARIA roles:** Browsers automatically treat semantic tags as **landmarks**, helping users with disabilities navigate the page faster.
    

**Example:**

```js
<header>
  <h1>My Website</h1>
  <nav>
    <a href="#main">Skip to main content</a>
  </nav>
</header>
<main>
  <article>
    <h2>Blog Post</h2>
    <p>Important content...</p>
  </article>
</main>
```

> Screen readers can skip navigation and go straight to the main content.

✅ **Takeaway:** Semantic HTML **makes web pages readable by machines and assistive devices**, improving accessibility for all users.