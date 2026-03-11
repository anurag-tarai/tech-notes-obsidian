## Interface
```java
@FunctionalInterface
public interface Greeting{  
    void greet();  
}
```
## Implementation
```java
public class GreetImpl implements Greeting{  
    @Override  
    public void greet() {  
        System.out.println("Hey there, How are you?");  
    }  
}
```
## Now using in Main method
```java
    Greeting greet = new GreetImpl();  
    greet.greet();  
```

A functional interface reference can hold the implementation provided by a lambda expression.
# Use Lambda Expression
```java
Greeting greetHi = ()-> System.out.println("Hi there, how are you!");  
greetHi.greet();  
  
Greeting greetHello = ()-> System.out.println("Hello, Whats app?");  
greetHello.greet();  
  
Greeting greetMorning = ()-> System.out.println("Good Morning");  
greetMorning.greet();
```

### Benifits
1. Concise & Minimal code
2. No need a separate impl class
3. Very easy to give multiple implementation
4. But only work with functional interfaces