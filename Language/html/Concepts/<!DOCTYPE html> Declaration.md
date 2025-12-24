- It **tells the browser** which version of HTML is being used.
    
- Ensures the browser renders the page in **standards mode** rather than quirks mode.
    
- For HTML5, it is written as:
    
```html
<!DOCTYPE html>
```
- Placed **at the very top of the HTML document**, before `<html>` tag.
    

**One-line summary:**

> `<!DOCTYPE html>` declares the HTML version and triggers standards-compliant rendering in browsers.

---
1️⃣ **Standards Mode**

- Browser follows **modern HTML and CSS specifications** strictly.
    
- Ensures your page behaves consistently across browsers.
    
- Triggered when you use a **proper `<!DOCTYPE>` declaration**.
    

2️⃣ **Quirks Mode**

- Browser tries to **emulate old, non-standard behavior** for very old websites.
    
- Ignores some CSS/HTML rules, which can cause layout issues.
    
- Triggered if **DOCTYPE is missing or incorrect**.