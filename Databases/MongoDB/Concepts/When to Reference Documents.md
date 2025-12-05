Use references (`_id` linking to another document) when:
- Data is **large**
- Data is **updated frequently**
- Relationship is **many-to-many** or **1-to-many large**
- Child entity must be **reusable** or **shared**
- Documents need **independent access**

**Example (Good for referencing):**
`User → Orders`

```json
{
  "_id": 1,
  "name": "Anurag",
  "orders": [125, 126]   // order ids
}
```