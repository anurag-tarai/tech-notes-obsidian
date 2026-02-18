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
## Singly Linked List - add, traverse, isEmpty
A `LinkedList` class usually maintains:
- **head** → first node
- **tail** → last node (optional but useful)
- **size** → number of nodes (optional but useful)

```java
public class LinkedList {  
    public Node head;  
    public Node tail;  
    public int size;  
  
    public LinkedList(){  
	   head = null;  
       tail = null;  
       size = 0;  
    }  
  
  // Adding element to linkedlist
    public void add(int data){  
        Node node = new Node(data);  
        if(head==null){  
            head = node;  
        }else{  
            tail.next = node;  
        }  
        tail = node;  
        size++;  
    }  
  
  // traverse through the linkelist
    public void traverse(){  
        Node cur = head;  
        while(cur!=null){  
            System.out.print(cur.data+"->");  
            cur = cur.next;  
        }  
        System.out.println("NULL");  
    }  
  
  // checking if list is empty
    public boolean isEmpty() {  
        return size == 0;  
    }  
}
}
```