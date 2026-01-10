## Recursive Approach
```java
// DFS function (recursive)
    public static void dfs(int node, ArrayList<ArrayList<Integer>> graph, boolean[] visited, List<Integer> traversal) {
        visited[node] = true;             // Mark current node as visited
        traversal.add(node);              // Add node to DFS traversal list

        for (Integer neighbor : graph.get(node)) {  // Explore all neighbors
            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited, traversal);  // Recursive DFS call
            }
        }
    }
```
How to call it:
```java
int V = 6;  // number of vertices (1-based indexing)

        // Initialize adjacency list
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges (undirected graph)
        graph.get(1).addAll(Arrays.asList(2, 3));
        graph.get(2).addAll(Arrays.asList(1, 4, 5));
        graph.get(3).addAll(Arrays.asList(1, 6));
        graph.get(4).add(2);
        graph.get(5).add(2);
        graph.get(6).add(3);

        // DFS traversal
        List<Integer> dfsTraversal = new ArrayList<>();
        boolean[] visited = new boolean[V + 1];  // boolean is cleaner than int

        dfs(1, graph, visited, dfsTraversal);

        // Print DFS traversal
        System.out.println("DFS Traversal: " + dfsTraversal);
    }
```

```java
     1
    / \
   2   3
  / \    \
 4   5    6
```

```java
BFS Traversal: [1, 2, 4, 5, 3, 6]
```

- **Time Complexity:**
    - `O(V + E)` → `V = number of vertices`, `E = number of edges`
        
- **Space Complexity:**
    - Recursive → `O(V)` (for call stack)
    - Iterative → `O(V)` (for stack)

