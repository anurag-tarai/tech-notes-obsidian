![](Screenshot%20from%202026-01-09%2017-08-59.png)

### Idea
- 2D array
- `matrix[i][j] = 1` → edge exists
### Unweighted Graph
```java
int[][] graph = new int[V][V];

graph[0][1] = 1;
graph[1][0] = 1; // undirected
```

### Weighted Graph
```java
int[][] graph = new int[V][V];

graph[0][1] = 5;
graph[1][0] = 5;
```
## ❌ Drawback
- Uses **O(V²)** space
- Avoid for large graphs