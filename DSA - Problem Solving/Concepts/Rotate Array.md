[Rotate Array](https://leetcode.com/problems/rotate-array/) 
## Better Solution
Very similar to Left Rotate, with observation you can get it!

![](Screenshot%20from%202026-01-07%2006-19-08.png)
```java
public void rotate(int[] nums, int k) {  
    int n = nums.length;  
    k = k%n;  
  
    int[] temp = new int[k];  
  
    // storing last k elements in temp  
    for(int i=n-k; i<n; i++){  
        temp[i-(n-k)] = nums[i];  
    }  
  
    // shifting remaining 
    for(int i=n-k-1; i>=0; i--){  
        nums[i+k] = nums[i];  
    }  
  
    // pushing temp forward  
    for(int i=0; i<k; i++){  
        nums[i] = temp[i];  
    }  
}
```

## ⏱️ Time Complexity

Let `n = nums.length`

### 1️⃣ Normalize `k`

`k = k % n;`

- **O(1)**
    

---

### 2️⃣ Store last `k` elements in `temp`

`for(int i = n-k; i < n; i++)`

- Runs **k times**
    
- **O(k)**
    

---

### 3️⃣ Shift remaining elements to the right

`for(int i = n-k-1; i >= 0; i--)`

- Runs **(n − k) times**
    
- **O(n − k)**
    

---

### 4️⃣ Copy `temp` back to the front

`for(int i = 0; i < k; i++)`

- Runs **k times**
    
- **O(k)**
    

---

### 🔢 Total Time

`O(k + (n − k) + k) = O(n + k)`

Since `k ≤ n`:

`O(n)`

✔️ **Final Time Complexity: O(n)**

## Space Complexity
Extra array of size `k`
Worst case:
- If `k ≈ n` → **O(n)** space

---
## Optimal Solution
![](Screenshot%20from%202026-01-07%2006-35-28.png)
```java
public void rotate(int[] nums, int k) {  
    int n = nums.length;  
    k = k%n;  
    reverse(nums, 0, n-k-1);  
    reverse(nums, n-k, n-1);  
    reverse(nums, 0, n-1);  
  
}  
  
public void reverse(int[]arr, int l,int r){  
    while(l<r){  
        int temp = arr[r];  
        arr[r] = arr[l];  
        arr[l] = temp;  
        l++;  
        r--;  
    }  
}
```
time complexity : 
1st reverse - n-k iteration
2nd reverse - k
3rd reverse - n
total - O(n-k+k+n) -> O(2n) -> O(n)

Space Complexity - O(1) -> no extra space is taken only variables