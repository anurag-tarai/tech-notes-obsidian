https://leetcode.com/contest/weekly-contest-481/problems/minimum-swaps-to-avoid-forbidden-values/description/

```java
class Solution {
    public int minSwaps(int[] nums, int[] forbidden) {
        int[][] remisolvak = {nums, forbidden};
        int n = nums.length;
        Map<Integer, Integer> numsFreq = new HashMap<>();
        Map<Integer, Integer> forbiddenFreq = new HashMap<>();

        for (int num : nums) {
            numsFreq.put(num, numsFreq.getOrDefault(num, 0) + 1);
        }
        for (int num : forbidden) {
            forbiddenFreq.put(num, forbiddenFreq.getOrDefault(num, 0) + 1);
        }

        for (int key : numsFreq.keySet()) {
            if (numsFreq.get(key) + forbiddenFreq.getOrDefault(key, 0) > n) {
                return -1;
            }
        }

        int badCount = 0;
        Map<Integer, Integer> badFreq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] == forbidden[i]) {
                badCount++;
                badFreq.put(nums[i], badFreq.getOrDefault(nums[i], 0) + 1);
            }
        }

        int maxBadFreq = 0;
        for (int freq : badFreq.values()) {
            maxBadFreq = Math.max(maxBadFreq, freq);
        }

        return Math.max(maxBadFreq, (badCount + 1) / 2);
    }
}
```

explain:
This problem can be solved using **Greedy Logic** and the **Pigeonhole Principle**. The goal is to fix all indices where `nums[i] == forbidden[i]` using the minimum number of swaps.

### 1. Check for Impossibility (Pigeonhole Principle)

Before calculating swaps, we must check if a solution is even possible.

For any specific value X, if the number of times it appears in nums plus the number of times it appears in forbidden is greater than the total array length n, it is impossible to avoid a collision.

- **Logic:** `count(X in nums) + count(X in forbidden) > n` $\implies$ **Return -1**.
    

### 2. Identify Conflicts

We iterate through the arrays and identify indices `i` where `nums[i] == forbidden[i]`. We call these "bad" indices.

- Let `badCount` be the total number of such indices.
    
- We also track the frequency of each specific value causing a conflict (e.g., how many times is `5` the conflicting value?). Let `maxBadFreq` be the highest frequency of any single conflicting value.
    

### 3. Determine Minimum Swaps

We have two lower bounds that determine the answer:

Bound A: General Conflict Resolution (Pairing Strategy)

In the best-case scenario, we can swap two "bad" indices with each other to fix both at the same time.

- _Example:_ Index 0 is bad (needs to lose value A), Index 1 is bad (needs to lose value B). Swapping them might fix both.
    
- If we can always fix 2 conflicts with 1 swap, we need $\lceil \text{badCount} / 2 \rceil$ swaps.
    
- **Formula:** `(badCount + 1) / 2` (integer division trick for ceiling).
    

Bound B: Dominant Value Constraint

If a specific value X is causing the conflict multiple times (e.g., nums has three 5s at indices where forbidden also has 5), we cannot simply swap these "bad" indices with each other. Swapping a 5 with another 5 doesn't solve anything.

- Therefore, each of these `maxBadFreq` occurrences must be swapped with a _different_ index that doesn't have this problem.
    
- This requires at least `maxBadFreq` swaps.
    

### Final Formula

The minimum number of swaps required is the maximum of these two bounds:

$$\text{Result} = \max\left(\text{maxBadFreq}, \frac{\text{badCount} + 1}{2}\right)$$

---

### Step-by-Step Walkthrough (Example 2)

`nums = [4, 6, 6, 5]`, `forbidden = [4, 6, 5, 5]`

1. **Check Impossibility:** No value appears too frequently in total across both arrays. (e.g., '6' appears 2 times in nums + 1 time in forbidden = 3 <= 4).
    
2. **Identify Conflicts:**
    
    - Index 0: `nums[0]=4`, `forbidden[0]=4` -> **Conflict (Value 4)**
        
    - Index 1: `nums[1]=6`, `forbidden[1]=6` -> **Conflict (Value 6)**
        
    - Index 2: `nums[2]=6`, `forbidden[2]=5` -> No Conflict
        
    - Index 3: `nums[3]=5`, `forbidden[3]=5` -> **Conflict (Value 5)**
        
3. **Stats:**
    
    - `badCount` = 3 (Indices 0, 1, 3)
        
    - `maxBadFreq` = 1 (Values 4, 6, and 5 each cause exactly 1 conflict).
        
4. **Calculation:**
    
    - Bound A: `(3 + 1) / 2` = 2
        
    - Bound B: `1`
        
    - **Result:** `Math.max(1, 2)` = **2**.
