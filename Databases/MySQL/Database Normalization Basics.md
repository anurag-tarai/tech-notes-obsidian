Normalization is a process to organize data in your database to reduce redundancy.

### 1NF
1. Each column contains atomic  (indivisible) values
2. Each column contains values of the same type
3. Each  row is unique (typically ensured by a primary key)
4. No repeating group of column

### 2NF
1. It must in 1NF
2. All non-key attributes must be fully functionally dependent on the primary key.
	- means no non-key column should depend on only part of the primary key.
### 3NF
1. It must in 2NF
2. It must not have transitive dependencies
3. Transitive dependencies occur when a non key attribute depends on another non-key attribute, rather than directly depending on primary key