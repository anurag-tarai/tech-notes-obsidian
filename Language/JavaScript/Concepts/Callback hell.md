 [Callbacks](Callback%20Functions.md) are functions passed into other functions to run later when an [async](Asynchronous%20programming.md) task finishes, for example:
- “After you fetch data, run this callback.”
- “Inside that callback, after saving to DB, run another callback,” and so on.
## Callback hell happens when:
- You have many async steps that depend on each other, and you keep nesting callbacks inside callbacks.
- The code becomes a deep “pyramid” shape (indent inside indent), very hard to read and maintain.
- Error handling is messy because each nested callback needs its own error checks, and passing errors up becomes confusing.
- Reusing and composing logic is hard because everything is tightly coupled and nested.
	
Before Promises, we used **callbacks**:
```js
doTask1(function(result1) {
  doTask2(result1, function(result2) {
    doTask3(result2, function(result3) {
      console.log("Done!");
    });
  });
});
```

This leads to:
- Pyramid shape
- Hard to read
- Hard to debug
- Hard to handle errors
- Code grows horizontally — “**callback hell**”