Instead of `.catch()`, we use `try...catch`.
```js
async function getData() {
  try {
    const user = await fetchUser();
    console.log(user);
    const address = await fetchAddress(user.id);
    consolde.log(address);
  } catch (error) {
    console.log("Error occurred:", error);
  }
}
```
async/await is **more readable and maintainable**

Promise Way :
```js
fetchUser()
  .then(user => fetchAddress(user.id))
  .then(address => console.log(address))
  .catch(err => console.log(err));
```
