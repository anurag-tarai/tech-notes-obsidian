### Pros:
- Faster reads (single document)
- No need for joins / multiple queries
- Easy to maintain
### Cons:
- Document can grow too large (16MB limit)
- Hard to update individually (update nested fields)
- Duplication if same data used in many places