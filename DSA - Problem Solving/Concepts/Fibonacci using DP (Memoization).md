## Core Idea of Dynamic Programming
DP is used when:
1. **Same subproblems repeat**
2. **Big problem can be broken into smaller ones**

Fibonacci satisfies **both**.

**DP Principle:**

> _“Solve each subproblem once, store its result, and reuse it whenever needed.”_

---
## Memoization
#### How to think
- You still think **recursively**
- But you **store results**
- Before solving, you ask:

>  “Have I solved this before?”

If yes → use it  
If no → compute and store it

---
### Fibonacci Using Recursion Brute Force :
```java
int fib(int n) {
    if (n <= 1) return n;
    return fib(n-1) + fib(n-2);
}
```
### Complexity

- **Time:** ❌ `O(2^n)` (exponential, very slow)
    
- **Space:** `O(n)` (recursion stack)

### Fibonacci Using DP – Memoization (Top-Down)
#### Idea
1. Use a **DP array** to store already computed Fibonacci values
2. Before computing `fib(n)`, check if it already exists in `dp`
3. If it exists → return it  
    If not → compute, store, and return
```java
int[] dp = new int[n+1];
Arrays.fill(dp, -1);

long fibonacciDp(int n, long[]dp){  
    if(n<=1) return n;  
    if(dp[n]!=-1) return dp[n];  
    return dp[n] = fibonacciDp(n-1,dp) + fibonacciDp(n-2, dp);  
}
```

```java
// In main method
int n = 50;  
long[]dp = new long[n+1];  
Arrays.fill(dp, -1);  
  
System.out.println(DynamicProgramming.fibonacciDp(n, dp));
```

### Time complexity & Space Complexity
![](Screenshot%20from%202026-01-05%2007-39-58.png)

Time complexity --> O(n)

With **memoization (DP)**:
- Each Fibonacci value `fib(0), fib(1), ..., fib(n)` is **computed only once**, Fibonacci runs in linear time O(n)

Space complexity -->
- `O(n)` for DP array
- `O(n)` for recursion call stack  
    ➡️ Overall **O(n)**
