## 1. `getElementById()

**Returns:**  
A **single Element** (because IDs are unique)

**Syntax:**
```js
document.getElementById("title");
```
**Use When:**
- You know the element has a **unique ID**
- You want the **fastest** and most efficient selector

**Example:**

```html
<h1 id="title">Hello</h1>
```

```js
const title = document.getElementById("title");
```

---

## 2. `getElementsByClassName()`

**Returns:**  
A **live HTMLCollection** (updates automatically when DOM changes)

**Syntax:**
```js
document.getElementsByClassName("box");
```

**Use When:**
- You want **all elements with the same class**
- You want a **live collection** (auto-updating)

**Example:**

```html
<div class="box"></div>
<div class="box"></div>
```

```js
const boxes = document.getElementsByClassName("box");
```
---

## 3. `getElementsByTagName()`

**Returns:**  
A **live HTMLCollection**

**Syntax:**
```js
document.getElementsByTagName("p");
```

**Use When:**
- Selecting elements purely by **tag name**
- Need a **live list**

**Example:**
```html
<p>A</p>
<p>B</p>
```

```js
const paras = document.getElementsByTagName("p");
```

---

## 4. `querySelector()`

**Returns:**  
The **first matching element** (CSS selector)

**Syntax:**
```js
document.querySelector(".card");
document.querySelector("#title");
document.querySelector("#main > .item");
```

**Use When:**

- You want to use **CSS selectors**
- You need **the first matching element**
- You want more flexibility than ID/class/tag methods
    

**Example:**
```html
<div class="card primary"></div>
```

```js
const card = document.querySelector(".card.primary");
```

**Why use:**  
✔ Most flexible (CSS selectors)  
✔ Can target deep/nested patterns  
✔ Clean syntax

---

## ### **5. `querySelectorAll()`**

**Returns:**  
A **static NodeList** (does NOT auto-update)

**Syntax:**
```js
document.querySelectorAll("p");
```

**Use When:**

- You want **multiple elements** using CSS selectors
- You want a **static list**
- You need to use **`.forEach()`** directly (NodeList supports it)

**Example:**
```js
const items = document.querySelectorAll("#main .item");
items.forEach(i => console.log(i));
```

**Why use:**  
✔ Most powerful for multiple selectors  
✔ Supports complex CSS selector patterns  
✔ Static list → predictable and stable

---

## Live vs Static (Important Difference)
A **live collection** automatically updates itself when the DOM changes.
A **static collection** does _not_ update automatically.

|Method|Returns|Live?|
|---|---|---|
|`getElementById`|Element|No|
|`getElementsByClassName`|HTMLCollection|**Yes**|
|`getElementsByTagName`|HTMLCollection|**Yes**|
|`querySelector`|Element|No|
|`querySelectorAll`|NodeList|**No (Static)**|

---

# ⭐ **When to Use What (Quick Guide)**

|Goal|Best Method|
|---|---|
|Select by ID|`getElementById`|
|Select all elements by class|`getElementsByClassName`|
|Select all `<p>` or `<div>`|`getElementsByTagName`|
|Use CSS selector (single)|`querySelector`|
|Use CSS selector (multiple)|`querySelectorAll`|
|Need `.forEach()` looping|`querySelectorAll`|
|Need live updating list|`getElementsByClassName` / `getElementsByTagName`|