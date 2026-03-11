An **ER Diagram (Entity–Relationship Diagram)** is a **visual representation of the ER model**.

It shows:
- Entities
- Attributes
- Relationships between entities

It is usually created **before implementing the database**.

---
# Components of an ER Diagram

## 1. Entity

An **entity** is a real-world object or concept about which data is stored.

Examples:
- Student
- Course
- Order
- Product
---
## 2. Attribute
An **attribute** describes properties of an entity.
Example:

Student entity attributes:
- student_id
- name
- age

---
## 3. Relationship

A **relationship** describes how entities are connected.

Example:

Student **enrolls in** Course

---
# Example ER Model

Entities:
- Student
- Course

Relationship:
- Enrolls

ER Diagram (text form)

[Student] ---- Enrolls ---- [Course]

Attributes:

Student

- student_id
    
- name
    
- age
    

Course

- course_id
    
- course_name


![](Screenshot%20from%202026-03-09%2016-57-25.png)