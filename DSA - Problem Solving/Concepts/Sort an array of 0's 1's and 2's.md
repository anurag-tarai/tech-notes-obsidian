https://leetcode.com/problems/sort-colors/
## Brute Force
-> Sort (Merge Sort)
- TC - O(nlogn)
- SC - O(n)

## Better
```java
public void sortColors(int[] nums) {  
    int[] freq = new int[3];  
  
    for(int i=0; i<nums.length; i++){  
        freq[nums[i]]++;  
    }  
  
    int j = 0;  
    for(int i=0; i<3; i++){  
        for(int k=0; k<freq[i]; k++){  
            nums[j] = i;  
            j++;  
        }  
    }  
}
```
![](Screenshot%20from%202026-01-10%2017-13-18.png)

---


