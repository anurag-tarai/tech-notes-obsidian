Two types:

---
### Embedded (most common)
Use when the second object is _small_ and _not reused_.

Example:  
`User → Profile`

```json
{
  "name": "Anurag",
  "profile": {
    "bio": "Java Developer",
    "dob": "2001-11-23"
  }
}

```
---
### Referenced

Use when:
- Data is large (1000 lines text)
- Needs independent permission/access
- Used across multiple systems

Example:  
User → KYC Document (PDF, large text, images)

```json
GET /users/{id}          -> Don't need KYC
GET /kyc/{id}            -> Special access
```

```json
{ "_id": 1, "name": "Anurag", "kycId": 77 }
```

```json
{
  "_id": 77,
  "aadhar": "xxxx",
  "pan": "xxxx",
  "files": ["file1.pdf"]
}
```