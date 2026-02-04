**JPQL (Java Persistence Query Language)** is a **query language used in JPA to query entities, not database tables**.

👉 It looks like SQL, but it works with **Java classes and fields**, not table names and column names.

JPQL Example
```java
@Query("SELECT u FROM User u WHERE u.name LIKE %:keyword%")
List<User> searchByName(@Param("keyword") String keyword);


@Query("SELECT u FROM User u WHERE u.email = :email")
User findUserByEmail(String email);


@Query("SELECT n FROM Note n WHERE n.user.id = :userId AND n.isDeleted = false")
Page<Note> findActiveNotes(Long userId, Pageable pageable);
```