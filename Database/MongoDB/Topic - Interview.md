# **1. Core Fundamentals**

1. ~~What is MongoDB~~
    
2. ~~BSON vs JSON~~
    
3. ~~Document, Collection, Database~~
    
4. ~~Mongo Shell vs MongoDB Compass~~
    
5. ~~Understanding ObjectId (structure + timestamp)~~
    
6. ~~CRUD Basics~~
    
7. ~~`findOneAndUpdate()`, `findOneAndReplace()`, `findOneAndDelete()`~~

---

# **2. Schema Design & Data Modeling**

1. What is Schema-less (but structured)
    
2. When to Embed Documents
    
3. When to Reference Documents
    
4. 1:1 Relationships
    
5. 1:Many Relationships
    
6. Many:Many Relationships
    
7. Pros & Cons of Embedding
    
8. Pros & Cons of Referencing
    
9. Example Models:
    - User ↔ Orders
        
    - Blog ↔ Comments
        
10. Data Modeling Best Practices
    

---

# **3. Important MongoDB Queries**

1. Basic Query Operators:
    
    - `$eq`, `$ne`, `$gt`, `$gte`, `$lt`, `$lte`
        
2. Logical Operators:
    
    - `$and`, `$or`, `$not`, `$nor`
        
3. Array Operators:
    
    - `$in`, `$nin`, `$elemMatch`
        
4. Projection (`{ field: 1/0 }`)
    
5. Sorting (`sort()`)
    
6. Limiting & Skipping (`limit()`, `skip()`)
    
7. Pagination Pattern (skip/limit + ObjectId based)
    

---

# **4. Aggregation Pipeline**

1. What is Aggregation
    
2. Aggregation Stages:
    
    - `$match`
        
    - `$group`
        
    - `$project`
        
    - `$sort`
        
    - `$unwind`
        
    - `$lookup`
        
3. Common Aggregation Examples:
    
    - Counting documents
        
    - Grouping by user
        
    - Summing order amounts
        
    - Joining collections
        
4. Aggregation vs Query — When to use what
    

---

# **5. Indexing (Very Important for Interviews)**

1. What is an Index
    
2. How Indexes improve performance
    
3. Types of Indexes:
    
    - Single-field
        
    - Compound
        
    - Unique
        
    - Text Index
        
4. Index Direction (1 / -1)
    
5. Covered Queries
    
6. How to create indexes (`createIndex()`)
    
7. `explain()` → COLLSCAN vs IXSCAN
    
8. Why queries become slow
    
9. Best Practices for Indexing
    

---

# **6. Advanced Concepts (Beginner-Friendly)**

1. MongoDB Transactions (basic idea only)
    
2. ACID in MongoDB (short explanation)
    
3. MongoDB Write Concerns
    
4. Read Preference (Primary / Secondary)
    
5. TTL Indexes (Time-to-Live)
    
6. Capped Collections
    
7. ObjectId vs UUID
    

---

# **7. Node.js + MongoDB (Mongoose)**

1. Connecting to MongoDB
    
2. Defining a Mongoose Schema
    
3. Important Schema Options:
    
    - `required`
        
    - `unique`
        
    - `default`
        
    - `validate`
        
4. Mongoose Models
    
5. CRUD with Mongoose
    
6. `populate()` (References)
    
7. Mongoose Middleware:
    
    - pre
        
    - post
        
8. Handling Errors:
    
    - Validation errors
        
    - Duplicate key error (E11000)
        

---

# **8. Common Interview Questions (You will create separate files)**

1. MongoDB vs SQL
    
2. When to embed vs reference
    
3. What is aggregation pipeline
    
4. What is ObjectId
    
5. Why indexing is important
    
6. How to improve slow queries
    
7. How `$lookup` works
    
8. What is ACID in MongoDB
    
9. How populate works
    
10. Difference between MongoDB & Mongoose
    

---

# **9. Practical Tasks (Good for revision)**

1. Create a CRUD API using Mongoose
    
2. Build User–Order model
    
3. Implement pagination
    
4. Implement compound index
    
5. Implement search using text index
    
6. Build Aggregation queries (3–5 pipelines)
    
7. Identify COLLSCAN using `explain()`