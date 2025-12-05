### 🔹 **Definition**

A **bucket policy** is a **resource-based JSON policy** that defines who (users, accounts, or services) can access your S3 bucket **and what actions they can perform**.

Think of it as **a firewall for your S3 bucket** — it controls access at the bucket level, not per object.

---

### ⚙️ **Structure of a Bucket Policy**

A bucket policy is written in **JSON** format with these key elements:

```json
{
  "Version": "2012-10-17",
  "Statement": [
    {
      "Sid": "AllowPublicRead",
      "Effect": "Allow",
      "Principal": "*",
      "Action": "s3:GetObject",
      "Resource": "arn:aws:s3:::my-bucket-name/*"
    }
  ]
}

```

|Field|Description|
|---|---|
|**Version**|Policy language version (`2012-10-17` is latest)|
|**Statement**|Array of permissions|
|**Sid**|Optional statement ID|
|**Effect**|Allow or Deny|
|**Principal**|Specifies _who_ can access (e.g., `"*"` for public, or specific AWS user/role)|
|**Action**|Specifies _what_ actions (e.g., `s3:GetObject`, `s3:PutObject`)|
|**Resource**|ARN of bucket or object (`arn:aws:s3:::bucket-name/*`)|

---

### 🔐 **Common Use Cases**

|Use Case|Example Policy|Notes|
|---|---|---|
|**Public read (static website)**|`s3:GetObject` for `"Principal": "*"`|Make sure “Block public access” is **off**|
|**Private access for one IAM user**|Principal set to specific IAM ARN|Secure setup for app integration|
|**Cross-account access**|Principal includes another AWS account ID|For partner or shared projects|
|**CloudFront origin access**|Principal = CloudFront OAI/OAC|Secure static site delivery|

---

### ⚠️ **Important Best Practices**

1. **Avoid public access** unless needed (e.g., static website).
    
2. Enable **Block Public Access** to prevent accidental exposure.
    
3. Use **IAM roles** for EC2 or Lambda instead of embedding access keys.
    
4. Test with AWS Policy Simulator before applying.
    
5. Keep **least privilege** — grant only the actions needed.
    

---

### 🧾 **Example: Allow EC2 Role to Upload Files**

```json
{
  "Version": "2012-10-17",
  "Statement": [
    {
      "Sid": "EC2AppUploadAccess",
      "Effect": "Allow",
      "Principal": {
        "AWS": "arn:aws:iam::123456789012:role/EC2AppRole"
      },
      "Action": ["s3:PutObject"],
      "Resource": "arn:aws:s3:::my-app-bucket/*"
    }
  ]
}
```