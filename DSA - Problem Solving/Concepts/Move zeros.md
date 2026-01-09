[283. Move Zeroes](https://leetcode.com/problems/move-zeroes/) 
![](Screenshot%20from%202026-01-07%2007-00-04.png)
```java
public void moveZeroes(int[] nums) {  
    int n = nums.length;  
    int count = 0;  
    int l = 0;  
  
    for(int i=0; i<n; i++){  
        if(nums[i]!=0){  
            nums[l] = nums[i];  
            l++;  
        }  
        else count++;  
    } 
     
    for(int i=n-count; i<n; i++){  
        nums[i] = 0 ;  
    }  
}
```
#### Time Complexity
1st loop - n time -> O(n)
2nd loop worst case - n time -> O(n)
total -> O(2n) -> O(n)

#### Space Complexity
No extra space taken
For variable the space is constant
SC -> O(1)

---
But it making too much operations, if we just swap when found a non zero, it will automatically move the zeros to end, keeping the order as its.
```java
public void moveZeroes(int[] nums) {  
    int n = nums.length;  
    int l = 0;  
  
    for(int i=0; i<n; i++){  
        if(nums[i]!=0){  
            int temp = nums[i];  
            nums[i] = nums[l];  
            nums[l] = temp;  
            l++;  
        }  
    }  
}
```