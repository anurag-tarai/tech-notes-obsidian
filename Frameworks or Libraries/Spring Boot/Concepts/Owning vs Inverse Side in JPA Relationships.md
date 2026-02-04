In JPA, for **bidirectional relationships** (e.g., `OneToMany` ↔ `ManyToOne`):

- **Owning side** → The side that **actually owns the foreign key** in the database.    
    - This side **controls the relationship** (insert/update).
    - Defined **without `mappedBy`**.
        
- **Inverse (non-owning) side** → The side that **does not have the foreign key**.
    - Uses `mappedBy` to **point to the owning side**.
    - JPA ignores changes made on this side **unless synced with owning side**.

> ⚠️ Important: **Owning side can be parent or child depending on mapping**, it’s **not always the parent**. It’s about **where the foreign key is stored**.