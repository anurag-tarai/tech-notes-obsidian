If your backend is running on **EC2**, do this instead of opening RDS to the public:

1. Set **RDS as private** (Publicly accessible = No).
2. Place both **EC2 and RDS in the same VPC/subnet**.
3. Add the EC2 **security group ID** in RDS inbound rules:
    - Type: MYSQL/Aurora
    - Source: `sg-<your-ec2-sg-id>`
4. Then your EC2 instance can access RDS securely without exposing it to the internet.
## 🧠 Common Errors & Fixes

|Error|Cause|Fix|
|---|---|---|
|`Communications link failure`|Firewall or wrong IP in security group|Add correct IP or SG|
|`Unknown database`|DB name doesn’t exist|Create it manually|
|`Publicly accessible = No`|You’re connecting from outside AWS|Enable temporarily|
|`Access denied`|Wrong username/password|Recheck credentials|
|`Timeout`|VPC subnet/NACL issue|Verify RDS subnet routing and rules|

---

## 🔒 Best Practices for Production

✅ **Never use 0.0.0.0/0** — use EC2 SG instead  
✅ **Use AWS Secrets Manager** to store DB credentials  
✅ **Enable encryption** (at rest & in transit)  
✅ **Use Multi-AZ** for failover  
✅ **Enable automatic backups and monitoring**