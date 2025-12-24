### `<thead>`
- Groups **header rows**
- Usually contains `<th>`
### `<tbody>`
- Groups **main data rows**
- Contains most `<tr>` and `<td>`
### `<tfoot>`
- Groups **summary or footer rows**
- Can appear before or after `<tbody>` in code

```html
<table>
  <caption>Employee Data</caption>

  <thead>
    <tr>
      <th>Name</th>
      <th>Salary</th>
    </tr>
  </thead>

  <tbody>
    <tr>
      <td>Anurag</td>
      <td>50,000</td>
    </tr>
    <tr>
      <td>Ravi</td>
      <td>45,000</td>
    </tr>
  </tbody>

  <tfoot>
    <tr>
      <td>Total</td>
      <td>95,000</td>
    </tr>
  </tfoot>
</table>
```

