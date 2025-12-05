### Spread → expands array
```js
let nums = [1, 2, 3];
let newArr = [...nums, 4, 5];
```

```js
nums = [1, 2, 3]

...nums  →  1, 2, 3
```
##### Spread is used for:
- Copying arrays
- Merging arrays
- Expanding elements
### Rest → packs values into an array
```js
function sum(...nums) {
    return nums.reduce((a, b) => a + b);
}

sum(1, 2, 3, 4);
```

# 🔥 Key Difference

|Operator|Meaning|Works On|
|---|---|---|
|**Spread `...`**|_Expand_ values|Arrays / objects|
|**Rest `...`**|_Collect_ values|Function parameters|
