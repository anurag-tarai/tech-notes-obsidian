This document explains how to integrate AWS S3 for file uploads in a Spring Boot application, including JWT-secured APIs, handling multipart files, and best practices for credentials and bucket settings.

---
## 1. Setup AWS S3

1. Login to AWS console as an **IAM user**.
2. Create a **bucket**:
   - Example: `anurags-first-bucket-10-2025`
   - Region: `ap-south-1` 
1. Bucket settings:
   - **Block all public access**: optional, can allow public-read if needed.
   - **Object Ownership**: set to **Bucket owner enforced** (ACLs disabled).
4. IAM Policy for the user:

```json
{
  "Effect": "Allow",
  "Action": ["s3:GetObject"],
  "Resource": ["arn:aws:s3:::YOUR_BUCKET_NAME/*"]
}
```
5. Create **Access Keys** for the IAM user for programmatic access.
## 2. Setup Environment Variables

- Do **not** hardcode credentials.
- Use environment variables (or `.env` for local dev):
```java
AWS_ACCESS_KEY_ID=YOUR_ACCESS_KEY
AWS_SECRET_ACCESS_KEY=YOUR_SECRET_KEY
AWS_REGION=ap-south-1
BUCKET_NAME=anurags-first-bucket-10-2025
```
## 3. application.properties
```bash
application.bucket.name=${BUCKET_NAME}
cloud.aws.region.static=${AWS_REGION}
cloud.aws.credentials.access-key=${AWS_ACCESS_KEY_ID}
cloud.aws.credentials.secret-key=${AWS_SECRET_ACCESS_KEY}
```
## 4. AWS S3 Configuration
```java
@Configuration
public class S3Config {

    @Value("${cloud.aws.region.static}")
    private String region;

    @Value("${cloud.aws.credentials.access-key}")
    private String accessKey;

    @Value("${cloud.aws.credentials.secret-key}")
    private String secretKey;

    @Bean
    public S3Client s3Client() {
        AwsBasicCredentials creds = AwsBasicCredentials.create(accessKey, secretKey);
        return S3Client.builder()
                .region(Region.of(region))
                .credentialsProvider(StaticCredentialsProvider.create(creds))
                .build();
    }
}
```
## 5. S3 Service
```java
@Service
@RequiredArgsConstructor
public class S3Service {

    private final S3Client s3Client;

    @Value("${application.bucket.name}")
    private String bucketName;

    public String uploadFile(MultipartFile file, String folderName) throws IOException {
        if (file == null || file.isEmpty()) {
            throw new IllegalArgumentException("File is empty");
        }

        String key = folderName + "/" + UUID.randomUUID() + "-" + file.getOriginalFilename();

        PutObjectRequest putObjectRequest = PutObjectRequest.builder()
                .bucket(bucketName)
                .key(key)
                .contentType(file.getContentType())
                .build(); // Do NOT set ACL if bucket has ACLs disabled

        s3Client.putObject(putObjectRequest, RequestBody.fromBytes(file.getBytes()));

        return "https://" + bucketName + ".s3.amazonaws.com/" + key;
    }
}
```
## 6. Service Layer: Upload Multiple Files
```java
@Override
public Product addProduct(ProductDTO dto, MultipartFile[] images) throws IOException {
    if (images == null || images.length == 0) {
        throw new IllegalArgumentException("At least 1 image is required");
    }

    boolean hasValidFile = Arrays.stream(images)
            .anyMatch(file -> file != null && !file.isEmpty());

    if (!hasValidFile) {
        throw new IllegalArgumentException("At least 1 non-empty image is required");
    }

    if (images.length > 5) {
        throw new IllegalArgumentException("Maximum 5 images allowed");
    }

    Product product = new Product();
    product.setName(dto.getName());
    product.setDescription(dto.getDescription());
    product.setCategory(dto.getCategory());
    product.setQuantity(dto.getQuantity());
    product.setAvailable(dto.isAvailable());
    product.setLatitude(dto.getLatitude());
    product.setLongitude(dto.getLongitude());
    product.setAddress(dto.getAddress());
    product.setFarmerId(dto.getFarmerId());
    product.setVariants(dto.getVariants());

    List<String> imageUrls = new ArrayList<>();
    for (MultipartFile file : images) {
        if (file != null && !file.isEmpty()) {
            String imageUrl = s3Service.uploadFile(file, "products");
            imageUrls.add(imageUrl);
        }
    }
    product.setImageUrls(imageUrls);

    return productRepository.save(product);
}
```

## 7. Controller: Multipart Request
```java
@PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
public ResponseEntity<Product> addProduct(
        @RequestPart("product") ProductDTO productDTO,
        @RequestPart("images") MultipartFile[] images
) throws IOException {
    Product product = productService.addProduct(productDTO, images);
    return new ResponseEntity<>(product, HttpStatus.CREATED);
}
```

## 8. cURL / Postman Example
```java
curl -X POST 'http://localhost:8080/api/v1/products' \
  -H 'Authorization: Bearer YOUR_JWT_TOKEN' \
  -F 'product={
        "name": "Tomato",
        "description": "Fresh organic tomatoes",
        "quantity": 100,
        "category": "Vegetables",
        "latitude": 18.5204,
        "longitude": 73.8567,
        "address": "Pune, Maharashtra",
        "farmerId": 1,
        "variants": "Cherry, Desi",
        "available": true
      };type=application/json' \
  -F 'images=@"/path/to/photo1.png"' \
  -F 'images=@"/path/to/photo2.png"'
```