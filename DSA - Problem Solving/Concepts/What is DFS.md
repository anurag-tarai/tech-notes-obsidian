## Depth-First Search
**DFS (Depth-First Search)** is a **graph traversal algorithm**. It explores a graph **as far as possible along a branch before backtracking**.

Think of it like exploring a maze: you go **deep into one path until you can’t go further**, then backtrack to the last junction to try another path.

![](Screenshot%20from%202026-01-10%2010-31-01.png)
Example : 
```java
     1
    / \
   2   3
  / \
 4   5
```
- Start at node `1`.
- DFS will go **deep first**:
    - `1 → 2 → 4` (can't go further, backtrack)
    - `2 → 5` (backtrack)
    - `1 → 3` (done)
**DFS Order:** `1, 2, 4, 5, 3` (depending on how neighbors are visited)