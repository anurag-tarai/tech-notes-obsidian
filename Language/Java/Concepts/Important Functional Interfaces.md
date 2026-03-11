`java.util.function`

| Interface      | Method      | Purpose                      |
| -------------- | ----------- | ---------------------------- |
| Predicate      | test(T t)   | Returns boolean              |
| Function<T,R>  | apply(T t)  | Convert one value to another |
| Consumer       | accept(T t) | Takes input, no return       |
| Supplier       | get()       | Returns value                |
| UnaryOperator  | apply(T t)  | Same input/output type       |
| BinaryOperator | apply(T,T)  | Operates on two values       |