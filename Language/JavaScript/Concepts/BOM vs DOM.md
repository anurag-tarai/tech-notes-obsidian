## **1. What They Represent**

### **DOM (Document Object Model)**

- Represents the **HTML document**.
    
- Converts HTML into a **tree of nodes/elements**.
    
- Used to **read, modify, or manipulate** webpage content.
    

### **BOM (Browser Object Model)**

- Represents the **browser environment** outside the webpage.
    
- Gives JavaScript access to **browser features** (window, URL, history, storage, timers).
    

---

## **2. Main Object**

|Model|Main Entry Object|Meaning|
|---|---|---|
|**DOM**|`document`|APIs to access & modify webpage content|
|**BOM**|`window`|APIs to interact with the browser window|

---

## **3. Examples of Each**

### **DOM examples**

- `document.querySelector()`
    
- `document.getElementById()`
    
- `document.createElement()`
    
- `document.body`, `document.title`
    

Used for:

- Updating UI
    
- Adding/removing elements
    
- Handling form inputs
    
- Changing styles
    

---

### **BOM examples**

- `window.location` (URL)
    
- `window.history` (back/forward)
    
- `window.alert()`
    
- `window.setTimeout()`
    
- `window.navigator` (browser info)
    
- `window.localStorage`
    

Used for:

- Reloading or navigating
    
- Browser dialogs
    
- Timers
    
- Getting device info
    
- Working with browser storage
    

---

## **4. Key Conceptual Difference**

### **DOM → Page**

You manipulate **what you see** on the webpage.

### **BOM → Browser**

You interact with the **browser itself**, not the page.

---

## **5. Relationship**

### ✔ DOM is a **subset inside BOM**

Because `document` lives inside `window`:

```js
window   → represents browser  
  └── document → represents webpage
```

So:

- **BOM is bigger**
    
- **DOM is only the document part**
    

---

## **6. Specification**

|Model|Standardized By|
|---|---|
|**DOM**|W3C / WHATWG (fully standardized)|
|**BOM**|No strict formal standard (browser-defined)|

This is why some BOM APIs vary slightly between browsers.