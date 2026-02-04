When you put `@Data` on a class, Lombok automatically generates the following at **compile time**:
1. **Getters** for all fields
2. **Setters** for all non-final fields
3. **`toString()` method** (includes all fields)
4. **`equals()` and `hashCode()` methods** (based on all fields)
5. **`RequiredArgsConstructor`** → constructor for all `final` fields

In short, it saves you from manually writing getters, setters, `toString()`, `equals()`, `hashCode()`.
