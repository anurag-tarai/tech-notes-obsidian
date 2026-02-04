An **Armstrong number** is a number that is **equal to the sum of its own digits, each raised to the power of the number of digits**.

Example :
```java
1³ + 5³ + 3³
= 1 + 125 + 27
= 153 ✅
```

```java
3³ + 7³ + 0³
= 27 + 343 + 0
= 370 ✅
```

```java
public static boolean armstrong(int n){  
    int num = n;  
    int c = 0;  
  
    while(num>0){  
        c++;  
        num = num/10;  
    }  
    num = n;  
    int sum = 0;  
    while(num>0){  
        int a = num%10;  
        sum+= (int) Math.pow(a, c);  
        num = num/10;  
    }  
    System.out.println(sum);  
    return n==sum;  
}
```

```java
int count = String.valueOf(Math.abs(num)).length();
```
⚠️ Works, but **less preferred** in interviews.
