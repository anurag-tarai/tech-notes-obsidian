HTML5 added input types for **better validation and user experience**:

| Type     | Purpose                             |
| -------- | ----------------------------------- |
| `email`  | Accepts email addresses             |
| `url`    | Accepts website URLs                |
| `date`   | Date picker input                   |
| `number` | Numeric input with optional min/max |
| `range`  | Slider input for numeric range      |

**Example:**
```html
<input type="email" name="userEmail" placeholder="Enter your email">
<input type="range" min="0" max="100">
```