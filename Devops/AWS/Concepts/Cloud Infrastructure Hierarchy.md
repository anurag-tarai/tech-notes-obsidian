| Level                         | Name                                                                             | Description                                                                           | Example                             |
| ----------------------------- | -------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ----------------------------------- |
| 🌍 **Region**                 | A **geographical area** where the cloud provider operates                        | Represents a broad area; contains multiple AZs or Availability Domains                | `ap-south-1` (Mumbai, India)        |
| 🧩 **Availability Zone (AZ)** | A **physically separate data center or a group of data centers** within a region | Provides isolation in terms of power, network, and cooling; ensures high availability | `ap-south-1a`, `ap-south-1b`        |
| 🏢 **Data Center**            | A **physical building** housing servers, storage, and networking equipment       | The actual facility that runs cloud infrastructure                                    | Navi Mumbai facility, Pune facility |
AWS
```java
Region
 └── Availability Zone (AZ)
       └── Data Center(s)
```

OCI
```java
Region
 └── Availability Domain (AD)
       └── Fault Domain (FD)
             └── Data Center(s)
```