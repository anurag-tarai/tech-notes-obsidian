IAM helps **securely control access** to AWS services and resources.

---
#### 👤 **IAM Users**

- Individual **identities** created for people or applications that need to access AWS.
- Have **permanent credentials** (username, password, access keys).
- Example: `developer1`, `admin_user`.

---

#### 👥 **IAM Groups**

- A **collection of IAM users**.
- Used to **assign permissions to multiple users at once** via policies.
- Example: `Developers`, `Admins`, `BillingTeam`.

---
#### 🎭 **IAM Roles**

- **Temporary access** identity used by AWS services, users, or external entities.
- Roles have **no long-term credentials**; instead, they issue **temporary security tokens**.
- Example:
    - EC2 instance assuming a role to access S3.
    - A cross-account role allowing another AWS account access.
