![](Screenshot%20from%202026-01-09%2017-37-22.png)
These four is can be part of single Graph.

A **connected component** is a **maximal set of vertices** such that  
👉 **every vertex in the set is reachable from every other vertex in the same set**.
#### Example
```java
A — B — C     D — E
```
Here:
- `{A, B, C}` → **1st connected component**
- `{D, E}` → **2nd connected component**
Total **connected components = 2**

### Visited Array
![](Screenshot%20from%202026-01-09%2017-43-31.png)
Traverse each component of array, mark the visited node.
If Graph have multiple components, we can't visit all nodes by traverse(1).