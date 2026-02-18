### Typical 3-Tier Backend Architecture

1. **Presentation Layer**
    
    - Frontend (React / Web / Mobile)
        
    - Communicates via REST APIs
        
2. **Application / Business Layer**
    
    - Spring Boot backend
        
    - Controllers, Services, Security (JWT), business logic
        
3. **Data Layer**
    
    - MySQL (AWS RDS)
        
    - S3 (media storage)
        
    - Redis (caching)