1. [Basic Structure of Singly Linked List](Basic%20Structure%20of%20Singly%20Linked%20List.md)
2. [traverse](traverse.md)
3. [Insert at head](Insert%20at%20head.md)
4. 


---
✔ Insert at head  
✔ insert at tail  
✔ insert at any index  
✔ delete at head  
✔ delete at tail  
✔ delete at any index  
✔ search  
✔ size tracking  
✔ display method

```java
public class SinglyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // -----------------------------
    // Insert Operations
    // -----------------------------

    // Insert at head
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        if (tail == null) { // list was empty
            tail = newNode;
        }

        size++;
    }

    // Insert at tail
    public void insertAtTail(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    // Insert at any index
    public void insertAtIndex(int index, int data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (index == 0) {
            insertAtHead(data);
            return;
        }

        if (index == size) {
            insertAtTail(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        size++;
    }

    // -----------------------------
    // Delete Operations
    // -----------------------------

    // Delete head
    public void deleteHead() {
        if (head == null) {
            return;
        }

        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;
    }

    // Delete tail
    public void deleteTail() {
        if (head == null || head.next == null) {
            head = tail = null;
            size = 0;
            return;
        }

        Node temp = head;

        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;

        size--;
    }

    // Delete at any index
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (index == 0) {
            deleteHead();
            return;
        }

        if (index == size - 1) {
            deleteTail();
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        size--;
    }

    // -----------------------------
    // Search
    // -----------------------------
    public boolean search(int key) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    // -----------------------------
    // Display
    // -----------------------------
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // -----------------------------
    // Size getter
    // -----------------------------
    public int getSize() {
        return size;
    }
}

```


```java
public class Main {
    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtHead(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtIndex(1, 15);

        list.display(); // 10 -> 15 -> 20 -> 30 -> null

        list.deleteHead();
        list.deleteTail();
        list.deleteAtIndex(1);

        list.display(); // 15 -> null

        System.out.println("Size: " + list.getSize());
        System.out.println("Search 15: " + list.search(15));
    }
}

```