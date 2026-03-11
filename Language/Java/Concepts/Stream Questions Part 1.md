# Basic Stream Coding Questions

1. **Print all even numbers from a list** `Done`
2. **Print all odd numbers from a list** `Done`
3. **Find the sum of all numbers in a list** `Done`
4. **Find the maximum number in a list** `Done`
5. **Find the minimum number in a list** `Done`
6. **Count the total number of elements in a list** `Done`
7. **Remove duplicate elements from a list** `Done`
8. **Sort a list in ascending order** `Done`
9. **Sort a list in descending order** `Done`
10. **Square every number in a list** `Done`

#### Answers
```java
Basic
1. List<Integer> filteredList = list.stream().filter(a->a%2==0).toList();
   
2.  List<Integer> list1 = list.stream().filter(x->x%2!=0).toList();
   
3. int total = list.stream().reduce(0, (a,b)->a+b);
   
4. int ans = list.stream().reduce(Integer.MIN_VALUE, (a,b)->a>b?a:b);
5. int ans = list.stream().reduce(Integer.MAX_VALUE, (a,b)->a<b?a:b);
   
6. long n = list.stream().count();
   
7. List<Integer> distnctList =list.stream().distinct().toList();
   
8.  List<Integer> sortedAsc = list.stream().sorted().toList();
9. List<Integer> sortedDes = list.stream().sorted((a,b)->b-a).toList();
   
10. List<Integer> squaredList = list.stream().map(x->x*x).toList();
```

---

# String Stream Questions

11. **Convert all strings in a list to uppercase**
    
12. **Convert all strings in a list to lowercase**
    
13. **Find all strings starting with "A"**
    
14. **Find all strings with length greater than 5**
    
15. **Sort strings by length**
    

---

# Intermediate Level Questions

16. **Find the first element in a list**
    
17. **Find any element in a list**
    
18. **Find numbers greater than 10**
    
19. **Limit the stream to first 5 elements**
    
20. **Skip the first 3 elements**
    

---

# Important Interview Stream Problems

21. **Find duplicate elements in a list**
    
22. **Find unique elements in a list**
    
23. **Find the second highest number in a list**
    
24. **Find the second smallest number in a list**
    
25. **Find the average of numbers in a list**
    

---

# String + Stream Problems

26. **Count frequency of each element in a list**
    
27. **Find duplicate characters in a string**
    
28. **Find first non-repeated character in a string**
    
29. **Find first repeated character in a string**
    
30. **Count occurrences of each character in a string**
    

---

# Slightly Advanced (Very Common in Interviews)

31. **Group numbers by even and odd**
    
32. **Find the most frequent element in a list**
    
33. **Find the longest string in a list**
    
34. **Find the shortest string in a list**
    
35. **Sort a list of objects by a field using a  
    Comparator**