### **Problem Description**

You are given a tree with **N** nodes rooted at **node 1**. Each node has an integer value `value[i]`.

A **lucky path** is defined as a path from the root (node 1) to any **leaf** such that the **sum of all node values on that path is divisible by K**.

Your task is to find the **total number of lucky paths** in the tree.

---

### **Key Definitions & Notes**

- **Tree:** A connected acyclic graph with $N$ nodes and $N-1$ edges.
    
- **Leaf Node:** A node with no children (except for the root if it is the only node).
    
- **Lucky Path Condition:** $\sum (\text{node values on path}) \pmod K = 0$.
    

---

### **Input Format**

1. An integer **N**: The number of nodes.
    
2. An integer **K**: The divisor for the lucky path condition.
    
3. **N lines** for Edges: Each line contains two space-separated integers $u$ and $v$ denoting an edge between node $u$ and node $v$. (Note: The prompt mentions the edge (0,0) must be ignored).
    
4. **N lines** for Values: Each line contains an integer describing `Values[i]`.
    

---

### **Constraints**

- $1 \le N \le 10^5$
    
- $1 \le K \le 10^5$
    
- $1 \le Edges[i][j] \le 10^5$
    

---

### **Logic to Solve**

To solve this efficiently for $N = 10^5$, you should use a **Depth First Search (DFS)**:

1. **Build an Adjacency List** to represent the tree.
    
2. **Traverse from the root (node 1)**, keeping track of the "running sum" of node values from the root to the current node.
    
3. **Identify Leaf Nodes:** A leaf node is a node (other than the root) that has only one connection in the adjacency list.
    
4. **Check Condition:** When you reach a leaf node, check if `current_sum % K == 0`. If true, increment your lucky path counter.

----
## Solution
```java
import java.util.*;
import java.io.*;

public class LuckyPath {
    static List<List<Integer>> adj;
    static int[] values;
    static int K;
    static int luckyPaths = 0;

    public static void main(String[] args) throws IOException {
        // Using Fast Reader for N = 10^5
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String nLine = br.readLine();
        if (nLine == null) return;
        int N = Integer.parseInt(nLine.trim());
        
        String kLine = br.readLine();
        if (kLine == null) return;
        K = Integer.parseInt(kLine.trim());

        adj = new ArrayList<>(N + 1);
        for (int i = 0; i <= N; i++) adj.add(new ArrayList<>());

        // Reading Edges
        for (int i = 0; i < N; i++) {
            String[] edgeData = br.readLine().trim().split("\\s+");
            int u = Integer.parseInt(edgeData[0]);
            int v = Integer.parseInt(edgeData[1]);
            
            // Ignore edge (0,0) as per problem notes
            if (u != 0 || v != 0) {
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
        }

        // Reading Node Values
        values = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            values[i] = Integer.parseInt(br.readLine().trim());
        }

        // Start DFS from root (node 1)
        // Passing 0 as parent to avoid going backward
        dfs(1, 0, 0);

        System.out.println(luckyPaths);
    }

    private static void dfs(int u, int p, long currentSum) {
        currentSum += values[u];
        
        boolean isLeaf = true;
        for (int v : adj.get(u)) {
            if (v != p) {
                isLeaf = false;
                dfs(v, u, currentSum);
            }
        }

        // Check condition if it's a leaf
        // Note: For a rooted tree at 1, node 1 is a leaf only if it has no children
        if (isLeaf) {
            if (currentSum % K == 0) {
                luckyPaths++;
            }
        }
    }
}
```