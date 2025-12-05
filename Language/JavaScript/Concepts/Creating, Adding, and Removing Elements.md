### Create
Use `document.createElement()` to **create a new element** in memory.  
At this point, it **does not exist in the DOM** yet.
```js
const div = document.createElement("div");
div.textContent = "Hello";
```

### Insert
Use **DOM insertion methods** to add elements into the page.
```js
// Append as the last child
parent.append(div);

// Insert as the first child
parent.prepend(div);

// Insert before a specific node
parent.insertBefore(div, referenceNode);

```

Example :
```html
<div id="container">
  <p>First paragraph</p>
  <p>Second paragraph</p>
</div>
```

```js
const container = document.getElementById("container");
const newDiv = document.createElement("div");
newDiv.textContent = "Hello World";

// Append at the end
container.append(newDiv); 
// Result: <div>Hello World</div> after second paragraph

// Prepend at the start
container.prepend(newDiv); 
// Result: <div>Hello World</div> before first paragraph

// Insert before second paragraph
const secondPara = container.children[1];
container.insertBefore(newDiv, secondPara);
```
### Remove
Remove an element from the DOM using `.remove()`.
```js
element.remove();
```

```js
const div = document.querySelector("#toRemove");
div.remove();  // Deletes element from DOM
```