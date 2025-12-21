JavaScript is **single-threaded**, but many operations take time:
- API calls
- Database calls
- Timers (`setTimeout`)
- File/network operations

Earlier we handled this using:
- Callbacks → **callback hell**
- Promises → **then / catch chaining**
    
👉 **async & await** makes Promise-based code **easy to read and write**.