### `action` Attribute

- The `action` attribute specifies the **URL (endpoint) where the form data is sent** when the form is submitted.
- This URL points to a **server-side handler** (Servlet, Spring Controller, API endpoint, etc.).
- The URL can be **relative or absolute**.

**Example:**
```html
<form action="/login">
```

---

### `method` Attribute

- Defines the **HTTP method** used to send the form data.
- Common values: `GET` and `POST`.
    
**Examples:**
```html
<form action="/search" method="get">
<form action="/register" method="post">
```

---

| Method | Description                         | Data Visibility | Use Case                |
| ------ | ----------------------------------- | --------------- | ----------------------- |
| GET    | Appends data to URL as query string | Visible in URL  | Search forms, filters   |
| POST   | Sends data in request body          | Hidden          | Login, signup, payments |
### Why `action` is Often Relative (`/login`)

- In **traditional server-rendered applications** (Servlet/JSP, Spring MVC, Thymeleaf):
    - Frontend and backend run on the **same server/domain**
    - Relative paths automatically resolve to the same server
    - Example:
        
```js
Domain: https://example.com
action="/login" → https://example.com/login
```

✅ This was the **standard approach before AJAX / Axios / Fetch**.