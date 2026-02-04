`mappedBy` is used **on the inverse (non-owning) side** of a bidirectional relationship to tell JPA:

> “This relationship is **already mapped by the field on the other side**; don’t create a separate foreign key.”

- It **prevents JPA from creating an extra join table or extra foreign key column**.
    
- Essentially, it tells JPA: **“I am just a mirror of the owning side.”**