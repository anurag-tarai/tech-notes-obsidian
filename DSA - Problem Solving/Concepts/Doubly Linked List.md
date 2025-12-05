Each node has:
- `data`
- `prev` reference to the prev node
- `next` reference to the next node

```q
null ← [data] ⇄ [data] ⇄ [data] → null
```
### Features
- Can move **forward and backward**
- More memory (two pointers)
- Insert/delete at head or tail is **O(1)**
### When to use
- Need **bidirectional traversal** (back & forth)
- Removing a node when pointer to the node is given (O(1))