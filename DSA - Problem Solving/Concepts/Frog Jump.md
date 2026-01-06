## Problem Statement
A frog wants to climb a staircase with **n** steps. Given an integer array **heights**, where **heights[i]** contains the height of the **i****th** step.

To jump from the **i****th** step to the **j****th** step, the frog requires **abs(heights[i] - heights[j])** energy, where abs() denotes the absolute difference. The frog can jump from any step either **one** or **two** steps, provided it exists.

Return the **minimum** amount of energy required by the frog to go from the **0****th** step to the **(n-1)****th** step.

Example 1

**Input**: heights = [2, 1, 3, 5, 4]

**Output**: 2

**Explanation**:

One possible route can be,

0th step -> 2nd Step = abs(2 - 3) = 1

2nd step -> 4th step = abs(3 - 4) = 1

Total = 1 + 1 = 2.

Example 2

**Input**: heights = [7, 5, 1, 2, 6]

**Output**: 9

**Explanation**:

One possible route can be,

0th step -> 1st Step = abs(7 - 5) = 2

1st step -> 3rd step = abs(5 - 2) = 3

3rd step -> 4th step = abs(2 - 6) = 4

Total = 2 + 3 + 4 = 9.

Now your turn!

**Input**: nums = [3, 10, 3, 11, 3]

Output:

Pick your answer

8

7

0

1

Constraints

- 1 <= n <= 104
- 0 <= heights[i] <= 104
## Solution 
![](Screenshot%20from%202026-01-05%2015-41-49.png)
### Why Greedy will not works here?
A greedy idea:
> “At each step, jump to the next stone that gives **minimum immediate cost**.”

This feels logical:
- Smaller jump cost now → looks good
- Why take a bigger cost?
But this logic is **short-sighted**.

Example : 
![](Pasted%20image%2020260105154655.png)

---
## Recursion -> Try all possible ways
[Trick to solve any recursion problem](Trick%20to%20solve%20any%20recursion%20problem.md) 
1. Index (0, 1, 2, 3......n)
2. Do all stuff on that index
3. Take the min of all stuffs

for 0 based indexing
f(n-1) -> min energy required to reach (n-1) from 0 

To reach stone `n`:
- Either come from `n-1` 
- Or come from `n-2`
So, which stone it comes from, the energy will be the energy before that stone + from that stone to current stone
```java
f(n) = min(
    f(n-1) + cost(n-1 → n),
    f(n-2) + cost(n-2 → n)
)
```

Base Case
```java
f(0) = 0   // already on first stone
```

![](Screenshot%20from%202026-01-05%2016-51-10.png)

✅ Recursive Code
```java
public static int frogJump(int n, int[] h) {
    if (n == 0) return 0; // energy is 0 as the its same stone

    int oneJump = frogJump(n - 1, h)
                  + Math.abs(h[n] - h[n - 1]);

    int twoJump = Integer.MAX_VALUE;
    if (n > 1) {
        twoJump = frogJump(n - 2, h)
                  + Math.abs(h[n] - h[n - 2]);
    }

    return Math.min(oneJump, twoJump);
}
```

#### ⏱ Time & Space (Recursion)
- **Time:** O(2ⁿ)
- **Space:** O(n) (recursion stack)
---
## Memoization (Top-Down DP)
```java
public static int frogJumpMemo(int n, int[] h, int[] dp) {
    if (n == 0) return 0;
    if (dp[n] != -1) return dp[n];// if exist in dp array

    int oneJump = frogJumpMemo(n - 1, h, dp)
                  + Math.abs(h[n] - h[n - 1]);

    int twoJump = Integer.MAX_VALUE;
    if (n > 1) {
        twoJump = frogJumpMemo(n - 2, h, dp)
                  + Math.abs(h[n] - h[n - 2]);
    }

    return dp[n] = Math.min(oneJump, twoJump); // if not exist, store it in dp array
}
```

```java
// initialization
int[] dp = new int[n];
Arrays.fill(dp, -1);
```

#### ⏱ Time & Space (Memoization)
- **Time:** ✅ O(n)
- **Space:** O(n) (dp array + recursion stack)

---
## Tabulation (Bottom-Up DP)

### Thinking
Instead of going **top → down**, go **bottom → up**.
We already know:
`dp[0] = 0`
Then compute `dp[1]`, `dp[2]`, ..., `dp[n-1]`.

---

### ✅ Tabulation Code

```java
public static int frogJumpTabulation(int[] heights) {  
   int n = heights.length;  
   int[] dp = new int[n];  
  
   dp[0] = 0;  
  
   for(int i=1; i<n; i++){  
       int oneJump = dp[i-1] + Math.abs(heights[i-1]-heights[i]);  
  
       int twoJump = Integer.MAX_VALUE;  
       if(i>1){  
           twoJump = dp[i-2] + Math.abs(heights[i-2]-heights[i]);  
       }  
  
       dp[i] = Math.min(oneJump, twoJump);  
   }  
   return dp[n-1];  
}
```
We compute the minimum cost for each stone using results from the previous one or two stones, storing answers in a DP table.

---

#### Time & Space (Tabulation)

- **Time:** ✅ O(n)
    
- **Space:** O(n) (dp array)
    
- **No recursion stack** 👍

---

## Space Optimization

### 🔹 Observation

To compute `dp[i]`, we only need:

- `dp[i-1]`
    
- `dp[i-2]`
    

👉 No need for full array.

---

### ✅ Space Optimized Code
```java
public static int frogJumpSpaceOptimization(int[] heights) {  
    int n = heights.length;  
  
    if(n<=1) return 0;  
  
   int prev2 = 0;  
   int prev = Math.abs(heights[0]-heights[1]);  
  
    for(int i=2; i<n; i++){  
  
        int oneJump = prev + Math.abs(heights[i-1]-heights[i]);  
        int twoJump =  prev2 + Math.abs(heights[i-2]-heights[i]);  
          
        int curr = Math.min(oneJump, twoJump);  
  
        prev2 = prev;  
        prev = curr;  
    }  
    return prev;  
}
```
---

## ⏱ Time & Space (Optimized)

- **Time:** ✅ O(n)
    
- **Space:** ✅ O(1)
    
---
