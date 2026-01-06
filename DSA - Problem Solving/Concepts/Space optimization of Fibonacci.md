**Space optimization** is a technique in DP where we **reduce the extra memory used** by the DP table/array **without affecting the correctness** of the solution.

- Many DP problems store all previous subproblem results.
- Sometimes, **we only need a few previous values** to compute the next result.
- In such cases, we can **replace the DP array with a few variables**.
```java
public static long fibonacciDpTabSpaceOptimized(int n) {
    if (n <= 1) return n;

    long prev2 = 0; // fib(0)
    long prev1 = 1; // fib(1)

    for (int i = 2; i <= n; i++) {
        long curr = prev1 + prev2;
        prev2 = prev1;
        prev1 = curr;
    }

    return prev1;
}
```

Here, we only need previous two result to calculate the next.
So, instead of using a DP array of size n, only use 3 variable to calculate the next step.
### Time complexity
O(n) : For loop runs n time

### Space complexity
O(1) : No dp array used here