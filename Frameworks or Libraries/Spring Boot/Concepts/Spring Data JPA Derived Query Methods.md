Spring Data JPA allows us to create database queries **just by writing method names** in the repository interface.  
No SQL or JPQL is required.

											
```java
boolean existsByEmail(String email);
boolean existsByUsername(String username);

User findByEmail(String email);
List<User> findByName(String name);

User findByEmailAndPhone(String email, String phone);
List<User> findByNameOrEmail(String name, String email);

List<User> findByNameContaining(String keyword);
List<User> findByEmailStartingWith(String prefix);
List<User> findByEmailEndingWith(String suffix);

List<Note> findByIsDeletedFalse();
List<Note> findByUserIdAndIsDeletedFalse(Long userId);


long countByUserId(Long userId);
long countByEmail(String email);

void deleteByEmail(String email);
void deleteByUserId(Long userId);


List<User> findByAgeGreaterThan(int age);
List<User> findByAgeLessThan(int age);
List<User> findByCreatedDateBetween(LocalDateTime start, LocalDateTime end);


Page<Note> findByUserIdAndIsDeletedFalse(Long userId, Pageable pageable);
```