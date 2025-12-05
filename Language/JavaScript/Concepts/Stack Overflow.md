# 🔥 What is Stack Overflow?

A **stack overflow** happens when too many function calls fill the stack memory, usually due to infinite recursion.

---

# ⚠️ Stack Overflow Example

```js
function funcA() { funcB(); }
function funcB() { funcA(); }
```

### ASCII Visualization

```js
+-----------+
| funcA     |
+-----------+
| funcB     |
+-----------+
| funcA     |
+-----------+
| funcB     |
+-----------+
| funcA     |
+-----------+
|   ...     |
|   ...     |
| STACK FULL|
+-----------+
```

Eventually → **RangeError: Maximum call stack size exceeded**