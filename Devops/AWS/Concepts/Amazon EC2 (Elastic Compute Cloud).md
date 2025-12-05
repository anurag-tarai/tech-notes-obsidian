### 🧩 **Definition**

**Amazon EC2** is a **virtual server** service in AWS that lets you run applications in the cloud.  
It provides **re-sizable compute capacity** — you can easily launch, stop, or scale virtual machines as needed.


Use cases : 
- Hosting App + APIs
- Batch Jobs, scheduled tasks, background workers
- Machine Learning
- Dev / Test env

---

## 🚀 **Key EC2 Concepts & Terms**

| Term                            | Description                                                                                              | Example / Notes                                     |
| ------------------------------- | -------------------------------------------------------------------------------------------------------- | --------------------------------------------------- |
| **Instance**                    | A **virtual machine (VM)** running in AWS.                                                               | Like a rented computer in the cloud.                |
| **AMI (Amazon Machine Image)**  | A **template** containing the OS, software, and configuration used to launch an EC2 instance.            | Ubuntu, Amazon Linux, Windows Server, etc.          |
| **Instance Type**               | Defines the **hardware configuration** (CPU, memory, storage, network).                                  | `t3.micro`, `m5.large`, etc.                        |
| **EBS (Elastic Block Store)**   | **Persistent storage volume** attached to an EC2 instance. Data remains even after instance stop/reboot. | Like a hard drive.                                  |
| **Instance Store**              | **Temporary storage** physically attached to the host machine. Data lost when instance stops.            | Use for caching, temporary files.                   |
| **Elastic IP**                  | A **static public IPv4 address** you can associate with an instance.                                     | Useful for consistent external access.              |
| **Security Group**              | A **virtual firewall** controlling inbound and outbound traffic for EC2 instances.                       | Example: Allow SSH (port 22) or HTTP (port 80).     |
| **Key Pair**                    | A combination of **public and private keys** used for SSH access to Linux instances.                     | `.pem` file for login.                              |
| **VPC (Virtual Private Cloud)** | The **isolated network** where your EC2 instances run.                                                   | Contains subnets, route tables, and security rules. |
| **Subnet**                      | A **segment** of a VPC where instances are placed. Can be public (Internet-facing) or private.           | Example: Public subnet for web servers.             |
| **Elastic Load Balancer (ELB)** | Distributes **incoming traffic** across multiple EC2 instances for high availability.                    | Used with Auto Scaling.                             |
| **Auto Scaling**                | Automatically **adds or removes instances** based on traffic or load.                                    | Ensures performance and cost efficiency.            |
| **Placement Group**             | Determines **how instances are placed** on hardware.                                                     | Types: Cluster, Spread, Partition.                  |
| **User Data**                   | Script that runs **automatically when instance starts** (for setup or automation).                       | Install packages or configure apps.                 |

---

## 💰 **EC2 Pricing Models**

|Model|Description|Use Case|
|---|---|---|
|**On-Demand**|Pay by the second/hour — no commitment.|Short-term or unpredictable workloads.|
|**Reserved Instances**|1–3 year commitment with discount.|Steady, predictable workloads.|
|**Spot Instances**|Use unused capacity at up to 90% discount.|Flexible or fault-tolerant workloads.|
|**Savings Plans**|Flexible pricing with commitment to spend.|Mix of instance families and regions.|

---

## 🛡️ **Security & Access**

- Controlled via **Security Groups**, **Network ACLs**, and **IAM roles**.
    
- Use **Key Pairs** for SSH (Linux) or RDP (Windows).
    
- Always keep ports limited to required IPs.
    

---

## 🧠 **Example Setup**

1. Choose **Region & AZ**
    
2. Select **AMI** (e.g., Amazon Linux 2)
    
3. Choose **Instance Type** (`t3.micro`)
    
4. Configure **Security Group** (allow SSH/HTTP)
    
5. Attach **EBS volume**
    
6. Connect using **Key Pair**
    
7. Deploy application
    

---

## ✅ **Summary**

> **EC2 = Scalable Virtual Server**  
> Flexible compute service with complete control over OS, storage, network, and security.