### 1. **Full Binary Tree**
- Every node has **0 or 2 children**.
- No node has only one child.
```java
       1
     /   \
    2     3
   / \     
  4   5   
```
---
### 2. **Complete Binary Tree**
- All levels are **completely filled**, except possibly the **last level**.
- The last level is filled **from left to right**.
```java
       1
     /   \
    2     3
   / \   / 
  4   5 6   
```
---
### 3. **Perfect Binary Tree**
- All internal nodes have **2 children**.
- All leaf nodes are at the **same level**.
```java
       1
     /   \
    2     3
   / \   / \
  4   5 6   7
```
---
### 4. **Balanced Binary Tree**
- Height difference between left and right subtrees of **every node ≤ 1**.
- Examples: **AVL Tree**, **Red-Black Tree**.
---
### 5. **Degenerate (Skewed) Tree**
- Every parent has **only one child**.
- Can be **left-skewed** or **right-skewed**.
- Acts like a linked list in worst-case scenarios.

##### Left Skewed Tree :
```java
    1
   /
  2
 /
3
/
4
```
Each parent has only **one left child**.

##### Right Skewed Tree:
```java
1
 \
  2
   \
    3
     \
      4
```
Each parent has only **one right child**.