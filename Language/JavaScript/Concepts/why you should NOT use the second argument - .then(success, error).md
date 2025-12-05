Example:
`.then(onSuccess, onError)`

⚠ NOT recommended because:
- it does **not** catch errors from previous `.then()`
- `.catch()` is cleaner and more powerful
    
This is an important industry practice.