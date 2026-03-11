`ObjectId` is the **default unique ID** (`_id` ) for documents in MongoDB.

It is a **12-byte** value, usually shown as a **24-character hex string**, like:

```c
64e33b5f9a1c3e4a8bcd1234
```

### ObjectId Structure (12 bytes total)
```bash
+----------------+------------------------+----------------+
| 4 bytes        | 5 bytes                | 3 bytes        |
| Timestamp      | Random Value           | Counter        |
+----------------+------------------------+----------------+
```
More clearly:
1. **4 bytes → Timestamp**
2. **5 bytes → Random value (machine + process)**
3. **3 bytes → Counter (auto-incrementing)**
## 1. Timestamp (4 bytes)

- Stored as the number of **seconds since Unix epoch** (1 Jan 1970).
- Helps MongoDB **sort documents by creation time**.
- This is why sorting by `_id` also sorts by insertion time.
## Example: extract timestamp

`ObjectId("64e33b5f9a1c3e4a8bcd1234").getTimestamp()`

Output:
`2023-08-21T10:15:27.000Z`

---
## 2. Random Value (5 bytes)

This part ensures IDs are unique even across:
- Different machines
- Different MongoDB processes

Originally:
- 3 bytes = machine identifier
- 2 bytes = process ID

Now MongoDB uses a secure 5-byte random value.

---

## 3. Counter (3 bytes)

- A **24-bit incrementing counter**.
- Starts at a random number when MongoDB server starts.
- Ensures unique IDs even if timestamp + random value are identical.

This allows MongoDB to generate **~16 million** unique ObjectIds per second.
