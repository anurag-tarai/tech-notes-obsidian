### 1. XSS (Cross-Site Scripting) Vulnerability

If you insert untrusted user input, attackers can inject malicious scripts.

Example (Vulnerable):
```js
// User enters: <img src=x onerror="alert('Hacked!')">
const userInput = getUserInput(); 
document.body.innerHTML = userInput;  // Dangerous!
```
This will execute the attacker’s JavaScript.

---

### 2. It Executes `<script>` Tags

`innerHTML` parses and runs scripts inside the HTML.

```js
document.body.innerHTML = `
  <script>alert("Script executed!")</script>
`;
```
This shows how easily code can execute.

---

### 3. Replaces Entire DOM → Removes Event Listeners

Assigning `innerHTML` destroys and recreates DOM nodes.

Example:
```js
<button id="btn">Click</button>
<script>
document.getElementById("btn").onclick = () => console.log("clicked");

// This removes button + listener
document.body.innerHTML += "<p>Added</p>";
</script>
```

After using `innerHTML +=`, the button is recreated without the click listener.

---

### 4. Performance Issues (Re-Parsing HTML)

Large updates using `innerHTML` force the browser to:

- re-parse the HTML
- rebuild the DOM tree
- repaint layout

Example:

```js
div.innerHTML = bigHTMLString; // heavy operation
```

Bad for performance when updating small parts.

---

### 5. Harder to Control or Sanitize

HTML strings mix structure and content, which can introduce bugs.

Example:
```js
div.innerHTML = "<div>" + userTitle + "</div>"; // Vulnerable
```

You must sanitize manually.

---

### Safe Alternative Examples

**Use `textContent`:**

`div.textContent = userInput;`

**Create elements manually:**

```js
const p = document.createElement("p");
p.textContent = userInput;
div.appendChild(p);
```

**Use `.insertAdjacentHTML()` for controlled inserts:**
```js
div.insertAdjacentHTML("beforeend", "<p>Safe because controlled HTML</p>");
```