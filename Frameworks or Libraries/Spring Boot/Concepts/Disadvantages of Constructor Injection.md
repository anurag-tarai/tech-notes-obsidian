- Can lead to **large constructors** when a class has many dependencies.
    
- **Not suitable for [Optional Dependencies](Optional%20Dependencies.md)**. 
    
- **Cannot resolve [Circular Dependency](Circular%20Dependency.md)** (fails at startup).
    
- **Dependencies cannot be changed** after object creation (less flexibility).
