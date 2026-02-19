[567. Permutation in String](https://leetcode.com/problems/permutation-in-string/) 
## Brute Force 
1. Calculate the freq of the alphabet sub string
2. Find the window where it have same freq as the sub string
```java
import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1 > n2) return false;

        int[] fre = new int[26];
        for(char c : s1.toCharArray()) {
            fre[c - 'a']++;
        }

        for(int i = 0; i <= n2 - n1; i++) {
            int[] fre2 = new int[26];
            for(int j = i; j < i + n1; j++) {
                fre2[s2.charAt(j) - 'a']++;
            }

            boolean pre = true;
            for(int j = 0; j < 26; j++) {
                if(fre[j] != fre2[j]) pre = false;
            }

            if(pre) return true; // only return true if match found
        }

        return false;
    }
}
```