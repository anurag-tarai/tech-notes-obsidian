| `<a>` Tag                    | `<button>`                              |
| ---------------------------- | --------------------------------------- |
| Designed for **navigation**  | Designed for **actions**                |
| Uses `href` attribute        | Uses JavaScript or form submission      |
| SEO & accessibility friendly | Not meant for navigation                |
| Opens links, pages, sections | Triggers logic (submit, save, API call) |

```html
<!-- Navigation -->
<a href="/home">Home</a>

<!-- Action -->
<button onclick="submitForm()">Submit</button>
```

**Industry rule:**

> Use `<a>` for navigation, `<button>` for actions.