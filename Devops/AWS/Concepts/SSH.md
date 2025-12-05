**SSH** stands for **Secure Shell** — it’s a protocol (and a tool) used to **securely connect to and control remote servers or computers** over a network (like the internet).

### What SSH Does

- It lets you **log into another computer (like a server or VM)** securely.
- You can **run commands, transfer files, or manage applications** on that machine as if you were sitting in front of it.
- The connection is **encrypted**, meaning your password and data are protected from eavesdropping.

### 💻 Example Use Case

Let’s say you deployed your Spring Boot app on an AWS EC2 server.  
You can connect to it from your local machine using SSH:

`ssh ubuntu@ec2-3-110-45-200.ap-south-1.compute.amazonaws.com`

- `ssh` → command
    
- `ubuntu` → username (depends on your cloud image)
    
- `ec2-3-110-45-200...` → server’s public IP or domain
### 🔐 Authentication Methods

SSH can use:

1. **Password authentication** (you type a password).
    
2. **SSH keys (recommended)** — a private/public key pair that’s safer than passwords.
    

Example:

- You generate a key with `ssh-keygen`.
    
- Upload the **public key** to the server.
    
- Use the **private key** locally to connect securely without typing a password each time:
    

`ssh -i ~/.ssh/my-key.pem ubuntu@your-server-ip`

---

### 📦 Common SSH Tools

- On Linux/Mac → SSH is built-in.
    
- On Windows → You can use **PowerShell**, **Git Bash**, or tools like **PuTTY** or **Windows Terminal**.