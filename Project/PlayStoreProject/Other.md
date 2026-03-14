1️⃣ Updated Folder Structure (VERY IMPORTANT)

Each service should follow this structure:

auth-service
 ├── controller
 ├── service
 ├── repository
 ├── entity
 ├── dto
 ├── exception
 ├── config
 └── mapper

app-service
 ├── controller
 ├── service
 ├── repository
 ├── entity
 ├── dto
 ├── exception
 ├── config
 └── mapper

interaction-service
 ├── controller
 ├── service
 ├── repository
 ├── entity
 ├── dto
 ├── exception
 ├── client
 └── mapper
2️⃣ DTO Layer (Important Missing Part)

Never return entity directly in microservices.

UserDTO
@Getter
@Setter
public class UserDTO {

    private Long id;
    private String name;
    private String email;
    private String role;

}
RegisterRequestDTO
@Getter
@Setter
public class RegisterRequestDTO {

    private String name;
    private String email;
    private String password;

}
ApplicationDTO
@Getter
@Setter
public class ApplicationDTO {

    private Long id;
    private String name;
    private String version;
    private Double averageRating;
    private Long downloadsCount;
}
ReviewDTO
@Getter
@Setter
public class ReviewDTO {

    private Long userId;
    private Long appId;
    private Integer rating;
    private String reviewDescription;
}
3️⃣ Mapper (Entity → DTO)
UserMapper
public class UserMapper {

    public static UserDTO toDTO(User user){

        UserDTO dto = new UserDTO();

        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        dto.setRole(user.getRole());

        return dto;
    }
}
4️⃣ Update AuthController (Use DTO)
@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserDTO> register(@RequestBody RegisterRequestDTO request){

        User user = userService.register(request);

        return ResponseEntity.ok(UserMapper.toDTO(user));
    }

}
5️⃣ Update UserService
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final PasswordEncoder encoder;

    public User register(RegisterRequestDTO request){

        if(repository.findByEmail(request.getEmail()).isPresent()){
            throw new EmailAlreadyExistsException("Email already registered");
        }

        User user = new User();

        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(encoder.encode(request.getPassword()));
        user.setRole("USER");
        user.setCreatedDate(LocalDateTime.now());

        return repository.save(user);
    }
}
6️⃣ Custom Exceptions (Important for Interview)
ResourceNotFoundException
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message){
        super(message);
    }

}
EmailAlreadyExistsException
public class EmailAlreadyExistsException extends RuntimeException{

    public EmailAlreadyExistsException(String message){
        super(message);
    }

}
InvalidOperationException
public class InvalidOperationException extends RuntimeException{

    public InvalidOperationException(String message){
        super(message);
    }

}
7️⃣ Improved Global Exception Handler
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleNotFound(ResourceNotFoundException ex){

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(ex.getMessage());
    }

    @ExceptionHandler(EmailAlreadyExistsException.class)
    public ResponseEntity<String> handleDuplicate(EmailAlreadyExistsException ex){

        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGeneral(Exception ex){

        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ex.getMessage());
    }

}
8️⃣ Interaction Service Improvement

When a review is created:

1️⃣ Check App exists via Feign
2️⃣ Save review
3️⃣ Send notification

Example:

@Service
@RequiredArgsConstructor
public class ReviewService {

    private final ReviewRepository repository;
    private final AppClient appClient;

    public Review addReview(Review review){

        ApplicationDTO app = appClient.getApp(review.getAppId());

        if(app == null){
            throw new ResourceNotFoundException("App not found");
        }

        review.setCreatedDate(LocalDateTime.now());

        return repository.save(review);
    }

}
9️⃣ Feign Client DTO

Feign should not return Entity.

@Getter
@Setter
public class ApplicationDTO {

    private Long id;
    private String name;
    private Boolean visibility;

}
🔟 Security Config (Auth Service)
@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
1️⃣1️⃣ One Important API Missing

Add this in AppController:

@GetMapping("/{id}")
public Application getApp(@PathVariable Long id){

    return service.getAppById(id);
}

Service:

public Application getAppById(Long id){

    return repository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("App not found"));
}

Feign needs this API.

1️⃣2️⃣ Final Architecture
Eureka Server

Auth Service
  └── Users + Security

App Service
  └── Applications + Categories

Interaction Service
  ├── Reviews
  ├── Downloads
  └── Notifications

Communication via Feign Client.