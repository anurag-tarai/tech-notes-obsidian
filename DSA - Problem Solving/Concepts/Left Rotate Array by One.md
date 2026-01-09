## Problem Statement
Given an integer array **nums**, rotate the array to the **left** by **one**.

**Note**: There is no need to return anything, just modify the given array.

Example 1

**Input**: nums = [1, 2, 3, 4, 5]

**Output**: [2, 3, 4, 5, 1]

**Explanation**:

Initially, nums = [1, 2, 3, 4, 5]

Rotating once to left -> nums = [2, 3, 4, 5, 1]

Example 2

**Input**: nums = [-1, 0, 3, 6]

**Output**: [0, 3, 6, -1]

**Explanation**:

Initially, nums = [-1, 0, 3, 6]

Rotating once to left -> nums = [0, 3, 6, -1]

---
## Solution
![](Screenshot%20from%202026-01-06%2010-28-31.png)

Here if the interviewer ask the space that algorithm takes not the extra space, is `O(n`, as we are using arr which length is n