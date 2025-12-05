# ✅ **Practice 1 — Execute callback after a task**
Create a function `doWork` that:
- takes a message
- prints the message
- waits 2 seconds using `setTimeout`
- then calls the callback
**Goal:**
`doWork("Downloading file...", myCallbackFunction);`

Your callback should print something like:  
`"Download complete!"`
Answer :
```js
console.log("-----------Work----------");

function doWork(message, callback){
    console.log(message);
    setTimeout(()=>{
        callback("work is completed! inside dowork!")
    },2000);
}

function workCompleted(message){
    console.log(message);
}

doWork("work started!", workCompleted)
```

---
# ✅ **Practice 2 — Callback with array processing**

Create a function `processArray` that:
- takes an array
- takes a callback
- calls the callback **for each element**

**Goal:**
`processArray([1, 2, 3], double);`
Your callback `double` should print:
`2 4 6`
```js
function processArray(arr, callback){
    arr.forEach(element => {
        callback(element);
    });
}

function multiple(ele){
    console.log(ele*ele);
    
}

processArray([1,2,3,4], multiple)
```
