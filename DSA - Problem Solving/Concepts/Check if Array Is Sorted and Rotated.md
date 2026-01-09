[Check if Array Is Sorted and Rotated](https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/) 
### After Rotate An Array
An array `A` rotated by `x` positions results in an array `B` of the same length such that `B[i] == A[(i+x) % A.length]` for every valid index `i`.

`B[i] = A[(i+x) % A.length]` this formula is for left rotate!

`B[(i+x) % A.length = A[i]` this is right rotate formula

`LEFT rotate by x  == RIGHT rotate by (n - x)`

```java
public boolean check(int[] nums) {  
    int count = 0;  
    for(int i=0; i<nums.length; i++){  
        if(nums[i]>nums[(i+1)%nums.length]) count++;  
    }  
    return count<=1;  
}
```

![](Screenshot%20from%202026-01-06%2009-17-46.png) 