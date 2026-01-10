```java
public int[] twoSum(int[] nums, int target) {  
    Map<Integer, Integer> map = new HashMap<>();  
    int j = 0;  
    int k = 0;  
    for(int i=0; i<nums.length; i++){  
        if(map.containsKey(target-nums[i]) && map.get(target-nums[i])!= i){  
            j = i;  
            k = map.get(target-nums[i]);  
            break;  
        }  
        map.put(nums[i],i);  
    }  
    return new int[]{j,k};  
}
```
#### Time Complexity - 
- O(N) if taking unordered map
- O(N)*O(logn) -> if take ordermap
- Overal can say -> O(n*logn)
#### Space Coplexity
- O(N) - Extra Map of size N
