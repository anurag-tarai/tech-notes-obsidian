| Operator | Meaning                        | Example                                                    |
| -------- | ------------------------------ | ---------------------------------------------------------- |
| `$and`   | All conditions must match      | `{ $and: [{ age: { $gte: 18 } }, { age: { $lte: 30 } }] }` |
| `$or`    | At least one condition matches | `{ $or: [{ role: "admin" }, { role: "manager" }] }`        |
| `$not`   | Negates a condition            | `{ age: { $not: { $gte: 18 } } }` → age < 18               |
| `$nor`   | None of the conditions match   | `{ $nor: [{ status: "Active" }, { status: "Pending" }] }`  |
