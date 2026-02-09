## Add 1 to a Linked List Number

You are given a **singly linked list** where each node contains a **single digit (0–9)**.  
The digits are arranged such that the **head node represents the most significant digit** of a number.

Your task is to **add 1 to the number represented by the linked list** and return the **head of the modified linked list**.

---

### Input

- A singly linked list of length `n`
    
- Each node contains an integer in the range `0–9`
    

---

### Output

- Return the head of the linked list after adding **1** to the number
    

---

### Examples

**Example 1**

`Input:  4 → 5 → 6 Output: 4 → 5 → 7`

Explanation:  
The linked list represents the number **456**.  
After adding 1 → **457**.

---

**Example 2**

`Input:  1 → 2 → 3 Output: 1 → 2 → 4`

Explanation:  
The linked list represents the number **123**.  
After adding 1 → **124**.

---

**Example 3**

`Input:  9 → 9 → 9 Output: 1 → 0 → 0 → 0`

Explanation:  
The linked list represents the number **999**.  
After adding 1 → **1000**.

---

### Constraints

- `1 ≤ length of linked list ≤ 10⁵`
    
- `0 ≤ Node.data ≤ 9`
    

---

### Expected Complexity

- **Time Complexity:** `O(n)`
    
- **Auxiliary Space:** `O(1)`

---
## Solution
```java
class Solution {

    // Function to reverse linked list
    private Node reverse(Node head) {
        Node prev = null, curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public Node addOne(Node head) {

        // Step 1: Reverse the list
        head = reverse(head);

        Node curr = head;
        int carry = 1; // we need to add 1

        // Step 2: Add 1 to reversed list
        while (curr != null && carry > 0) {
            int sum = curr.data + carry;
            curr.data = sum % 10;
            carry = sum / 10;

            if (curr.next == null && carry > 0) {
                curr.next = new Node(carry);
                carry = 0;
            }

            curr = curr.next;
        }

        // Step 3: Reverse back
        return reverse(head);
    }
}

```