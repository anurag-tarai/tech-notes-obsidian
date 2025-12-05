A **LinkedList is made of nodes**.  
Each **Node** stores:
1. **data** → the actual value
2. **next** → a pointer/reference to the next node in the list

Example Node:
```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```
### Points:
- Nodes are independent objects.
- They are connected using references (`next`).
- Last node always has `next = null`.

```java
Node node1 = new Node(10);
Node node2 = new Node(30);
Node node3 = new Node(40);

node1.next = node2;
node2.next = node3;
```

this create :
```q
node1(10) → node2(30) → node3(40) → null
```

Traversing the linked list:
```java
Node node = node1;

while(node != null){
    System.out.println(node.data);
    node = node.next;
}
```

output:
```bash
10
30
40
```