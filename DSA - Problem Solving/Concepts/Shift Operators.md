Shift operators **move bits left or right** inside a binary number.

---

## 1️⃣ Left Shift Operator `<<`

### Meaning
- Shifts bits **to the left**
- Fills right side with **0**
- **Multiplies number by 2ⁿ**

### Formula
```java
n << k = n × 2ᵏ
```

### Example
```java
5 = 00000101
5 << 1 = 00001010 = 10
5 << 2 = 00010100 = 20
```
### Java
```java
int x = 5;
System.out.println(x << 1); // 10
System.out.println(x << 2); // 20
```
### Use Cases
- Fast multiplication
- Setting bit positions
- Bitmask creation
---
## 2️⃣ Right Shift Operator `>>` (Signed Right Shift)

### Meaning
- Shifts bits **to the right**
- Fills left side with **sign bit**
    - `0` for positive
    - `1` for negative
- **Divides number by 2ⁿ** 

### Formula

```java
n >> k = n ÷ 2ᵏ
```

### Example (Positive)

```java
10 = 00001010
10 >> 1 = 00000101 = 5
```

### Java

```java
int x = 10;
System.out.println(x >> 1); // 5 
```

---
## 3️⃣ Unsigned Right Shift `>>>` (Java Only)

### Meaning
- Shifts bits **to the right**
- Always fills left side with **0**
- Ignores sign bit
### Example (Negative Number)
```java
-4 = 11111100
-4 >> 1  = 11111110 (still negative)
-4 >>> 1 = 01111110 (large positive)
```
### Java
```java
int x = -4;
System.out.println(x >> 1); -2
System.out.println(x >>> 1); 2147483646
```