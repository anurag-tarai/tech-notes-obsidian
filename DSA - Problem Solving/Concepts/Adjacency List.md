### Idea
- For each node, store a **list of its neighbors**
- Space efficient

### Space Complexity
- `O(V+E)​`
- **V** → one list for each vertex
- **E** → total edges stored in lists
An **adjacency list** stores: 
1. **One list for each vertex** → takes **O(V)** space
2. **One entry per edge** (twice for undirected graphs) → takes **O(E)** space
## Undirected Graph (Unweighted) :
if 1 based indexing, we have create n+1 sub arraylist 
```java
int V = 5; // number of vertices

ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

// initialize
for (int i = 0; i < V; i++) {
    graph.add(new ArrayList<>());
}

// add edges
graph.get(0).add(1);
graph.get(1).add(0);

graph.get(0).add(2);
graph.get(2).add(0);

// Meaning
0 → 1, 2
1 → 0
2 → 0
```

## Directed Graph
```java
graph.get(0).add(1); // 0 → 1
graph.get(1).add(2); // 1 → 2
```

![](Screenshot%20from%202026-01-09%2017-23-13.png)