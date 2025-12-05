### 🔑 **What is the Root Account?**

- The **first account** created when you sign up for AWS.
    
- Has **unrestricted access** to all AWS resources and billing information.
    
- Should be **used only for initial setup and emergency tasks**, not daily operations.
    

---

### 🧱 **Why Hardening Is Needed**

Because the root account:

- Has **full administrative power** (can delete everything).
    
- Cannot be restricted using IAM policies.
    
- If compromised → **complete account takeover**.
    

---

### 🧰 **Best Practices for Root Account Hardening**

|🔒 Measure|📝 Description|
|---|---|
|**1. Enable MFA (Multi-Factor Authentication)**|Add a second layer of security using an authenticator app or hardware key.|
|**2. Use a Strong, Unique Password**|Long, complex, and not reused anywhere else.|
|**3. Never Share Root Credentials**|Root login should be restricted to 1–2 trusted admins only.|
|**4. Don’t Use Root for Daily Tasks**|Create **IAM admin users** for routine management.|
|**5. Lock Away Access Keys**|Avoid creating **access keys** for the root user; delete if already created.|
|**6. Enable Account-Level Notifications**|Use **AWS CloudTrail**, **CloudWatch**, and **AWS Config** to monitor changes.|
|**7. Secure Email Account**|The email linked to root should also have MFA and strong protection.|
|**8. Review Root Activity Regularly**|Check **CloudTrail logs** for any unexpected root usage.|

---

### ⚠️ **Root Account Should Only Be Used For**

- Enabling billing and support.
    
- Creating your **first IAM admin user**.
    
- Restoring access if the account is locked or compromised.
    

---

### ✅ **Summary**

> “Use the root account **only once** — to create an IAM admin, enable MFA, and then **lock it away safely**.”