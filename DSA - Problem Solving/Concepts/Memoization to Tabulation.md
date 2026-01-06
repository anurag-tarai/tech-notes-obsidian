### Memoization (Top Down)
- Start solving from the **original problem (`n`)**
- Break it into **smaller subproblems recursively**
- **Store computed results** and reuse them to avoid recomputation
### Tabulation (Bottom Up)
- Start solving from the **smallest subproblems (base cases)**
- **Iteratively build** solutions for larger subproblems by filling a **DP table**
- **No recursion** is used
---
Identify the base case
``` java
fib(0) = 0
fib(1) = 1
```
Recursive Formula 
```java
fib(i) = fib(i-1) + fib(i-2)
```
Changes to,
```java
// Base cases
dp[0] = 0;
dp[1] = 1;
```

```java
dp[i] = dp[i-1] + dp[i-2];
```

Code 
```java
public static long fibonacciTabulation(int n) {
    if (n <= 1) return n;

    long[] dp = new long[n + 1];

    // base cases
    dp[0] = 0;
    dp[1] = 1;

    // build from bottom to top
    for (int i = 2; i <= n; i++) {
        dp[i] = dp[i - 1] + dp[i - 2];
    }

    return dp[n];
}
```
### Time Complexity
**O(n)**
- Loop runs from `2` to `n`
- Each step does constant work
### Space Complexity
**O(n)**
- `O(n)` for DP array
- ❌ No recursion stack