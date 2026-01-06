0 1 1 2 3 5 . . . .

#### Recursive function is : 
> f(n) = f(n-1) + f(n-2);

#### Base case :
if n == 0 --> 0
if n == 1 --> 1

```java
int fib(int n) {
    if (n <= 1) return n;
    return fib(n-1) + fib(n-2);
}
```

#### Example : n = 6 
Recursion Tree -->
![](Screenshot%20from%202026-01-04%2010-19-25.png)
As you see there is multiple repeated sub-problems, this is called `overlapping sub-problems`

For the example like 50, the steps going very large, will freezes the application.
#### Time complexity
**O(2ⁿ)** (exponential)

- Each `fib(n)` makes **two recursive calls**: `fib(n-1)` and `fib(n-2

If n=50, the time commplexity is 2^50 which is very large