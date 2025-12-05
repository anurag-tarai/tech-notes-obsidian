**Type coercion** = JavaScript **automatically converts types** depending on the operation.
```js
// 1️⃣ String + Number → string concatenation
"10" + 5        // "105"
5 + "10"        // "510"

// 2️⃣ String - Number → number subtraction (string → number)
"10" - 3        // 7
"20" - "5"      // 15

// 3️⃣ Boolean + Number → boolean converted to number
true + 10       // 11   (true → 1)
false + 10      // 10   (false → 0)

// 4️⃣ Null and undefined
null + 5        // 5    (null → 0)
undefined + 5   // NaN  (undefined cannot be converted to number)
null + "5"      // "null5"  (null → "null" because of + with string)

// 5️⃣ Boolean + String
true + "test"   // "truetest"
false + "1"     // "false1"

// 6️⃣ Number + Boolean + String (chained operations)
1 + true + "3"  // "23"  (1+true=2, then 2+"3"="23")
"3" + 1 + true  // "311" ("3"+1="31", "31"+true="31true")

// 7️⃣ Multiplication, Division, Modulus → string/boolean → number
"6" * "2"       // 12
"6" / "2"       // 3
"7" % "3"       // 1
true * 3        // 3
false * 100     // 0

// 8️⃣ Comparisons with coercion
"5" > 3         // true   ("5" → 5)
"5" < 3         // false
"5" == 5        // true   (loose equality converts types)
"5" === 5       // false  (strict equality, no type coercion)
0 == false      // true
0 === false     // false

// 9️⃣ Unary + (forces conversion to number)
+"42"           // 42
+true           // 1
+false          // 0
+null           // 0
+undefined      // NaN

// 🔹 Weird but interesting
" \t\n" - 2     // -2    (whitespace string → 0)
[] + []         // ""    (empty arrays → empty string when concatenated)
[] + {}         // "[object Object]"
{} + []         // 0     (because JS interprets {} as block, +[] → 0)

```

**Notes:**
- `+` → if any operand is string → converts the other to string (concatenation).
- Other arithmetic operators → convert strings/booleans to numbers.