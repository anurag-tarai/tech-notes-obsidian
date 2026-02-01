
## 1️⃣ Overview

> **Docker follows a client–server architecture** where the Docker Client communicates with the Docker Daemon, which builds, runs, and manages containers.

---
## 2️⃣ High-Level Architecture Components

Docker architecture consists of:
1. **Docker Client**
2. **Docker Daemon (dockerd)**
3. **Docker Host**
4. **Docker Registry**

---
## 3️⃣ Docker Client
> The Docker Client is the interface through which users interact with Docker.
### Key points
- Uses CLI commands like:
    - `docker run`
        
    - `docker build`
        
    - `docker pull`
        
- Sends requests to Docker Daemon using **REST API**
    
- Can be:
    - Local
    - Remote

---
## 4️⃣ Docker Daemon (dockerd)

> Docker Daemon is a background service that manages Docker objects.
### Responsibilities
- Builds images
- Creates & runs containers
- Manages:
    - Images
    - Containers
    - Networks
    - Volumes

### Key points
- Runs on Docker Host
- Listens for API requests from Docker Client

---
## 5️⃣ Docker Host

> Docker Host is the machine where Docker Engine is installed and containers run.
### Contains
- Docker Daemon
- Images
- Containers
- Networks
- Volumes

---
## 6️⃣ Docker Registry

> A Docker Registry is a storage system for Docker images.
### Types
- Public (Docker Hub)
- Private (AWS ECR, GCP, self-hosted)
### Used for
- Pulling images
- Pushing images

---

## 7️⃣ How Docker Architecture Works (Flow)

### Example: `docker run spring-app`

#### Step-by-step flow:

1. User runs command via **Docker Client**
    
2. Client sends request to **Docker Daemon**
    
3. Daemon checks if image exists locally
    
4. If not found → pulls image from **Docker Registry**
    
5. Daemon creates a **container** from the image
    
6. Container starts and application runs
    

---

## 8️⃣ Architecture Flow Diagram (Conceptual)

```java
User
 ↓
Docker Client (CLI)
 ↓ REST API
Docker Daemon (dockerd)
 ↓
Images → Containers
 ↓
Docker Host
 ↕
Docker Registry
```

---