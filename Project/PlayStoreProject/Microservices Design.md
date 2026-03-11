To meet the rubric's requirements for Spring Cloud, Eureka, and inter-service communication (Feign Client/RestTemplate), the backend should be structured with the following services:

- **Service Registry (Eureka Server):** Acts as a phonebook for your microservices. All other services will register here so they can discover and communicate with each other dynamically.
    
- **API Gateway (Optional but recommended):** Routes frontend requests to the appropriate microservices and validates the JWT token at the entry point.
    
- **Auth Service (`auth-service`):** * **Responsibilities:** User and Owner registration, login, profile management, and JWT generation/validation.
    
    - **Security:** Implements Spring Security to issue JWTs upon successful login.
        
- **Application Service (`app-service`):**
    
    - **Responsibilities:** Application CRUD operations for Owners, category management, search, filtering, and visibility control.
        
    - **Communication:** Exposes endpoints for the Review Service to fetch application details or update average ratings.
        
- **Review & Download Service (`interaction-service`):**
    
    - **Responsibilities:** Tracking user downloads, managing user reviews/comments, and handling notification generation.
        
    - **Communication:** Uses **Feign Client** to verify a user's identity with the Auth Service and to verify an application's existence with the Application Service before allowing a download or review.
        

**Common Components across Microservices:**

- **DTOs (Data Transfer Objects):** Used to transfer data between the frontend and backend, and between microservices, ensuring internal entities are not exposed.
    
- **Global Exception Handling:** A `@ControllerAdvice` class in each service to catch exceptions (e.g., `ResourceNotFoundException`, `UnauthorizedException`) and return standardized error responses.