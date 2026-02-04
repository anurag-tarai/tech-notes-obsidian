**FetchType** defines **when related entities are loaded from the database**:
- **EAGER:** Load immediately along with the parent entity.
- **LAZY:** Load **only when accessed**, i.e., on demand.

### Default FetchType by Relationship

|Relationship|Default FetchType|
|---|---|
|`@ManyToOne`|EAGER|
|`@OneToMany`|LAZY|
|`@OneToOne`|EAGER|
|`@ManyToMany`|LAZY|