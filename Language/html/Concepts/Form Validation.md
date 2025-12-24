**HTML5 built-in validation**:

1. You add **HTML5 validation attributes** to form fields:
	- `required` → Field cannot be empty
        
	- `type="email"` → Must be valid email
        
	- `type="number"` → Only numbers
        
	- `pattern="[A-Za-z]{3}"` → Regex pattern
2. When the user clicks **Submit**:
    
    - The browser checks **all validation rules**.
        
    - If any field is invalid, the form **does NOT submit**.
        
    - Browser shows **error messages automatically** (e.g., “Please enter a valid email”).
        
3. Only if all validations pass, the browser **sends the form data** to the server.

Example
```html
<form action="/submit" method="post">
  <label>Email:</label>
  <input type="email" name="email" required>
  <input type="submit">
</form>
```

✅ **Key Point:** This is **client-side validation**, done **before the data reaches the backend**.

> Note: You still need **server-side validation** for security.
