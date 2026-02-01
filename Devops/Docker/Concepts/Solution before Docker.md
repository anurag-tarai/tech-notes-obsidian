## Manual Environment Setup (Most Common)

### 🔧 How it worked
- Developers shared setup steps:
    - Install OS
    - Install Java
    - Install dependencies
    - Configure environment variables
- Everyone followed docs or README files
### ❌ Problems
- Human errors
- Different versions installed
- Time-consuming
- Not reproducible

➡️ Still resulted in:
> 	“It works on my machine”

## 🖥️ Virtualization (Pre-Docker Solution)
### What Is Virtualization?
A virtual machine is software that acts like a real computer, faking the hardware so we can install and run an operating system on it.
![](Screenshot%20from%202026-02-01%2011-44-22.png)

### How it solve the problem ?
Virtual Machines solved environment inconsistency by **packaging the complete environment**—including the **operating system, libraries, runtime, and application**—into a single VM image.  
The same VM image could be run on development, testing, and production machines, ensuring the **environment remained identical everywhere**.
### Problems that still remained

- **Heavyweight**: Each VM needs a full OS
    
- **High resource usage**: More RAM, CPU, and storage
    
- **Slow startup time**
    
- **Difficult to scale quickly**
    
- **Lower performance compared to containers**