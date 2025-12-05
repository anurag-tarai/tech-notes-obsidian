Same as singly linked list, but **last node points back to the first node**.
```q
  Head
   ↓
[data] → [data] → [data]
   ↑               ↓
   └───────────────┘
```
### Features
- No `null` at end
- Continuous loop
- Good for **round-robin** scheduling, playlists, games
### When to use
- Repeating cycles (CPU scheduling, music player, carousel)