## Overall Project Structure
```java
playstore-microservices
│
├── eureka-server
│
├── auth-service
│
├── app-service
│
└── interaction-service
```
Each one runs **independently**.

## Eureka Server Structure
```java
eureka-server
│
├── src/main/java/com/playstore/eureka
│       │
│       └── EurekaServerApplication.java
│
└── src/main/resources
        │
        └── application.yml
```
Main class
```java
@EnableEurekaServer  
@SpringBootApplication
```
This is just the **service registry**.

## Auth Service Structure (Users + JWT)
```java
auth-service
│
├── controller
│      └── AuthController
│
├── service
│      └── UserService
│
├── repository
│      └── UserRepository
│
├── entity
│      └── User
│
├── dto
│      ├── LoginRequest
│      ├── RegisterRequest
│      └── AuthResponse
│
├── config
│      ├── SecurityConfig
│      └── JwtFilter
│
├── util
│      └── JwtUtil
│
├── exception
│      └── GlobalExceptionHandler
│
└── AuthServiceApplication
```

## App Service Structure (Applications)
```java
app-service
│
├── controller
│      ├── ApplicationController
│      └── CategoryController
│
├── service
│      ├── ApplicationService
│      └── CategoryService
│
├── repository
│      ├── ApplicationRepository
│      └── CategoryRepository
│
├── entity
│      ├── Application
│      └── Category
│
├── dto
│      ├── ApplicationRequest
│      └── ApplicationResponse
│
├── client
│      └── AuthClient
│
├── exception
│      └── GlobalExceptionHandler
│
└── AppServiceApplication
```

## Interaction Service Structure
Handles:
```java
Reviews
Downloads
Notifications
```

```java
interaction-service
│
├── controller
│      ├── ReviewController
│      ├── DownloadController
│      └── NotificationController
│
├── service
│      ├── ReviewService
│      ├── DownloadService
│      └── NotificationService
│
├── repository
│      ├── ReviewRepository
│      ├── DownloadRepository
│      └── NotificationRepository
│
├── entity
│      ├── Review
│      ├── ReviewId
│      ├── Download
│      └── Notification
│
├── dto
│      ├── ReviewRequest
│      └── DownloadRequest
│
├── client
│      ├── AppClient
│      └── AuthClient
│
├── exception
│      └── GlobalExceptionHandler
│
└── InteractionServiceApplication
```

## Standard Layer Flow
```java
Controller
   ↓
Service
   ↓
Repository
   ↓
Database
```

