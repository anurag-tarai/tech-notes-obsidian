### ⚙️ **2. If you go with EC2 + MySQL:**

#### Step 1: Launch EC2
- Use an **Ubuntu** or **Amazon Linux** instance.
- Choose instance type (e.g., `t3.micro` for testing).
- Ensure you **allow inbound MySQL traffic (port 3306)** in the **Security Group**.
#### Step 2: Install MySQL
For Ubuntu:
```bash
sudo apt update
sudo apt install mysql-server -y
sudo systemctl enable mysql
sudo systemctl start mysql
```
#### Step 3: Secure MySQL

`sudo mysql_secure_installation`

→ Set root password, remove test DB, disallow remote root login, etc.
#### Step 4: Allow remote access (optional)

Edit config file:

`sudo nano /etc/mysql/mysql.conf.d/mysqld.cnf`

Change:

`bind-address = 0.0.0.0`

Then restart:

`sudo systemctl restart mysql`

#### Step 5: Create a user for remote access

```bash
CREATE USER 'youruser'@'%' IDENTIFIED BY 'yourpassword';
GRANT ALL PRIVILEGES ON *.* TO 'youruser'@'%' WITH GRANT OPTION;
FLUSH PRIVILEGES;
```

---

### 🌐 **6. Connect to it**

- From your local machine:
    
    `mysql -h <EC2-public-IP> -u youruser -p`
    
- Make sure your **EC2 Security Group** allows **inbound port 3306** from your IP or VPC.

## Migrate From RDS To EC2
