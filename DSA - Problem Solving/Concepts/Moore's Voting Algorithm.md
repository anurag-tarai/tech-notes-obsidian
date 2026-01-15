### Steps
1. Apply Moores Voting Algorithm
2. Verify the element is majority element
## Moore's Voting Algorithm
### 🪜 Algorithm Steps

#### Phase 1: Find Candidate
1. Initialize:
    - `candidate = None`  
    - `count = 0`    
2. Traverse the array:
    - If `count == 0`, set `candidate = current element`
    - If current element == candidate → `count++`
    - Else → `count--`
At the end, you’ll get a **potential candidate**.
---
#### Phase 2: Verify Candidate

- Count how many times the candidate appears.
    
- If it appears **more than n/2 times**, it is the majority element.
    
- Otherwise, **no majority element exists**.
![](Screenshot%20from%202026-01-14%2010-55-06.png)

```java
class Solution {
    public int majorityElement(int[] nums) {

        // ---------- Phase 1: Find candidate ----------
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // ---------- Phase 2: Verify candidate ----------
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        // Check if candidate is actually majority
        if (count > nums.length / 2) {
            return candidate;
        }

        // No majority element exists
        return -1;
    }
}
```
