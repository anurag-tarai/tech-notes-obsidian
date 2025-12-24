| Location      | Effect                                                                                  |
| ------------- | --------------------------------------------------------------------------------------- |
| `<head>`      | Script loads **before page content**, may block rendering (unless `defer`/`async` used) |
| `<body>`      | Script loads **after HTML content**, page renders first, then JS executes               |
| Best practice | Use `<body>` or `<head defer>` to avoid blocking page load                              |