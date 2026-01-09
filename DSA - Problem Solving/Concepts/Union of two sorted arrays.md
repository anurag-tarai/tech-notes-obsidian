Given two sorted arrays **nums1** and **nums2**, return an array that contains the **union** of these two arrays. The elements in the union must be in ascending order.

The union of two arrays is an array where all values are distinct and are present in either the first array, the second array, or both.

Example 1

**Input**: nums1 = [1, 2, 3, 4, 5], nums2 = [1, 2, 7]

**Output**: [1, 2, 3, 4, 5, 7]

**Explanation**:

The elements 1, 2 are common to both, 3, 4, 5 are from nums1 and 7 is from nums2

Example 2

**Input**: nums1 = [3, 4, 6, 7, 9, 9], nums2 = [1, 5, 7, 8, 8]

**Output**: [1, 3, 4, 5, 6, 7, 8, 9]

**Explanation**:

The element 7 is common to both, 3, 4, 6, 9 are from nums1 and 1, 5, 8 is from nums2

Now your turn!

**Input**: nums1 = [3, 4, 4, 4], nums2 = [6, 7, 7]

Output:

Pick your answer

[3, 4, 6, 7, 7]

[3, 4, 6, 7]

[3, 4, 4, 4, 6, 7, 7]

[3 ,6, 4, 7]

Constraints

- 1 <= nums1.length, nums2.length <= 1000
- -104 <= nums1[i] , nums2[i] <= 104
- Both nums1 and nums2 are sorted in non-decreasing order
## Solution
### My solution
```java
public static ArrayList<Integer> union(int[] arr1, int[] arr2){  
    int n1 = arr1.length;  
    int n2 = arr2.length;  
  
    int l1 = 0;  
    int l2 = 0;  
  
    ArrayList<Integer> result = new ArrayList<>();  
  
    while(l1<n1 && l2<n2){  
        if(arr1[l1]==arr2[l2]){  
            result.add(arr1[l1]);  
            l1++;  
            l2++;  
        }else if(arr1[l1]<arr2[l2]){  
            result.add(arr1[l1]);  
            l1++;  
        }else if(arr2[l2]<arr1[l1]){  
            result.add(arr2[l2]);  
            l2++;  
        }  
    }  
    while(l1<n1){  
        result.add(arr1[l1]);  
        l1++;  
    }  
  
    while(l2<n2){  
        result.add(arr2[l2]);  
        l2++;  
    }  
  
    return result;  
}
```

## ⚠️ Important Issue in the Given Hint Code

The provided code **does NOT remove duplicates** ❌  
It simply merges two sorted arrays (like merge step of merge sort).

Example problem:

`arr1 = [3, 4, 4, 4] arr2 = [6, 7, 7]`

Your code would return:

`[3, 4, 4, 4, 6, 7, 7] ❌`

But **union requires DISTINCT elements**.

## Correct Code
```java
public static ArrayList<Integer> union(int[] arr1, int[] arr2) {
    int i = 0, j = 0;
    ArrayList<Integer> result = new ArrayList<>();

    while (i < arr1.length && j < arr2.length) {
        int val;
        if (arr1[i] < arr2[j]) {
            val = arr1[i++];
        } else if (arr2[j] < arr1[i]) {
            val = arr2[j++];
        } else {
            val = arr1[i];
            i++;
            j++;
        }

        if (result.size() == 0 || result.get(result.size() - 1) != val) {
            result.add(val);
        }
    }

    while (i < arr1.length) {
        if (result.get(result.size() - 1) != arr1[i])
            result.add(arr1[i]);
        i++;
    }

    while (j < arr2.length) {
        if (result.get(result.size() - 1) != arr2[j])
            result.add(arr2[j]);
        j++;
    }

    return result;
}
```
We use two pointers on sorted arrays and add elements only if they are different from the last inserted element, ensuring uniqueness in O(n1 + n2) time. 


