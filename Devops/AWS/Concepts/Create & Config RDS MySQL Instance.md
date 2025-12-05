## 🚀 Step 1. Create an RDS MySQL Instance

1. **Go to AWS Console → RDS → Create database**
2. Choose:
    - **Engine:** MySQL
    - **Templates:** Free tier (for testing)
3. **Settings:**
    - DB identifier: `database-1`
    - Master username: `admin`
    - Master password: `YourPassword123`
4. **Connectivity:**
    - Publicly accessible → **Yes** (for dev)
    - VPC → default
    - Security group → create or choose one
5. Launch and wait for “Available” status.
    

---

## 🌐 Step 2. Configure RDS Security Group

By default, RDS allows no external connection.  
You must **allow inbound traffic** on port `3306`.
1. Go to **EC2 → Security Groups**
2. Find the group attached to your RDS instance.
3. Edit **Inbound rules → Add rule**
    - Type: **MYSQL/Aurora**
    - Protocol: TCP
    - Port range: **3306**
    - Source:
        - For local testing → `0.0.0.0/0` _(temporary)_
            
        - For personal IP → `your.ip.address/32`
```bash
curl https://checkip.amazonaws.com
```