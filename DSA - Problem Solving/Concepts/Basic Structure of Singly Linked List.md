## Node Class
```java
public class Node {
    public int data;
    public Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
```
## Singly Linked List Clas
A `LinkedList` class usually maintains:
- **head** → first node
- **tail** → last node (optional but useful)
- **size** → number of nodes (optional but useful)
```java
public class SinglyLinkedList {

    private Node head;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // -------------------------
    // ALL OPERATIONS
    // -------------------------
}
```