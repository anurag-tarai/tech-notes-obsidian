### 🔹 **Definition**

Amazon S3 is an **object storage service** that lets you store and retrieve **any amount of data** from anywhere on the web.  
It’s designed for **scalability, durability (99.999999999%)**, and **availability**.

---

### 🧱 **Core Concepts**

|Term|Description|Example|
|---|---|---|
|**Bucket**|Top-level container for objects in S3. Each bucket has a unique name globally.|`myapp-images-store`|
|**Object**|Actual file/data stored inside a bucket, with metadata and key (file name).|`photo1.jpg`, `resume.pdf`|
|**Key**|Unique identifier for each object inside a bucket (like a path).|`images/profile1.png`|
|**Region**|Physical AWS region where the bucket is created.|`ap-south-1 (Mumbai)`|
|**Metadata**|Additional info about the object (e.g., content type, last modified).|`Content-Type: image/jpeg`|

---

### ⚙️ **Main Features**

|Feature|Description|
|---|---|
|**Scalable Storage**|Automatically scales to store any volume of data.|
|**High Durability & Availability**|99.999999999% durability across multiple AZs.|
|**Access Control**|Managed through IAM policies, bucket policies, and ACLs.|
|**Versioning**|Keeps multiple versions of an object for recovery or rollback.|
|**Lifecycle Management**|Automatically move data to cheaper storage tiers (Glacier).|
|**Static Website Hosting**|Host static sites directly from S3 bucket.|
|**Encryption**|Supports server-side (SSE-S3, SSE-KMS) and client-side encryption.|
|**Event Notifications**|Trigger Lambda, SNS, or SQS on object events (upload/delete).|

---

### 💰 **Storage Classes**

|Class|Use Case|Cost|
|---|---|---|
|**S3 Standard**|Frequently accessed data|💰 Normal|
|**S3 Intelligent-Tiering**|Unknown/variable access patterns|💰 Auto-optimized|
|**S3 Standard-IA (Infrequent Access)**|Data accessed less often|💸 Cheaper|
|**S3 One Zone-IA**|Non-critical infrequent data|💸💸 Cheaper|
|**S3 Glacier / Deep Archive**|Archival data, long-term backup|💸💸💸 Lowest|

---

### 🧾 **Free Tier**

- **5 GB Standard storage**
    
- **20,000 GET** and **2,000 PUT** requests/month
    
- **15 GB outbound data transfer** per month  
    _(Valid for first 12 months)_
    

---

### 🔐 **Security**

- IAM policies → control who can access S3.
    
- Bucket policies → control public/private access.
    
- Enable **Block Public Access** by default.
    
- Use **SSE-KMS** for sensitive data encryption.
    

---

### 💡 **Common Use Cases**

- Static website hosting
    
- Storing app images, backups, or logs
    
- Data lake / analytics storage
    
- Media or document repository