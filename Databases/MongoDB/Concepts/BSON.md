**BSON (Binary JSON)** is a **binary-encoded** version of JSON used internally by **MongoDB**.

It is designed to be:
- **faster**
- **machine-friendly**
- **efficient for database storage**
- **support more data types**
### Key Characteristics
- Binary format (not human-readable)
- Faster to [parse](Parsing.md) than text JSON
- Stores data in a compact and indexed-friendly way
- Supports many extra data types
### Extra Data Types Supported by BSON

JSON **cannot** store these, but BSON **can**:

- `ObjectId`
- `Date`
- `Timestamp`
- `Binary`
- `Int32`, `Int64`
- `Decimal128`
- `Boolean` (native type)
- `Null` (native)
- `Regex`
- Embedded documents
- Arrays