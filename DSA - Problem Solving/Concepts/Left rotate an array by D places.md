Example : arr = [1,2,3,4,5,6,7]

If D = 7, then after 7 rotation, its become original array

If D = 8, then we can make it 7 + 1, just have to do 1 rotation

if D = 20, then its 7 + 7 + 6 , just 6 rotation needed

so, we just have to do `D = D % n` rotation, which < n

---
## Brute Force Approach
This is similar to the, rotate one element.

Before using `d`, you **must normalize it**:`d = d % arr.length;`

where d = 1, we store the first element,

if d = 3, we have to store first 3 elements

then, shifting each index from i = d to n-1 to i-d

Then remaining element just put it back of the array

```java
public static int[] leftRotateByDPlaces(int[] arr, int d) {
    int n = arr.length;
    d = d % n;   // 🔴 important

    int[] temp = new int[d];

    // store first d elements
    for (int i = 0; i < d; i++) {
        temp[i] = arr[i];
    }

    // shift remaining elements
    for (int i = d; i < n; i++) {
        arr[i - d] = arr[i];
    }

    // put temp elements at the end
    /*for (int i = n - d, j = 0; i < n; i++, j++) {
        arr[i] = temp[j];
    }
    */
    for (int i = n - d,i < n; i++) {
        arr[i] = temp[i-(n-d)];
    }
    
    return arr;
}
```

#### ⏱ Complexity (optional but good to add)

- **Time Complexity:** `O(n)`
    
- **Space Complexity:** `O(d)` (worst case `O(n)`)
---
## Optimal Solution
![](Screenshot%20from%202026-01-06%2016-15-03.png)
```java
public static void leftRotateByDPlacesOptimal(int []arr, int d){  
		d = d % arr.length; // You should normalize d before using it
        reverse(arr, 0, d-1);  
        reverse(arr, d, arr.length-1);  
        reverse(arr, 0, arr.length-1);  
}  
  
public static void reverse(int[] arr, int l, int r){  
     while(l<r){  
        int temp = arr[r];  
        arr[r] = arr[l];  
        arr[l] = temp;  
        l++;  
        r--;  
    }  
}
```
We reverse the first `d` elements, then the remaining `n−d` elements, and finally the entire array to achieve left rotation in O(n) time and O(1) space.

Time Complexity : 
1st reverse - O(d)
2nd reverse - O(n-d)
3rd reverse - O(n)
Total -> O(d + (n − d) + n) = O(2n) = O(n)

Space Complexity :
O(1)