[1021. Remove Outermost Parentheses](https://leetcode.com/problems/remove-outermost-parentheses/) 

## Counter Approach (Optimal)
- Keep  a counter
- Keep ans string
- If c == 0 --> Don't ad to ans but c++
- else If "(" --> c++ & add to ans
- else If ")" --> c-- & after closing check if counter is zero, if not then add to ans
```java
public String removeOuterParentheses(String s) {  
    int counter = 0;  
    StringBuilder ans = new StringBuilder();  
  
    for(char c : s.toCharArray()){  
        if(counter==0){  
            counter++;  
        }else if(c=='('){  
            counter++;  
            ans.append(c);  
        }else if(c==')'){  
            counter--;  
            if(counter!=0) ans.append(c);  
        }  
    }  
    return ans.toString();  
}
```

Better Writing
```java
for(char c : s.toCharArray()){  
    if(c==')') counter--;  
    if(counter!=0) ans.append(c);  
    if(c=='(') counter++;  
}
```
