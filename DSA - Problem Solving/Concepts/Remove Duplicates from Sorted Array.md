[Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) 
```java
public int removeDuplicates(int[] nums) {  
    int n = nums.length;  
    int l = 0;  
    for(int i=1; i<n; i++){  
        if(nums[l]!=nums[i]){  
            l++;  
            nums[l] = nums[i];  
        }  
    }  
    return l+1;  
}
```

Time Complexity -> O(n)
Space Complexity -> O(1)

**Approach:**  
Since the array is already sorted, all duplicate elements appear next to each other.  
We use two pointers: a left pointer `l` to track the position of the last unique element, and a pointer `i` to traverse the array.  
The first element is always unique, so we initialize `l = 0`.  
For each element from index `1` to `n−1`, if `nums[i]` is different from `nums[l]`, we increment `l` and place `nums[i]` at position `l`.  
Finally, `l + 1` gives the number of unique elements.