### **1️⃣ The Contract**

1. **Consistency Rule**
    
    - If `a.equals(b)` → `a.hashCode() == b.hashCode()` ✅
        
    - If `a.equals(b)` is false → `a.hashCode() == b.hashCode()` **can be true or false** (collision is allowed)
        
2. **Reflexive:**  
    `a.equals(a)` must always be true
    
3. **Symmetric:**  
    `a.equals(b)` → `b.equals(a)` must be true
    
4. **Transitive:**  
    If `a.equals(b)` and `b.equals(c)` → `a.equals(c)`
    
5. **Consistent:**  
    Multiple calls should return same result (unless object changes)
    

💡 **Key takeaway:** `equals()` checks **logical equality**, `hashCode()` is used to locate the bucket in hash-based collections.