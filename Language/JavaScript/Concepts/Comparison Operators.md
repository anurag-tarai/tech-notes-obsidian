Compare **values**. Returns a boolean (`true`/`false`).

| Operator | Description                   | Example     | Result  |
| -------- | ----------------------------- | ----------- | ------- |
| ==       | Equality (with type coercion) | `5 == "5"`  | `true`  |
| ===      | Strict equality (no coercion) | `5 === "5"` | `false` |
| `!=`     | Not equal (type coercion)     | `5 != "5"`  | `false` |
| `!==`    | Strict not equal              | `5 !== "5"` | `true`  |
| `<`      | Less than                     | `5 < 10`    | `true`  |
| `>`      | Greater than                  | `5 > 10`    | `false` |
| `<=`     | Less than or equal            | `5 <= 5`    | `true`  |
| `>=`     | Greater than or equal         | `5 >= 10`   | `false` |

### Important Notes on == vs === :

- == **performs type coercion**, converts operands to same type before comparison.
    
- === **strict comparison**, no coercion → safer to use in most cases.