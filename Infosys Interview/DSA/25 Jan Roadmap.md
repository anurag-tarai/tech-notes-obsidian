### **Phase 1: Arrays & Parity Logic (The "Summer Array" Pattern)**

_Recent exams featured a "Summer Array" problem requiring you to group even/odd numbers with minimum swaps._

- **Logic to Master:** Two Pointers, Partitioning, and Minimum Swaps to Group elements.
    
- **Practice Set:**
    
    1. **LeetCode 905:** Sort Array By Parity (Warm-up for the target state).
        
    2. **LeetCode 922:** Sort Array By Parity II (Understanding strict placement).
        
    3. **LeetCode 2134:** Minimum Swaps to Group All 1's Together II (**High Priority**: This is the logic used for the "Summer Array" question. Treat 'Evens' as 1s and 'Odds' as 0s).
        
    4. **LeetCode 1151:** Minimum Swaps to Group All 1's Together (Similar to above, solves the "grouping" cost logic).
        

### **Phase 2: Sliding Window & Optimization (The "K Swaps" Pattern)**

_A common Medium question asks for the "Max Sum Subarray" where you can swap up to K elements from outside the window._

- **Logic to Master:** Sliding Window, Priority Queue (Min-Heap), and Greedy replacements.
    
- **Practice Set:**
    
    1. **LeetCode 53:** Maximum Subarray (The base logic: Kadane’s Algorithm).
        
    2. **LeetCode 1004:** Max Consecutive Ones III (Classic Sliding Window with "K changes" allowance).
        
    3. **LeetCode 1423:** Maximum Points You Can Obtain from Cards (Logic for picking elements from edges vs. center).
        
    4. **LeetCode 1438:** Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit (Teaches you to use Deque/Heap inside a sliding window).
        

### **Phase 3: Bit Manipulation (The "Khaled's XOR" Pattern)**

_XOR maximization problems are frequent in the "Medium/Hard" slot._

- **Logic to Master:** XOR Properties, Basis Vectors (Gaussian Elimination concept), and Greedy Bit placement.
    
- **Practice Set:**
    
    1. **LeetCode 136:** Single Number (Basic XOR property check).
        
    2. **LeetCode 1863:** Sum of All Subset XOR Totals (Practice generating XOR subsets).
        
    3. **LeetCode 421:** Maximum XOR of Two Numbers in an Array (**High Priority**: Teaches the "Trie/Greedy bit" approach used in harder variations).
        
    4. **LeetCode 2429:** Minimize XOR (Understanding how to set/unset bits to reach a target).
        

### **Phase 4: Dynamic Programming & Partitioning (The "Segment Cost" Pattern)**

_This is the "Gatekeeper" question for the high-paying SP role. It often involves splitting an array into segments to minimize a specific cost._

- **Logic to Master:** Partition DP, Memoization, and Pre-computation.
    
- **Practice Set:**
    
    1. **LeetCode 1043:** Partition Array for Maximum Sum (Classic Partition DP structure).
        
    2. **LeetCode 410:** Split Array Largest Sum (**High Priority**: The standard for "split array into K segments" problems).
        
    3. **LeetCode 2547:** Minimum Cost to Split an Array (**Critical**: This is extremely similar to the recent "Segment Cost" question. The cost function changes, but the DP structure `dp[i] = min(dp[j] + cost(j, i))` is identical).
        
    4. **LeetCode 312:** Burst Balloons (Advanced Interval DP).
        

### **Phase 5: Trees & Graph Construction**

_Recent slots asked for Path Sums using an Adjacency List (Edge List) input, requiring you to build the graph first._

- **Logic to Master:** Graph construction from edges, DFS, and Path Sums.
    
- **Practice Set:**
    
    1. **LeetCode 113:** Path Sum II (Finding paths with specific sums).
        
    2. **LeetCode 437:** Path Sum III (Sub-paths logic).
        
    3. **LeetCode 797:** All Paths From Source to Target (DFS Traversal).
        
    4. **LeetCode 323:** Number of Connected Components in an Undirected Graph (If you don't have premium, use **LeetCode 547** Number of Provinces).
        

---

### **Execution Strategy**

Since you are currently jobless and targeting a role quickly, I recommend this **7-Day Crash Schedule**:

- **Day 1:** Arrays & Parity (Phase 1)
    
- **Day 2:** Sliding Window (Phase 2)
    
- **Day 3:** Bit Manipulation (Phase 3)
    
- **Day 4:** Trees & Graphs (Phase 5)
    
- **Day 5:** Dynamic Programming (Phase 4 - Focus on LC 410 & 2547)
    
- **Day 6:** Revise "Hard" problems from Phase 2 & 4.
    
- **Day 7:** Go to YouTube for Mock Tests (Previous Year Questions).