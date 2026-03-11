Java architecture defines how a Java program is compiled and executed on different platforms. It mainly consists of components like the **JDK, JRE, JVM, and class libraries** that work together to make Java platform-independent.

First, the Java source code (`.java` file) is compiled by the Java compiler into **bytecode** (`.class` file). This bytecode is platform-independent.

Then the **JVM (Java Virtual Machine)** executes this bytecode on any operating system that has a JVM installed. This is why Java follows the principle **“Write Once, Run Anywhere.”**

### Key Components of Java Architecture

1. **JDK (Java Development Kit)**
    - Used for developing Java applications.
    - Includes compiler (`javac`), JRE, and development tools.
2. **JRE (Java Runtime Environment)**
    - Provides environment to run Java programs.
    - Includes JVM + libraries.
3. **JVM (Java Virtual Machine)**
    - Executes the bytecode.
    - Handles memory management, garbage collection, and security.
4. **Class Libraries / APIs**
    - Prebuilt classes like collections, IO, networking, etc.

---
```java
Java Source Code (.java)
        ↓
Compiler (javac)
        ↓
Bytecode (.class)
        ↓
JVM
        ↓
Runs on Any OS
```