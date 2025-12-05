Examples:
- Students ↔ Courses
- Users ↔ Roles
- Movies ↔ Actors
### Use referencing (standard way)

Collection: `students`

```json
{
  "_id": 1,
  "name": "Anurag",
  "courses": [101,102]
}
```

Collection: `courses`

```json
{
  "_id": 101,
  "title": "MongoDB",
  "students": [1,2,3]
}
```

MongoDB handles many-to-many with arrays of IDs.