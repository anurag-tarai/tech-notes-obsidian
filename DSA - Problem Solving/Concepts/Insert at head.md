
![](singly_Insert_at_head%202.png)
## Insert Method
```java
public void insertAtHead(int data){  
    SinglyNode temp = new SinglyNode(data); // new Node 
    if(head != null){  // if list is not empty
        temp.next = head;  
    }  
    head = temp;  // it by default handle list empty case
  
    if(tail==null){  
        tail = head;  
    }
}      
```
## In main
```java
SinglyLinkedList singlyLinkedList = new SinglyLinkedList();  
  
singlyLinkedList.insertAtHead(34);  
singlyLinkedList.insertAtHead(3);  
singlyLinkedList.insertAtHead(4);  
  
singlyLinkedList.traverse();
```
output
```q
head-->[4]-->[3]-->[34]-->null
```