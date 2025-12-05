A **data type** is the **kind of value** you can store and work with in JavaScript.

It tells JavaScript:
- **What type of data** is stored
- **How much memory** to use
- **What operations** are allowed on that value

###### Example:  
`42` → number  
`"hello"` → string  
`true` → boolean

## Why data types matter?
Because JavaScript needs to understand:
- Is this value a number?
- Is it text?
- Is it true/false?
- Is it an object with properties?

Different types behave differently.

---
## JavaScript Data Types (2 categories)

##### 1. [Primitive Types](Primitive%20Types.md) ([Immutable](Immutable.md), stored by value)
- `number`
- `string`
- `boolean`
- `null`
- `undefined`
- `symbol`
- `bigint`
##### 2. [[Reference Types]] (stored by reference)
- `object` (includes arrays, functions, dates, etc.)

## Without Data Type JS can't solve these
```js
let x = 16 + "Volvo";
// Does it make any sense to add "Volvo" to sixteen? Will it produce an error or will it produce a result?
```
But when we have  type : When adding a number and a string, JavaScript will treat the number as a string.