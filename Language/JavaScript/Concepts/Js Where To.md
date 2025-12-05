### 1. `<script>` Tag
- JavaScript is written inside:
  `<script> ... </script>`
- No need for `type="text/javascript"` (default).

**Old HTML example:**
<script type="text/javascript">
  // JS code
</script>

---

### 2. Where to Write JavaScript?

#### a) `<head>`
- Used for functions that should load before the page is shown.
<head>
  <script>
    function hello() { ... }
  </script>
</head>

#### b) `<body>`
- Most common.
- Usually placed at the **bottom** for faster page loading.
<body>
  <script>
    // JS code
  </script>
</body>

**Why bottom?**  
Because loading JS can block the page from appearing.

---

### 3. JavaScript Functions
- A function is reusable code that runs when "called."
function myFunction() {
  console.log("Hello");
}

---

### 4. Events
- Events are actions like click, hover, load, keypress.

**Example:**
<button onclick="myFunction()">Click me</button>

---

### 5. External JavaScript File
- JS can be written in separate `.js` files.

**File: script.js**
function greet() {
  alert("Hi!");
}

**In HTML:**
<script src="script.js"></script>

**Benefits:**
- Cleaner HTML  
- Reusable code  
- Faster loading due to caching  

---

### 6. Multiple Script Files
<script src="a.js"></script>
<script src="b.js"></script>

---

### 7. Ways to Link External Scripts

**Full URL**
<script src="https://example.com/app.js"></script>

**File path**
<script src="/js/app.js"></script>

**Same folder**
<script src="app.js"></script>

---

### 8. Things NOT in your text (important for freshers)

#### a) `defer` Attribute
Loads script in background → runs **after HTML is ready**.
<script src="app.js" defer></script>

#### b) `async` Attribute
Loads script in background → runs immediately when downloaded.
<script src="app.js" async></script>

#### c) DOM Manipulation
document.getElementById("demo").innerText = "Updated text";

#### d) Console
console.log("Debug message");
