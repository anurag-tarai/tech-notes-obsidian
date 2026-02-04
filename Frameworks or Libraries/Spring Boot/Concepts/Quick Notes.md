- **`@Column`**: customize column name, length, nullable, unique
    
- **`@Temporal`**: for date/time fields
    
- **`fetch = FetchType.LAZY`**: delay loading related entities (default for `@OneToMany`)
    
- **`cascade = CascadeType.ALL`**: propagate operations like save/delete