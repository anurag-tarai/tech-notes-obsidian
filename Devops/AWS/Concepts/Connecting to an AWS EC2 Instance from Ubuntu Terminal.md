### Steps -->

1. **Download the key pair (.pem)** from AWS when creating your EC2 instance.  
    Example: `my-ec2-key.pem`
    
2. **Set correct file permissions:**
    
    `chmod 400 ~/path/to/my-ec2-key.pem`
    
    > Ensures the private key is secure and readable only by you.
    
3. **Find your EC2 Public IPv4 address**  
    → Check it in the AWS Console under **EC2 → Instances → Public IPv4 address**.
    
4. **Connect via SSH:**
    
    `ssh -i ~/path/to/my-ec2-key.pem ubuntu@<EC2_PUBLIC_IP>`
    
    - Default username for Ubuntu AMI → `ubuntu`
        
    - Example:
        
        `ssh -i ~/.ssh/my-ec2-key.pem ubuntu@13.234.119.235`
        
5. **Accept the fingerprint (first time only):**  
    Type `yes` when prompted to trust the host.
    
6. **You’re now inside your EC2 instance!**
    

---

✅ **Summary Table**

|Step|Command / Action|Purpose|
|---|---|---|
|1|`chmod 400 my-ec2-key.pem`|Secure the private key|
|2|`ssh -i my-ec2-key.pem ubuntu@<IP>`|Connect to EC2|
|3|`exit`|Logout from instance|