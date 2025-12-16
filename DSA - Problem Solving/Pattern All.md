
```dataviewjs
const tasks = dv.current().file.tasks;

// --- Overall stats ---
const total = tasks.length;
const done = tasks.filter(t => t.completed).length;
const percent = total ? Math.round((done / total) * 100) : 0;

// Determine color and celebrate icon
let color = "#8B0000"; // default Dark Red
let celebrate = "";
if (percent < 50) color = "#8B0000";
else if (percent < 80) color = "#008080";
else if (percent < 100) { color = "#2E7D32"; celebrate = "🏆"; }
else { color = "#DAA520"; celebrate = "𓆰♕𓆪👑𓆰♕𓆪"; }

// Header
dv.header(3, `[${done}/${total}] Questions(${percent}%) ${celebrate}`);

// --- Overall Progress Bar ---
dv.span(`<div style="
  width:100%;
  background-color:#333;
  height:12px;
  border-radius:6px;
  overflow:hidden;
  margin-top:6px;
  margin-bottom:12px;
">
  <div style="
    width:${percent}%;
    height:12px;
    background-color:${color};
    transition: width 0.5s ease;
    border-radius:6px;
  "></div>
</div>`);
```
## 1. Pattern: Two Pointers
> **Trigger:** Sorted array, find a pair, remove duplicates, or compare ends.

- [ ] [Pair with Target Sum (Two Sum II)](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/)
- [ ] [Segregate 0s and 1s](https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1)
- [ ] [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/)
- [ ] [Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/)
- [ ] [3Sum](https://leetcode.com/problems/3sum/)
- [ ] [3Sum Closest](https://leetcode.com/problems/3sum-closest/)
- [ ] [Triplets with Smaller Sum (GFG)](https://www.geeksforgeeks.org/problems/count-triplets-with-sum-smaller-than-x5549/1)
- [ ] [Subarray Product Less Than K](https://leetcode.com/problems/subarray-product-less-than-k/)
- [ ] [Sort Colors (Dutch National Flag)](https://leetcode.com/problems/sort-colors/description/)
- [ ] [4Sum](https://leetcode.com/problems/4sum/)
- [ ] [Backspace String Compare](https://leetcode.com/problems/backspace-string-compare/)
- [ ] [Shortest Unsorted Continuous Subarray](https://leetcode.com/problems/shortest-unsorted-continuous-subarray/)

## 2. Pattern: Fast & Slow Pointers
> **Trigger:** Linked List cycles, finding middle, or cycle in array.

- [ ] [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/)
- [ ] [Linked List Cycle II (Start of Cycle)](https://leetcode.com/problems/linked-list-cycle-ii/)
- [ ] [Happy Number](https://leetcode.com/problems/happy-number/)
- [ ] [Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/)
- [ ] [Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/)
- [ ] [Reorder List](https://leetcode.com/problems/reorder-list/)
- [ ] [Circular Array Loop](https://leetcode.com/problems/circular-array-loop/)

## 3. Pattern: Sliding Window
> **Trigger:** Longest/Shortest subarray/substring with a specific constraint (Sum, Distinct chars).

- [ ] [Max Sum Subarray of Size K (GFG)](https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1)
- [ ] [Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/)
- [ ] [Longest Substring with K Distinct Characters (GFG)](https://www.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1)
- [ ] [Fruit Into Baskets](https://leetcode.com/problems/fruit-into-baskets/)
- [ ] [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
- [ ] [Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement/)
- [ ] [Max Consecutive Ones III](https://leetcode.com/problems/max-consecutive-ones-iii/)
- [ ] [Permutation in String](https://leetcode.com/problems/permutation-in-string/)
- [ ] [Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/)
- [ ] [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/)
- [ ] [Substring with Concatenation of All Words](https://leetcode.com/problems/substring-with-concatenation-of-all-words/)

## 4. Pattern: Kadane’s Algorithm
> **Trigger:** Max/Min subarray sum, often involves negative numbers.

- [ ] [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)
- [ ] [Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray/)
- [ ] [Maximum Subarray Sum with One Deletion](https://leetcode.com/problems/maximum-subarray-sum-with-one-deletion/)
- [ ] [Maximum Absolute Sum of Any Subarray](https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray/)
- [ ] [Maximum Sum Circular Subarray](https://leetcode.com/problems/maximum-sum-circular-subarray/)

## 5. Pattern: Prefix Sum
> **Trigger:** Subarray sum equals K, range sum queries.

- [ ] [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/)
- [ ] [Find Pivot Index](https://leetcode.com/problems/find-pivot-index/)
- [ ] [Subarray Sums Divisible by K](https://leetcode.com/problems/subarray-sums-divisible-by-k/)
- [ ] [Contiguous Array](https://leetcode.com/problems/contiguous-array/)
- [ ] [Shortest Subarray with Sum at Least K](https://leetcode.com/problems/shortest-subarray-with-sum-at-least-k/)

## 6. Pattern: Merge Intervals
> **Trigger:** Overlapping events, meetings, time ranges.

- [ ] [Merge Intervals](https://leetcode.com/problems/merge-intervals/)
- [ ] [Insert Interval](https://leetcode.com/problems/insert-interval/)
- [ ] [Interval List Intersections](https://leetcode.com/problems/interval-list-intersections/)
- [ ] [Employee Free Time (LintCode/Premium)](https://www.codertrain.co/employee-free-time)

## 7. Pattern: Cyclic Sort
> **Trigger:** Arrays containing numbers in a range (1 to N).

- [ ] [Missing Number](https://leetcode.com/problems/missing-number/)
- [ ] [Find All Numbers Disappeared in an Array](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/)
- [ ] [Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/)
- [ ] [Find All Duplicates in an Array](https://leetcode.com/problems/find-all-duplicates-in-an-array/)
- [ ] [First Missing Positive](https://leetcode.com/problems/first-missing-positive/)

## 8. Pattern: In-Place Reversal of LinkedList
> **Trigger:** Reverse specific parts of a linked list (K-groups, sub-lists).

- [ ] [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)
- [ ] [Reverse Linked List II](https://leetcode.com/problems/reverse-linked-list-ii/)
- [ ] [Reverse Nodes in k-Group](https://leetcode.com/problems/reverse-nodes-in-k-group/)
- [ ] [Rotate List](https://leetcode.com/problems/rotate-list/)

## 9. Pattern: Monotonic Stack
> **Trigger:** Next greater element, histogram areas, parentheses.

- [ ] [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)
- [ ] [Remove All Adjacent Duplicates in String](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/)
- [ ] [Next Greater Element II](https://leetcode.com/problems/next-greater-element-ii/)
- [ ] [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/)
- [ ] [Remove K Digits](https://leetcode.com/problems/remove-k-digits/)
- [ ] [Simplify Path](https://leetcode.com/problems/simplify-path/)

## 10. Pattern: Hash Maps
> **Trigger:** Frequency counting, finding uniqueness.

- [ ] [First Unique Character in a String](https://leetcode.com/problems/first-unique-character-in-a-string/)
- [ ] [Largest Unique Number](https://leetcode.com/problems/largest-unique-number/)
- [ ] [Maximum Number of Balloons](https://leetcode.com/problems/maximum-number-of-balloons/)
- [ ] [Longest Palindrome](https://leetcode.com/problems/longest-palindrome/)
- [ ] [Ransom Note](https://leetcode.com/problems/ransom-note/)

## 11. Pattern: Tree BFS (Level Order)
> **Trigger:** Level-by-level processing, shortest path in unweighted graphs/trees.

- [ ] [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/)
- [ ] [Binary Tree Level Order Traversal II](https://leetcode.com/problems/binary-tree-level-order-traversal-ii/)
- [ ] [Binary Tree Zigzag Level Order Traversal](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)
- [ ] [Average of Levels in Binary Tree](https://leetcode.com/problems/average-of-levels-in-binary-tree/)
- [ ] [Minimum Depth of Binary Tree](https://leetcode.com/problems/minimum-depth-of-binary-tree/)
- [ ] [Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/)

## 12. Pattern: Tree DFS
> **Trigger:** Path finding, validating BST, diameter, max depth.

- [ ] [Path Sum](https://leetcode.com/problems/path-sum/)
- [ ] [Path Sum III](https://leetcode.com/problems/path-sum-iii/)
- [ ] [Sum Root to Leaf Numbers](https://leetcode.com/problems/sum-root-to-leaf-numbers/)
- [ ] [Diameter of Binary Tree](https://leetcode.com/problems/diameter-of-binary-tree/)
- [ ] [Binary Tree Maximum Path Sum](https://leetcode.com/problems/binary-tree-maximum-path-sum/)

## 13. Pattern: Graph Traversal (BFS/DFS)
> **Trigger:** Connectivity, finding paths, islands.

- [ ] [Find if Path Exists in Graph](https://leetcode.com/problems/find-if-path-exists-in-graph/)
- [ ] [Number of Provinces](https://leetcode.com/problems/number-of-provinces/)
- [ ] [Minimum Number of Vertices to Reach All Nodes](https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/)

## 14. Pattern: Matrix Traversal (Islands)
> **Trigger:** Grid problems, flood fill.

- [ ] [Number of Islands](https://leetcode.com/problems/number-of-islands/)
- [ ] [Flood Fill](https://leetcode.com/problems/flood-fill/)
- [ ] [Number of Closed Islands](https://leetcode.com/problems/number-of-closed-islands/)

## 15. Pattern: Two Heaps
> **Trigger:** Median of data stream, scheduling with constraints.

- [ ] [Find Median from Data Stream](https://leetcode.com/problems/find-median-from-data-stream/)
- [ ] [Sliding Window Median](https://leetcode.com/problems/sliding-window-median/)
- [ ] [IPO](https://leetcode.com/problems/ipo/)

## 16. Pattern: Subsets (Backtracking/BFS)
> **Trigger:** Combinations, Permutations, Power Set.

- [ ] [Subsets](https://leetcode.com/problems/subsets/)
- [ ] [Subsets II](https://leetcode.com/problems/subsets-ii/)
- [ ] [Permutations](https://leetcode.com/problems/permutations/)
- [ ] [Letter Case Permutation](https://leetcode.com/problems/letter-case-permutation/)
- [ ] [Generalized Abbreviation](https://leetcode.com/problems/generalized-abbreviation/)

## 17. Pattern: Modified Binary Search
> **Trigger:** Sorted or Rotated arrays, search space reduction.

- [ ] [Binary Search](https://leetcode.com/problems/binary-search/)
- [ ] [Find Smallest Letter Greater Than Target](https://leetcode.com/problems/find-smallest-letter-greater-than-target/)
- [ ] [Find First and Last Position of Element](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)
- [ ] [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/)
- [ ] [Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/)
- [ ] [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/)
- [ ] [Capacity To Ship Packages Within D Days](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/)
- [ ] [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/)

## 18. Pattern: Bitwise XOR
> **Trigger:** Single number, flipping bits.

- [ ] [Single Number](https://leetcode.com/problems/single-number/)
- [ ] [Complement of Base 10 Integer](https://leetcode.com/problems/complement-of-base-10-integer/)
- [ ] [Flipping an Image](https://leetcode.com/problems/flipping-an-image/)

## 19. Pattern: Top 'K' Elements (Heaps)
> **Trigger:** "Top K", "Smallest K", "Most Frequent".

- [ ] [Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/)
- [ ] [K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin/)
- [ ] [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/)
- [ ] [Sort Characters By Frequency](https://leetcode.com/problems/sort-characters-by-frequency/)
- [ ] [Kth Largest Element in a Stream](https://leetcode.com/problems/kth-largest-element-in-a-stream/)
- [ ] [Task Scheduler](https://leetcode.com/problems/task-scheduler/)
- [ ] [Reorganize String](https://leetcode.com/problems/reorganize-string/)

## 20. Pattern: K-Way Merge
> **Trigger:** Merging multiple sorted lists/arrays.

- [ ] [Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/)
- [ ] [Smallest Range Covering Elements from K Lists](https://leetcode.com/problems/smallest-range-covering-elements-from-k-lists/)

## 21. Pattern: Greedy
> **Trigger:** Local optimal choice leads to global optimum.

- [ ] [Valid Palindrome II](https://leetcode.com/problems/valid-palindrome-ii/)
- [ ] [Maximum Length of Pair Chain](https://leetcode.com/problems/maximum-length-of-pair-chain/)
- [ ] [Minimum Add to Make Parentheses Valid](https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/)
- [ ] [Remove Duplicate Letters](https://leetcode.com/problems/remove-duplicate-letters/)

## 22. Pattern: 0/1 Knapsack (DP)
> **Trigger:** Select elements to reach target sum/value with capacity constraint.

- [ ] [Partition Equal Subset Sum](https://leetcode.com/problems/partition-equal-subset-sum/)
- [ ] [Target Sum](https://leetcode.com/problems/target-sum/)

## 23. Pattern: Advanced Backtracking
> **Trigger:** Hard constraints, Sudoku, N-Queens.

- [ ] [Combination Sum](https://leetcode.com/problems/combination-sum/)
- [ ] [Word Search](https://leetcode.com/problems/word-search/)
- [ ] [Sudoku Solver](https://leetcode.com/problems/sudoku-solver/)
- [ ] [Split a String Into the Max Number of Unique Substrings](https://leetcode.com/problems/split-a-string-into-the-max-number-of-unique-substrings/)

## 24. Pattern: Trie
> **Trigger:** Prefix search, auto-complete, word dictionary.

- [ ] [Implement Trie (Prefix Tree)](https://leetcode.com/problems/implement-trie-prefix-tree/)
- [ ] [Design Add and Search Words Data Structure](https://leetcode.com/problems/design-add-and-search-words-data-structure/)
- [ ] [Search Suggestions System](https://leetcode.com/problems/search-suggestions-system/)

## 25. Pattern: Topological Sort
> **Trigger:** Dependencies, task scheduling, prerequisites.

- [ ] [Course Schedule](https://leetcode.com/problems/course-schedule/)
- [ ] [Course Schedule II](https://leetcode.com/problems/course-schedule-ii/)
- [ ] [Alien Dictionary (LeetCode Premium / GFG Equivalent)](https://www.geeksforgeeks.org/given-sorted-dictionary-find-precedence-characters/)
- [ ] [Minimum Height Trees](https://leetcode.com/problems/minimum-height-trees/)

## 26. Pattern: Union Find
> **Trigger:** Network connectivity, grouping, redundant connections.

- [ ] [Redundant Connection](https://leetcode.com/problems/redundant-connection/)
- [ ] [Number of Provinces](https://leetcode.com/problems/number-of-provinces/)
- [ ] [Is Graph Bipartite?](https://leetcode.com/problems/is-graph-bipartite/)
- [ ] [Path With Minimum Effort](https://leetcode.com/problems/path-with-minimum-effort/)

## 27. Pattern: Ordered Set
> **Trigger:** Time ranges, calendar booking (TreeMap in Java).

- [ ] [My Calendar I](https://leetcode.com/problems/my-calendar-i/)