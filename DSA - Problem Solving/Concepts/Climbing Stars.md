https://leetcode.com/problems/climbing-stairs/description/ 
![](Screenshot%20from%202026-01-05%2014-48-13.png)
The problem is same as fibonacci series, but for n=0 answer is 1.

Tabulation :
```java
public static int count(int n, int[]dp){
        if(n==0) return 1;
        if(n==1) return 1;

        if(dp[n]!=-1) return dp[n];

        int left = count(n-1, dp);
        int right = count(n-2, dp);
        return dp[n] = left + right;
    }
```

Space Optimization :
```java
public int climbStairs(int n) {  
    if(n<=1) return 1;  
    int prev2 = 1;  
    int prev1 = 1;  
  
    for(int i=2;i<=n;i++){  
        int curr = prev1 + prev2;  
        prev2 = prev1;  
        prev1 = curr;  
    }  
    return prev1;  
}
```

