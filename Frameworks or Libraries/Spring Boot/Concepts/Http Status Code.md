### **1xx – Informational (rarely used in APIs)**
- **100 Continue** – Server acknowledges request, client should continue sending data.
- **101 Switching Protocols** – Protocol is being switched (e.g., HTTP → WebSocket).
    
---
### **2xx – Success (most important for APIs)**
- **200 OK** – Request succeeded (most common for GET/PUT).
- **201 Created** – New resource successfully created (common for POST).
- **204 No Content** – Request succeeded but no response body (common for DELETE).

---
### **3xx – Redirection**
- **301 Moved Permanently** – Resource permanently moved (for URLs).
- **302 Found / 307 Temporary Redirect** – Resource temporarily moved.
- **304 Not Modified** – Client cache is up to date.

---
### **4xx – Client Errors (very important)**
- **400 Bad Request** – Request malformed or invalid.
- **401 Unauthorized** – Authentication required or failed.
- **403 Forbidden** – Authenticated but not allowed to access.
- **404 Not Found** – Resource doesn’t exist.
- **405 Method Not Allowed** – HTTP method not supported on this endpoint.
- **409 Conflict** – Conflicting request (e.g., duplicate entry).
- **422 Unprocessable Entity** – Validation failed (common in REST APIs).

---
### **5xx – Server Errors (very important)**
- **500 Internal Server Error** – Generic server error.
- **501 Not Implemented** – Server doesn’t support the requested method.
- **502 Bad Gateway** – Server got invalid response from upstream server.
- **503 Service Unavailable** – Server overloaded or down for maintenance.
- **504 Gateway Timeout** – Server didn’t get timely response from upstream.