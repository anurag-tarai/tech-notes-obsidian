# Hosting a Static Website on Amazon S3

## 1. Create an S3 Bucket
- Name the bucket (can match your domain for custom domains).
- Choose AWS region.
- Uncheck **Block all public access** (you’ll allow public access later).

## 2. Upload Website Files
- Upload HTML, CSS, JS, images, etc.
- Ensure `index.html` exists (main page).

## 3. Enable Static Website Hosting
- Go to **Properties → Static website hosting → Enable**.
- Set:
  - **Index document**: `index.html`
  - **Error document**: `404.html` (optional)

## 4. Set Bucket Policy for Public Access
```json
{
  "Version":"2012-10-17",
  "Statement":[
    {
      "Sid":"PublicReadGetObject",
      "Effect":"Allow",
      "Principal": "*",
      "Action":["s3:GetObject"],
      "Resource":["arn:aws:s3:::your-bucket-name/*"]
    }
  ]
}
```
