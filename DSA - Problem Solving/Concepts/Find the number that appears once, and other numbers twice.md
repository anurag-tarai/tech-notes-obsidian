[136. Single Number](https://leetcode.com/problems/single-number/) 
## Better Approach
```java
public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for(int a: nums){
            if(map.containsKey(a)) map.put(a,map.get(a)+1);
            else map.put(a,1);
        }
        for(int k : map.keySet()){
            if(map.get(k)==1) ans = k;
        }
        return ans;
    }
```
**Time Complexity:** `O(n)`  
**Space Complexity:** `O(n)`
## Optimal Approach
XOR operation
```java
public int singleNumber(int[] nums) {  
    int n  = 0;  
    for(int a: nums){  
        n = n^a;  
    }  
    return n;  
}
```