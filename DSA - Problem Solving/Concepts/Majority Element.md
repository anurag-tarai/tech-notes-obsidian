[169. Majority Element](https://leetcode.com/problems/majority-element/) 
## Better Solution
- Use hashing
```java
public int majorityElement(int[] nums) {  
    int ans = 0;  
    int n  = nums.length;  
    Map<Integer, Integer> map = new HashMap<>();  
    for(int a:nums){  
        if(map.containsKey(a)){  
            map.put(a, map.get(a)+1);  
        }else map.put(a,1);  
    }  
  
    for(int k: map.keySet()){  
        if((map.get(k)) > (n/2)) ans = k;  
    }  
    return ans;  
}
```
Time Complexity : O(N)
Space Complexity : O(N)

---
## Optimal solution

