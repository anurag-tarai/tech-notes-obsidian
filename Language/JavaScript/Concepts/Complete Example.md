```js
// 1. Check if user is logged in
function checkLogin() {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      const user = { id: 101, name: "Anurag" };  // imagine fetched from local storage
      
      if (user) {
        resolve(user);
      } else {
        reject("User not logged in!");
      }
    }, 1000);
  });
}

// 2. Fetch product details
function fetchProduct() {
  return new Promise((resolve) => {
    setTimeout(() => {
      resolve({ productId: 55, name: "Laptop", stock: 3, price: 55000 });
    }, 1500);
  });
}

// 3. Check stock
function checkStock(product) {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      if (product.stock > 0) {
        resolve(product);
      } else {
        reject("Out of stock!");
      }
    }, 800);
  });
}

// 4. Process payment
function makePayment(product) {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      const success = Math.random() > 0.2; // 80% chance of success
      
      if (success) {
        resolve("Payment Successful!");
      } else {
        reject("Payment Failed!");
      }
    }, 2000);
  });
}

// -------------------------
// Consume the Promise chain
// -------------------------
checkLogin()
  .then(user => {
    console.log("User:", user.name);
    return fetchProduct();
  })
  .then(product => {
    console.log("Product:", product.name, "Price:", product.price);
    return checkStock(product);
  })
  .then(product => {
    console.log("Stock is valid");
    return makePayment(product);
  })
  .then(status => {
    console.log(status);
  })
  .catch(err => {
    console.log("Error:", err);
  })
  .finally(() => {
    console.log("Process completed.");
  });

```

### **Real Output (will vary because of payment success/failure)**

### If everything goes well:
```bash
User: Anurag
Product: Laptop Price: 55000
Stock is valid
Payment Successful!
Process completed.
```

### If payment fails:
```bash
User: Anurag
Product: Laptop Price: 55000
Stock is valid
Error: Payment Failed!
Process completed.
```

### If stock is zero:
```bash
User: Anurag
Product: Laptop Price: 55000
Error: Out of stock!
Process completed.
```