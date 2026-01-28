- Follows **FIFO**
- Used in scheduling, buffering.
### Implementations:

| Class         | Feature        |
| ------------- | -------------- |
| PriorityQueue | Priority-based |
| LinkedList    | FIFO queue     |
| ArrayDeque    | Faster deque   |


```java
Queue<Integer> q = new LinkedList<>();
q.offer(10);
q.poll();
```

### Deque (Double Ended Queue)
**Deque (Double Ended Queue)** is an interface in Java that allows **insertion and deletion from both ends** — front and rear.
```java
Deque<Integer> dq = new ArrayDeque<>();
dq.addFirst(10);
dq.addLast(20);
```