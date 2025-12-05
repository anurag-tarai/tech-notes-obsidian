JavaScript can display data in multiple ways:

- Using **innerHTML** or **innerText**
- Using **document.write()**
- Using **alert()** (or window.alert)
- Using **console.log()**
- Using **window.print()** (for printing the page)

---

### 2. Using innerHTML
- Access elements using `document.getElementById(id)`
- Change HTML *content* inside the element

**Example:**
`document.getElementById("demo").innerHTML = "<h2>Hello World</h2>";`

**Note:**  
Use **innerHTML** when you want to insert HTML (tags, markup).

---

### 3. Using innerText
- Access elements the same way
- Changes *only the text*, not HTML

**Example:**
`document.getElementById("demo").innerText = "Hello World";`

**Note:**  
Use **innerText** when you only want plain text.

---

### 4. Using document.write()
- Convenient for quick testing
- Writes directly to the document

**Example:**
document.write(5 + 6);

**Warning:**  
Using document.write() **after the page loads** will delete all existing HTML.

**Example (deletes entire page):**
`<button onclick="document.write(5 + 6)">Try it</button>`

**Use only for testing.**

---

### 5. Using alert() / window.alert()
- Displays a popup alert box

**Example:**
window.alert(5 + 6);

**Or just:**
alert(5 + 6);

**Note:**  
`window` is the global object → keyword is optional.

---

### 6. Using console.log()
- Used for debugging
- Shows output in browser's developer console

**Example:**
console.log(5 + 6);

---

### 7. JavaScript Print
- JavaScript **cannot** print to printers directly.
- Only method available is:

**Example:**
`<button onclick="window.print()">Print this page</button>`

This prints the current browser page.

---
