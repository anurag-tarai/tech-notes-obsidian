[53. Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) 
## Brute Force Solution
![](Screenshot%20from%202026-01-14%2014-49-12.png)
## Better Solution
![](Screenshot%20from%202026-01-14%2014-49-43.png)
## Optimal : Kadane's Algorithm
![](Screenshot%20from%202026-01-14%2015-05-37.png)
![](Screenshot%20from%202026-01-14%2015-06-03.png)
Time complexity : O(n)
Space Complexity : O(1)

```java
public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
```

---
## Definition :
**Kadane’s Algorithm** is an **efficient algorithm** used to find the **maximum sum of a contiguous subarray** within a given one-dimensional array of integers.

It works by **discarding negative subarray sums** and **continuing only with subarrays that increase the total sum**.
## Key Idea
- A **negative sum is useless** because adding it to future elements will only decrease the total.
- At each index, decide:
    - Continue the existing subarray, or
    - Start a new subarray from the current element.
This makes Kadane’s Algorithm a form of **Dynamic Programming**.
## Algorithm Steps
1. Initialize:
    - `currentSum` = 0
    - `maxSum` = smallest possible integer
2. Traverse the array:
    - Add current element to `currentSum`
    - Update `maxSum` if `currentSum` is greater
    - If `currentSum` becomes negative, reset it to `0`
3. Return `maxSum`