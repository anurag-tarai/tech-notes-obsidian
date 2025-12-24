```html
<form action="/submit" method="post">
  <fieldset>
    <legend>Personal Information</legend>
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" placeholder="Enter your name" required><br><br>

    <label for="email">Email:</label>
    <input type="email" id="email" name="email" placeholder="Enter your email" required><br><br>

    <label>Gender:</label>
    <input type="radio" name="gender" value="male"> Male
    <input type="radio" name="gender" value="female"> Female<br><br>

    <label>Hobbies:</label>
    <input type="checkbox" name="hobby" value="reading"> Reading
    <input type="checkbox" name="hobby" value="travel"> Travel<br><br>

    <label for="country">Country:</label>
    <select id="country" name="country">
      <option value="india">India</option>
      <option value="usa">USA</option>
    </select><br><br>

    <input type="submit" value="Submit">
    <input type="reset" value="Reset">
  </fieldset>
</form>
```