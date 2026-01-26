> **Dynamic Programming (DP)** is a problem-solving technique where you **break a problem into smaller overlapping subproblems**, **solve each subproblem once**, and **store their results** so you don’t recompute them again.

## When do we use Dynamic Programming?
A problem is suitable for DP if it has:

1. **Overlapping subproblems**  
    Same subproblems appear again and again  
    (e.g., Fibonacci)
    
2. **Optimal substructure**  
    Optimal solution of a problem can be built from optimal solutions of its subproblems  
    (e.g., shortest path, knapsack)

---
## DP has 3 main approaches

### 1. **Recursion (Brute Force)**

Slow ❌

### 2. **Memoization (Top-Down DP)**

Recursion + cache ✅

### 3. **Tabulation (Bottom-Up DP)**

Iterative DP table ✅✅ (most used in interviews)