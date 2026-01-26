# Problem 
Given two integers n and i, return true if the ith bit in the binary representation of n (counting from the least significant bit, 0-indexed) is set (i.e., equal to 1). Otherwise, return false.

Example 1

**Input:** n = 5, i = 0

**Output:** true

**Explanation:** Binary representation of 5 is 101. The 0-th bit from LSB is set (1).

  

Example 2

**Input:** n = 10, i = 1

**Output:** true

**Explanation:** Binary representation of 10 is 1010. The 1-st bit from LSB is set (1).

Now your turn!

**Input:** n = 16, i = 3

Output:

Pick your answer

true

false

Constraints

- 1 <= n <= 109
- 0 <= i <= 31
# Solution
### Formula
```java
(n & (1 << i)) != 0
```

### Example
```java
n = 16
i = 3
```

### Step 1: Binary representation of `n`
```java
16 = 10000
Index: 4 3 2 1 0
Bits:  1 0 0 0 0
```
### Step 2: Create mask using left shift
```java
1 << 3 = 01000
```

### Step 3: Apply AND operation
```java
  10000   (16)
& 01000   (mask)
--------
  00000
```

### Step 4: Check result
```java
00000 == 0  → bit is NOT set
```

### Code
```java
public static boolean isBitSet(int n, int i) {
    return (n & (1 << i)) != 0;
}

```
---
## Using Right Shift
### Formula
```java
((n >> i) & 1) == 1
```

```java
n = 16
i = 3

16 = 10000
Index: 4 3 2 1 0

n >> 3 = 10000 >> 3 = 00010

00010 & 00001 = 00000

0 → bit NOT set
```

### Code
```java
public static boolean isBitSet(int n, int i) {
    return ((n >> i) & 1) == 1;
}
```
