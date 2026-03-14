## Users

id (PK)  
name  
email  
password  
role  
created_date  
updated_date

---

## Categories

id (PK)  
name

Example

1 Games  
2 Education  
3 Social

---

## Applications

id (PK)  
name  
description  
version  
release_date  
average_rating
downloads_count
owner_id _(reference to user who uploaded the app)_  
category_id  
visibility  
created_date  
updated_date

**Note:**  
`owner_id` references the user who owns the application. In a microservice setup this is usually a **soft reference**, meaning the actual user data may live in another service.

---

## Reviews
id (PK)
user_id  
app_id  
rating  
review_description  
created_date  
updated_date

UNIQUE (user_id, app_id)

This ensures:

One user → One review per app

---

## Downloads

id (PK)  
user_id  
app_id  
download_date

**Why changed:**  
Earlier you used `(user_id, app_id)` as the primary key, but that allows **only one download ever**.  
Using a separate `id` allows multiple downloads (for example reinstalling the app).

---

## Notification

id (PK)  
recipient_id  
app_id  
type  
message  
is_read  
created_at

**Note:**  
`type` helps the system understand **why the notification was created**, so the frontend can display different messages or icons.

Example:

```java
APP_UPDATED → Notify users who downloaded the app  
APP_DOWNLOADED → Notify owner  
NEW_REVIEW → Notify owner
OWNER_ANNOUNCEMENT
```

---