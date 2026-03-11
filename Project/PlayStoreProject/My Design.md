## Entities

User
- id
- name
- password
- created_date
- updated_date
- role (USER/OWNER)

App
- id
- name
- description
- released_date
- updated_date
- version
- genre
- ratings
- downloads_count

Review
- user_id
- app_id  
- primary key : user_id + app_id
- review_description
- rating
- created_date
- updated_date

Downloads
- user_id
- app_id - these two combine primary key
- download_date
