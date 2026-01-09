[Missing Number](https://leetcode.com/problems/missing-number/) 
```java
public int missingNumber(int[] nums) {  
    long sum = 0;  
    int n = nums.length;  
  
    long total = n*(n+1)/2;  
  
    for(int a: nums){  
        sum+=a;  
    }  
    return (int)(total - sum);  
}
```