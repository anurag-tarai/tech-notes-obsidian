A doubly linked list, but circular.

```q
        ⇄
[data] ⇄ [data] ⇄ [data]
  ↑                     ↓
  └─────────────────────┘
```
### Features
- Traverse in loop (forward & backward)
- No null at ends
- Good for systems that need circular backward/forward navigation
### When to use
- Advanced use cases like:
    - Browser history loop
    - Undo/redo buffers
    - Circular task switching