### Absolute Path
- The **complete path** of a file or directory starting from the **root**.
- **Always points to the same location**, regardless of the current directory.
- Starts with:
    - `/` in **Linux / macOS**
    - `C:\` (or another drive) in **Windows**
    - `https://` or `/` in **web (HTML)**

**Examples:**
- Linux: `/home/anurag/Documents/file.txt`
- Windows: `C:\Users\Anurag\Documents\file.txt`
- Web: `https://example.com/assets/logo.png`
- Web (root-based): `/assets/logo.png`
    
---
### Relative Path
- The path to a file or directory **relative to the current working directory or current file**.
- **Does not start from the root**.
- Depends on **where you currently are**.

**Examples:**
- Current directory: `/home/anurag`  
    Relative path: `Documents/file.txt`
- Web (same folder): `image.png`
- Web (parent folder): `../image.png`

---
### Key Industry Rule

> **Relative paths depend on context (current directory), while absolute paths are fixed and context-independent.**