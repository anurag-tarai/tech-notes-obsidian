Used to check a variable’s type.

| Data Type | Example        | typeof result      |
| --------- | -------------- | ------------------ |
| String    | `"hello"`      | `"string"`         |
| Number    | `10`           | `"number"`         |
| BigInt    | `10n`          | `"bigint"`         |
| Boolean   | `true`         | `"boolean"`        |
| Undefined | `undefined`    | `"undefined"`      |
| Null      | `null`         | `"object"` *(bug)* |
| Symbol    | `Symbol()`     | `"symbol"`         |
| Object    | `{}`           | `"object"`         |
| Array     | `[]`           | `"object"`         |
| Function  | `function(){}` | `"function"`       |