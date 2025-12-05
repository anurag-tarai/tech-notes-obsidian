## **1️⃣ Basic Query Operators**

**Goal:** Practice `$eq`, `$ne`, `$gt`, `$gte`, `$lt`, `$lte`

**Questions:**

1. Find all users with `age` exactly 25.
    
2. Find all products with `price` not equal to 500.
    
3. Fetch orders where `totalAmount` is greater than 1000.
    
4. Fetch users whose `age` is at least 18.
    
5. Find products with `price` less than 200.
    
6. Get all orders where `totalAmount` is between 500 and 1500.
    

---

## **2️⃣ Logical Operators**

**Goal:** Practice `$and`, `$or`, `$not`, `$nor`

**Questions:**

1. Find users whose `age` is between 18 and 30 **and** `status` is "Active".
    
2. Fetch products that are either `category: "Electronics"` **or** `category: "Books"`.
    
3. Get users whose `age` is **not** 25.
    
4. Find orders whose `status` is neither "Pending" nor "Cancelled".
    
5. Fetch users who are admins **or** managers **and** have `status: "Active"`.
    

---

## **3️⃣ Array Operators**

**Goal:** Practice `$in`, `$nin`, `$elemMatch`

**Questions:**

1. Find users whose `role` is either `"admin"`, `"manager"`, or `"supervisor"`.
    
2. Fetch products whose `tags` array does **not** include `"Sale"` or `"Clearance"`.
    
3. Find orders that have **at least one item** with `price > 500` and `quantity >= 2`.
    
4. Fetch users who have multiple addresses and at least one in `"New York"`.
    
5. Find products that belong to any of the categories `["Electronics", "Books", "Clothing"]`.
    

---

## **4️⃣ Projection**

**Goal:** Practice including/excluding fields

**Questions:**

1. Fetch only `name` and `email` of all users.
    
2. Fetch products but exclude the `description` field.
    
3. Get orders with `orderId` and `totalAmount` only.
    
4. Fetch users with `name` and `addresses`, but exclude `_id`.
    
5. Fetch products with `name` and `price`, sorted by `price` descending.
    

---

## **5️⃣ Sorting**

**Goal:** Practice `sort()`

**Questions:**

1. Fetch all products sorted by `price` ascending.
    
2. Get users sorted by `age` descending.
    
3. Fetch orders sorted by `createdAt` descending.
    
4. Get users sorted first by `status` ascending, then by `name` ascending.
    
5. Sort products by `category` ascending, and `price` descending.
    

---

## **6️⃣ Limiting & Skipping**

**Goal:** Practice `limit()` and `skip()`

**Questions:**

1. Fetch first 5 users sorted by `age`.
    
2. Skip the first 10 products and fetch the next 5.
    
3. Get the 3rd page of orders if each page contains 10 orders.
    
4. Fetch top 3 most expensive products.
    
5. Skip first 5 users, return next 10, sorted by `createdAt`.
    

---

## **7️⃣ Pagination Pattern**

**Goal:** Practice skip-limit vs ObjectId-based pagination

**Questions:**

1. Using skip-limit, fetch the 4th page of users (10 per page).
    
2. Using ObjectId-based pagination, fetch the next 10 products **after the last `_id`** from previous query.
    
3. Implement next-page pagination for orders using `_id`.
    
4. Compare skip-limit vs ObjectId pagination in terms of efficiency for 100k+ documents.