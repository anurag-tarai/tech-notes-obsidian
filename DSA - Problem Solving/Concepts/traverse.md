```java
public void traverse(){  
    SinglyNode curr = this.head;  
    System.out.print("head-->");  
    while(curr!=null){  
        System.out.print("["+curr.data+"]");  
        curr=curr.next;  
        System.out.print("-->");  
    }  
    System.out.print("null");  
}
```