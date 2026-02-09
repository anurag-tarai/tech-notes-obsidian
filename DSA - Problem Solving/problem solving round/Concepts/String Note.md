### Removing all non alphabetic or numeric character in a string
```java
String s = "A man, a plan, a canal: Panama";
String str = s.replaceAll("[^a-zA-Z]", "").toLowerCase(); // amanaplanacanalpanama
```

### Checking a Character isLetterOrDigit
```java
Character.isLetterOrDigit(c);
```

### Making A Single Character To Lower Case/Upper
```java
char  c = 'A';

Character.toLowerCase(c); // a

c = 'a';

Character.toUpperCase(c); // A
```