## Brute force
If number is divisible by any number from 2  to n-1, then its no prime
```java
public static boolean primeCheck(int n){  
    if(n<=1) return false;  
    for(int i=2; i<n; i++){  
        if(n%i==0) return false;  
    }  
    return true;  
}
```

---
## Optimal 
```java
public static boolean primeCheck(int n){
    if(n <= 1) return false;

    for(int i = 2; i * i <= n; i++){
        if(n % i == 0)
            return false;
    }
    return true;
}
```
### Why not check till `n-1`?

Too slow.

### Why not check till `n/2`?

Still unnecessary.

### ✅ Why √n?

If `n` is **not prime**, it can be written as:

n = a × b

If **both** `a` and `b` were greater than √n:

a > √n and b > √n

⇒ a × b > n  ❌ (impossible)

👉 So **at least one factor must be ≤ √n**

That’s why:

i * i <= n

means:

i ≤ √n