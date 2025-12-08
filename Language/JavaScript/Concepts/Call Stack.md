>The **Call Stack** is a component of the JavaScript engine that stores and manages **execution contexts**, allowing JavaScript to track which function is currently running and where to return after each function finishes.  

- It follows a **LIFO (Last In, First Out)** structure.

Since JavaScript is **single-threaded**, the Call Stack ensures that only one piece of code executes at a time.

Whenever a function starts, its **execution context is pushed** onto the stack, and when it completes, the context is **popped off**.

Example :
```js
function f1() {
    console.log('Hi by f1!');
}

function f2() {
    f1();
    console.log('Hi by f2!');
}

f2();
```
**Step 1:** When the code loads in memory, the **global execution context** gets pushed in the stack.
```sql
+---------------------------+
|   Global Execution Context| <---GEC Pushed Onto Call Stack
+---------------------------+
```
**Step 2**: f2() is called
```sql
+---------------------------+
|   f2() Execution Context  | <---f2 EC Pushed Onto Call Stack
+---------------------------+
|   Global Execution Context|
+---------------------------+
```
**Step 3**: f2() calls f1()
```sql
+---------------------------+
|   f1() Execution Context  | <---f1 EC Pushed Onto Call Stack
+---------------------------+
|   f2() Execution Context  |
+---------------------------+
|   Global Execution Context|
+---------------------------+
```
**Step 4:** Inside f1(), console.log() runs
A temporary stack frame for console.log is created.
```sql
+------------------------------+
| console.log('Hi by f1')      | <---log Pushed Onto Call Stack
+------------------------------+
|   f1() Execution Context     |
+------------------------------+
|   f2() Execution Context     |
+------------------------------+
|   Global Execution Context   |
+------------------------------+
```
**Step 5:** console.log and f1() finish → both are popped
```sql
+---------------------------+
|   f2() Execution Context   |
+---------------------------+
| Global Execution Context   |
+---------------------------+
```
**Step 6:** f2() logs its message
console.log inside f2() executes.
```sql
+------------------------------+
| console.log('Hi by f2')      |
+------------------------------+
|   f2() Execution Context     |
+------------------------------+
|   Global Execution Context   |
+------------------------------+
```
console.log pops, then **f2() pops**.

**Final State** (Program Done)
```sql
+---------------------------+
| Global Execution Context  |
| (popped after program end)|
+---------------------------+
```

## [Stack Overflow](Stack%20Overflow.md)