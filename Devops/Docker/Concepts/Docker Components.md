## Docker Containers
 > Containers are isolated environments where applications actually run.
 
 A **Docker container** is a **lightweight, runnable package** that contains:
- the application
- its dependencies
- libraries
- configuration

---
## Docker Engine (Most Important)

> Docker Engine is responsible for building, running, and managing containers.
### It consists of:
- **Docker Daemon (`dockerd`)**
    - Runs in background
    - Manages images, containers, networks, volumes
        
- **Docker CLI (`docker`)**
    - Command-line tool
    - Used by users to interact with Docker
        
- **REST API**
    - CLI talks to daemon using API
---
## Docker Image
A **Docker image** is a **read-only template** that contains:

- your application code
- libraries and dependencies
- configuration files
- instructions on how to run the app

> It’s like a **blueprint** for creating Docker containers.

- Dockerfile is used to create Docker Image
- Using Docker Image we can run multiple containers
---
## Docker Registry (Generic Term)

**Definition:**

> A **Docker Registry** is a service that stores Docker images and allows you to **push, pull, and manage images**.
### Key Points:
- It can be **public or private**
- Used to **share images** within teams or across the internet
    
- Examples:
    - Docker Hub (public)
    - AWS ECR (private, cloud)
    - Google Artifact Registry
    - Self-hosted private registry

> Think of it like a “library for Docker images.”
---
## Docker Hub
**Docker Hub** is a **cloud-based repository** where you can **store, share, and distribute Docker images**.

Think of it as **GitHub for Docker images**.
### Key points

- **Public and private repositories** → you can share images with the world or keep them private
- **Official images** → pre-built images for popular apps like MySQL, Ubuntu, Nginx
- **Pull & push images** → download images (`docker pull`) or upload your own (`docker push`)
- Makes it easy to **deploy the same image anywhere**
---
## 6️⃣ Supporting Components (Good to Mention)

### 🔗 Docker Network

- Enables container-to-container communication
    
- Types:
    - Bridge
    - Host
    - Overlay

---
### 💾 Docker Volume
- Used for persistent storage
- Data survives container restart