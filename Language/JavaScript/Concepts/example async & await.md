> async/await is just a cleaner way to write Promises

## Example :
### Promise-based functions
```js
function fetchUser() {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve({ id: 101, name: "Anurag" });
    }, 2000);
  });
}

function fetchAddress(userId) {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve("Odisha, India");
    }, 1500);
  });
}
```

### Chaining with `.then()`
```js
fetchUser()
  .then(user => {
    console.log("User fetched:", user);

    return fetchAddress(user.id); // IMPORTANT
  })
  .then(address => {
    console.log("Address fetched:", address);
  })
  .catch(error => {
    console.log("Error occurred:", error);
  });
```

### Using `async` & `await`
```js
async function getUserDetails() {
  console.log("Fetching user...");

  const user = await fetchUser();
  console.log("User fetched:", user);

  console.log("Fetching address...");
  const address = await fetchAddress(user.id);
  console.log("Address fetched:", address);

  console.log("Process completed");
}

getUserDetails();
```

Output :
```js
Fetching user...
(after 2 seconds)
User fetched: { id: 101, name: 'Anurag' }
Fetching address...
(after 1.5 seconds)
Address fetched: Odisha, India
Process completed
```