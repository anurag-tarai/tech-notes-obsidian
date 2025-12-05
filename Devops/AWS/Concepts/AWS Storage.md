AWS provides **multiple types of storage**, each built for specific use cases — from storing OS files to huge datasets or static websites.

| Type                       | Service                                | What It Stores                                  | Key Features                                | Example Use                        |
| -------------------------- | -------------------------------------- | ----------------------------------------------- | ------------------------------------------- | ---------------------------------- |
| 🖥️ **Block Storage**      | **Amazon EBS (Elastic Block Store)**   | OS files, app data, databases (attached to EC2) | Acts like a hard disk for your EC2 instance | Root volume for EC2, MySQL data    |
| 🗄️ **Object Storage**     | **Amazon S3 (Simple Storage Service)** | Any files (images, videos, PDFs, static assets) | Infinitely scalable, pay-as-you-go          | Store app images, backups, logs    |
| 📂 **File Storage**        | **Amazon EFS (Elastic File System)**   | Shared file system accessible by multiple EC2s  | Auto-scaling, NFS protocol                  | Microservices sharing same files   |
| 💾 **Archive Storage**     | **Amazon S3 Glacier / Deep Archive**   | Old or rarely used data                         | Very low cost, retrieval takes hours        | Long-term backups, compliance data |
| 🧰 **Hybrid/Edge Storage** | **AWS Storage Gateway**                | Connects on-premise and AWS                     | Hybrid cloud storage                        | Backup local data to AWS           |
