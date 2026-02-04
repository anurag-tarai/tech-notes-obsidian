> When `orphanRemoval = true` is set on a parent’s collection, **any child entity removed from the collection is automatically deleted from the database**.


- **Cascade** → flows **any operation on parent → child**
    
    - Save parent → saves child
        
    - Delete parent → deletes child
        
- **OrphanRemoval** → only applies when child is **unlinked from parent**
    
    - Remove child from collection → deletes child
        
    - Parent still exists → deletion of child happens automatically

> `orphanRemoval = true` ensures that child entities that are no longer linked to their parent are automatically deleted from the database.