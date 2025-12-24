Form data travels from the **browser (client)** to the **server (backend)** via the **HTTP request**, using the `action` URL and `method`.

### Step-by-Step:
1. User fills the form and clicks **Submit**.
2. Browser checks **validation** (if any).
3. Browser creates a **request**:
    - **GET method** → form data appended in URL as query string
        `https://example.com/submit?name=John&email=john@example.com`
        
    - **POST method** → form data sent in **request body** (hidden from URL)
        `Request Body: name=John&email=john@example.com`
        
1. Browser sends the **HTTP request** to the server (`action` URL).
2. Server receives the data, **parses it**, and performs **required actions**:
    - Store in database
    - Send email
    - Authenticate user
3. Server responds with **HTML page, JSON, or redirect**, and browser displays the result.

### Visual Flow (Simple)
```rust
User -> Browser -> Form Validation
        |        (client-side)
        v
      HTTP Request (GET/POST)
        |
        v
     Server Backend (e.g., Node.js, Spring Boot)
        |
        v
     Response -> Browser
```