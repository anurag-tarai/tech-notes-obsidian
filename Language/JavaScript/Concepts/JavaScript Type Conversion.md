JavaScript converts values in **two ways**:
### 1. Explicit Conversion (Manual)

You intentionally convert a value using functions like:  
`Number()`, `String()`, `Boolean()`, `parseInt()`, `parseFloat()`, `toString()`, etc.

### 2. Implicit Conversion (Automatic / Coercion)

JavaScript automatically converts types during operations like `+`, `-`, logical checks, comparisons, etc.

---

# Converting → Number

Use:
- `Number(value)`
- `parseInt(value)`
- `parseFloat(value)`
- Unary `+value`

Examples:

- `Number("3.14") → 3.14`
- `Number("") → 0`
- `Number("John") → NaN`
- `+"5" → 5`

**Boolean → Number**:

- `true → 1`
- `false → 0`

**Date → Number**:

- `Number(new Date())`
- `date.getTime()`

---

# Converting → String

Use:
- `String(value)`
- `value.toString()`

Examples:

- `String(123) → "123"`
- `(100).toString() → "100"`

**Date → String**:

- `String(new Date())`
- `date.toString()`

---

# Converting → Boolean

Use:

- `Boolean(value)`
- `!!value`

**Truthy values:**  
`"anything"`, `123`, `[]`, `{}`, `true`

**Falsy values:**  
`false`, `0`, `""`, `null`, `undefined`, `NaN`

---

#  Implicit Type Conversion (Coercion)

JS auto-converts depending on the operator.

### **String + Anything → String**

- `"5" + 2 → "52"`
- `"Hello" + null → "Hellonull"`

### **Arithmetic Operators (except +)**

Force **number conversion**:

- `"5" - 2 → 3`
- `"5" * "2" → 10`
- `5 + null → 5` (null becomes `0`)

---

# Automatic toString()

When JS outputs a value:

- `[] → ""`
    
- `[1,2] → "1,2"`
    
- `{ } → "[object Object]"`
    
- `function(){} → "function(){}"`
    

---

# Key Conversion Table (Important for Interviews)

| Value       | → Number | → String          | → Boolean |
| ----------- | -------- | ----------------- | --------- |
| `false`     | 0        | "false"           | false     |
| `true`      | 1        | "true"            | true      |
| `""`        | 0        | ""                | false     |
| `"20"`      | 20       | "20"              | true      |
| `"abc"`     | NaN      | "abc"             | true      |
| `null`      | 0        | "null"            | false     |
| `undefined` | NaN      | "undefined"       | false     |
| `[]`        | 0        | ""                | true      |
| `{}`        | NaN      | "[object Object]" | true      |

---

# **📌 Final Takeaways (must remember)**

- JS is **dynamically typed** → conversions happen at runtime.
    
- `+` prefers **string**, other math operators prefer **number**.
    
- == triggers **type coercion** (dangerous).
    
    - Example: `0 == "" `→ true,` null == undefined` → true`
        
- === never converts types → always safer.
    
- Always avoid relying on implicit conversion in real projects.