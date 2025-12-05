- **Primitive variables** → stored on `stack`.
- **Objects + Nodes** → stored on `heap`.

When you write:
```java
Node n = new Node(10);
```

Memory view:
```java
STACK                          HEAP
-----                          -----
n ----------------->       |[ Node object ]|
                           |    data = 10  |
                           |  next = null  |

```

For a full list:

```java
STACK                          HEAP
head ----------------->  [10 | next] ---> [20 | next] ---> [30 | null]
															^
tail -----------------------------------------------------> |
size = 3                                                tail node
```