![](bracket-1%201.jpeg) 
### **Bracket Combinations**

Have the function `BracketCombinations(num)` read `num` which will be an integer greater than or equal to zero, and return the number of valid combinations that can be formed with `num` pairs of parentheses.

For example, if the input is 3, then the possible combinations of 3 pairs of parenthesis, namely: `()()()`, are `()()()`, `()(())`, `(())()`, `((()))`, and `(())()`. There are 5 total combinations when the input is 3, so your program should return 5.

**Examples**

- **Input:** 3
- **Output:** 5

- Input : 2
- Output : 2

- input : 4
- output : 14
---
## 1️⃣ Understanding the problem
You are given **`num` pairs of parentheses**.

Each pair has:
- `num` opening brackets `(`
- `num` closing brackets `)`

A combination is **valid** if:
- You never close more brackets than you’ve opened
- Total open = total close = `num`

Example for `num = 3`  
Valid ones:
```
()()()
()(())
(())()
(()())
((()))
```

Total = **5**

---

## 2️⃣ Brute Force Approach (Generate EVERYTHING ❌)

### Idea

1. Generate **all possible strings** of length `2 * num`
    
2. Each character can be `(` or `)`
    
3. Check each string if it is valid
    

### How many total strings?

- Each position has 2 choices
    
- Total = `2^(2*num)` strings → **huge**
    

For `num = 3`:

2^6 = 64 strings

For `num = 10`:

2^20 ≈ 1,000,000 (bad)

---

### Validation Logic

A string is valid if:

- Balance never goes negative
    
- Final balance = 0
    

### Brute Force Pseudocode
```java
count = 0

generate all strings of length 2*num:
    if isValid(string):
        count++

return count
```
### Time Complexity

O(2^(2n) * n)

❌ Very slow  
❌ Mostly useless strings

---
## 3️⃣ Better Approach – Backtracking (Recommended 🟢)

This is the **standard interview solution**.
### Key Insight
Don’t generate invalid strings at all.

### Rules

- You can add `(` **if open < num**
    
- You can add `)` **if close < open**
    
This guarantees:

- Never invalid
    
- Never extra strings
    
---
### Backtracking Tree (num = 3)
```java
(
  ((
    ((()
      ((())
        ((()))
  (()
    (()(
      (()())
    (())
      (())()
```

Only valid paths survive 🌱

---

### Code (Java-style)
```java
public static int BracketCombinations(int num) {
    return backtrack(0, 0, num);
}

private static int backtrack(int open, int close, int max) {
    // valid combination formed
    if (open == max && close == max) {
        return 1;
    }

    int count = 0;

    if (open < max) {
        count += backtrack(open + 1, close, max);
    }

    if (close < open) {
        count += backtrack(open, close + 1, max);
    }

    return count;
}
```
### Time Complexity

O(Cn)

Where `Cn` is the **Catalan number**

Much faster than brute force  
This is what **most interviews expect**