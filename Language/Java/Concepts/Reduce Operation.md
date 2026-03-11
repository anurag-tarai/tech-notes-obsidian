`reduce()` combines elements to produce a **single result**.

Example:
```java
int sum = list.stream()
              .reduce(0, (a,b) -> a + b);
```

Output:
```
sum of all elements
```

Examples:
- Sum of numbers
- Concatenate strings
- Find max/min
- Build a combined object
---
## Basic Idea of `reduce()`
Suppose we have:
```java
List<Integer> numbers = List.of(1, 2, 3, 4, 5);
```

If we want the **sum**, normally:
```java
int sum = 0;  
for(int n : numbers){  
    sum = sum + n;  
}
```

With Stream:
```java
int sum = numbers.stream()  
                 .reduce(0, (a, b) -> a + b);
```

---
## How `reduce()` Works Internally
reduce(identity, accumulator)
```java
T result = stream.reduce(identity, accumulator);
```

Where:

| Parameter       | Meaning                       |
| --------------- | ----------------------------- |
| **identity**    | Initial value                 |
| **accumulator** | Function that combines values |
Example:
```java
numbers.stream().reduce(0, (a, b) -> a + b);
```

Execution steps:

| Step  | a (result so far) | b (stream element) | Result |
| ----- | ----------------- | ------------------ | ------ |
| Start | 0                 | -                  | 0      |
| 1     | 0                 | 1                  | 1      |
| 2     | 1                 | 2                  | 3      |
| 3     | 3                 | 3                  | 6      |
| 4     | 6                 | 4                  | 10     |
| 5     | 10                | 5                  | 15     |
```java
Stream: 1  2  3  4  5

identity = 0

Step1 → 0 + 1 = 1
Step2 → 1 + 2 = 3
Step3 → 3 + 3 = 6
Step4 → 6 + 4 = 10
Step5 → 10 + 5 = 15

Final Result = 15
```
---
## Reduce Without Identity
