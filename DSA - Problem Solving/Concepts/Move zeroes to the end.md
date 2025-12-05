
```ad-question
Given an array of integers, write a function to move all the zeroes to the end of the array **while maintaining the relative order of the non-zero elements**.

**Constraints:**

- Must perform the operation **in-place** (no extra array).
    
- Minimize the number of operations.
    

**Example:**  
Input: `[0, 1, 0, 3, 12]`  
Output: `[1, 3, 12, 0, 0]`
```
### Intution
1. Move the non-zeros to start
2. Maintain a left index `l`, travel through the array each time found a non zero, move to `arr[l]`, increment `l` 
3. And remaining `l` to `arr.legnth-1` fill with zeros
```java
int l=0; 
// move non-zeros to start 
for(int a: arr){  
        if(a!=0){  
            arr[l] = a;  
            l++;  
        }  
}  

// fill the remaining with zeros
while(l<arr.length){  
   arr[l] = 0;  
   l++;  
}
```
### Time Complexity
`for loop` - O(n)
`while loop` - O(n)
Two passes →O(n+n) = **O(n)**
### Space Complexity
only pointer `l` -> `O(1)`
