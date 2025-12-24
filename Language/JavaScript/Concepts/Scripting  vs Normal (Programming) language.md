## What is a Scripting Language?
A **scripting language** is mainly used to **automate tasks** and **control other software**.
### Key characteristics:
- **Interpreted** (executed line by line)
- No separate compilation step
- Runs inside another environment (browser, OS, server)
- Faster to write, easier to test
### Examples:
- **JavaScript** (browser, Node.js)
- **Python**
- **Bash / Shell**
- **PHP**
- **Ruby**
### Example (JavaScript script):
```js
console.log("Hello World");
```
👉 Runs directly in browser or Node.js.

### What is a Normal (Programming) Language?
A **programming language** is used to **build full-fledged applications**, systems, and software.

### Key characteristics:
- Usually **compiled** (or compiled + interpreted)
- Generates an executable or bytecode
- Used for large, performance-critical applications
- More strict structure
### Examples:
- **Java**
- **C**
- **C++**
- **C#**
- **Go**
### Example (Java):
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```
👉 Needs compilation before execution.

### Core Differences (Interview Table)

|Feature|Scripting Language|Programming Language|
|---|---|---|
|Execution|Interpreted|Compiled (mostly)|
|Speed|Slower|Faster|
|Use case|Automation, web, glue code|Full applications, systems|
|Compilation|No|Yes|
|Code length|Short & quick|Structured & longer|
|Learning curve|Easier|Moderate to hard|

### There is NO strict rule
Many scripting languages are now **full programming languages**.
### Example:
- **Python** → Scripting + Application development
- **JavaScript** → Frontend + Backend (Node.js)
- **Java** → Uses scripting-style tools (Groovy, Kotlin DSL)
💡 So today, the difference is more about **usage**, not capability.