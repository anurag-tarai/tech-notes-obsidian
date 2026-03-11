# 1️⃣ String Coding Questions (VERY COMMON)

These appear in almost every fresher interview.

1. Reverse a String without using built-in functions `Done`
    
2. Check if a String is a Palindrome `Done`
    
3. Count vowels and consonants in a String
    
4. Find duplicate characters in a String `Done`
    
5. Remove duplicate characters from a String `Done`
    
6. Count frequency of each character in a String `Done`
    
7. Check if two strings are Anagrams `Done`
    
8. Find the first non-repeated character `Done`
    
9. Reverse each word in a sentence `Done`
    
10. Check if String contains only digits
    


---

# 2️⃣ Array Coding Questions (VERY VERY COMMON)

1. Find the largest element in an array
    
2. Find the second largest element
    
3. Reverse an array
    
4. Find duplicate elements in an array
    
5. Remove duplicates from array
    
6. Find missing number in array (1–100 type)
    
7. Move all zeros to end of array
    
8. Find intersection of two arrays
    
9. Find pair with given sum
    
10. Rotate array left/right
    

---

# 3️⃣ Number / Math Problems

1. Check Prime Number
    
2. Print Prime numbers between 1–100
    
3. Fibonacci Series
    
4. Factorial of a number
    
5. Armstrong number
    
6. Palindrome number
    
7. Sum of digits of a number
    
8. Reverse a number
    


---

# 4️⃣ HashMap / Collection Questions (VERY IMPORTANT for Java)

These test **Java Collections knowledge**.

1. Count frequency of elements using HashMap
    
2. Find duplicate elements using HashSet
    
3. Sort HashMap by value
    
4. Find first non-repeating element in array
    
5. Remove duplicates using Set
    
6. Group anagrams using HashMap
    


---

# 5️⃣ Sorting Problems

1. Bubble Sort
    
2. Selection Sort
    
3. Insertion Sort
    
4. Sort array without using `Arrays.sort()`
    
5. Sort string characters
    



---

# 6️⃣ Pattern Programs (VERY COMMON for Freshers)

They ask these to test **loops and logic**.

### Star Pattern

*  
**  
***  
****

### Pyramid

   *  
  ***  
 *****  
*******

### Number Pattern

1  
12  
123  
1234

---

# 7️⃣ Java 8 Coding Questions (Modern Interviews)

If company uses **Java 8+** they may ask:

1. Use Stream to filter even numbers
    
2. Find max element using Stream
    
3. Count duplicates using Stream
    
4. Convert List to Map
    
5. Sort list using Stream
    

Example:

`list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);`

---

# 8️⃣ Linked List Basic Problems

1. Reverse a Linked List
    
2. Find middle element
    
3. Detect loop in Linked List
    

These are sometimes asked if interviewer checks **DSA basics**.

---

# 9️⃣ SQL Coding (Sometimes asked for backend)

Since you are a **backend developer**, they may ask:

1. Find duplicate rows in table
    
2. Second highest salary
    
3. Delete duplicate records
    
4. Join two tables
    
5. Difference between WHERE and HAVING
    

Example:

SELECT salary  
FROM employee  
ORDER BY salary DESC  
LIMIT 1 OFFSET 1;

---

# 🔟 Practical Backend Coding Question

Sometimes they ask **small real-world coding**:

Example:

> Write a Java program to count word frequency in a file.

Example:

Map<String,Integer> map = new HashMap<>();  
  
for(String word : words){  
    map.put(word, map.getOrDefault(word,0)+1);  
}

---

# ⭐ TOP 15 QUESTIONS (MOST IMPORTANT)

If you prepare only these, **80% interviews covered**:

1. Reverse String
    
2. Palindrome String
    
3. Anagram check
    
4. First non-repeating character
    
5. Duplicate characters in string
    
6. Reverse array
    
7. Second largest number
    
8. Missing number in array
    
9. Move zeros to end
    
10. Fibonacci series
    
11. Prime number check
    
12. Factorial program
    
13. Count frequency using HashMap
    
14. Remove duplicates using Set
    
15. Bubble sort