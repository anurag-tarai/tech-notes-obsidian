The algorithm starts from a given source vertex and explores all vertices reachable from that source, visiting nodes in increasing order of their distance from the source, level by level using a queue. Since graphs may contain cycles, a vertex could be visited multiple times. To prevent revisiting a vertex, a visited array is used.

### Simple Idea
- Visit the **nearest nodes first**
- Then move to their neighbors
- Uses a **Queue (FIFO)**
### Example
```java
    1
   / \
  2   3
 / \
4   5
```
BFS traversal (from 1):
```java
1 → 2 → 3 → 4 → 5
```
### Steps of BFS
1. Start from a source node
2. Mark it as visited
3. Push it into a **queue**
4. While queue is not empty:
    - Remove front node
    - Visit its unvisited neighbors
    - Add them to the queue

```java
// BFS traversal using 1-based indexing
void bfs(int start, ArrayList<ArrayList<Integer>> graph, int V) {

    // visited array of size V+1 because nodes are from 1 to V
    boolean[] visited = new boolean[V + 1];

    // Queue for BFS (FIFO)
    Queue<Integer> q = new LinkedList<>();
    
    ArrayList<Integer> bfsOrder = new ArrayList<>();

    // Mark the starting node as visited
    visited[start] = true;

    // Add starting node to the queue
    q.add(start);

    // Continue BFS until queue becomes empty
    while (!q.isEmpty()) {

        // Remove the front element from the queue
        int node = q.poll();

		bfsOrder.add(node);
		
        // Process the current node
        System.out.print(node + " ");

        // Traverse all adjacent vertices of the current node
        for (int neighbor : graph.get(node)) {

            // If the neighbor is not visited
            if (!visited[neighbor]) {

                // Mark neighbor as visited
                visited[neighbor] = true;

                // Add neighbor to the queue
                q.add(neighbor);
            }
        }
    }
}
```

### Time Complexity

### **O(V + E)**

**Explanation:**

- Each **vertex (V)** is visited **once**
    
- Each **edge (E)** is checked **twice**  
    (once from each endpoint in an undirected graph)
    
- Constant factor `2E` is ignored in Big-O
    

✔ Final: **O(V + E)**

---

### Space Complexity

### **O(V)**

**Used by:**

- `visited[]` array → **O(V)**
    
- `Queue` → **O(V)** (worst case)
    
- `bfsList` → **O(V)**
    

✔ Final: **O(V)**  
(Graph storage `O(V + E)` not counted as extra space)