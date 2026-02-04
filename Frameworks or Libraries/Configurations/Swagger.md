```xml
   <dependency>
      <groupId>org.springdoc</groupId>
      <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
      <version>2.8.15</version>
   </dependency>
```


# Code
Folder Structure:
```bash
 src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── skillovilla
│   │   │           └── jobapp
│   │   │               ├── controller
│   │   │               │   ├── HealthCheck.java
│   │   │               │   ├── JobController.java
│   │   │               │   └── UserProfileController.java
│   │   │               ├── dto
│   │   │               │   ├── JobDTO.java
│   │   │               │   └── UserProfileDTO.java
│   │   │               ├── entity
│   │   │               │   ├── Job.java
│   │   │               │   └── UserProfile.java
│   │   │               ├── exception
│   │   │               │   └── GlobalExceptionHandler.java
│   │   │               ├── JobBoardApplication.java
│   │   │               ├── repository
│   │   │               │   ├── JobRepository.java
│   │   │               │   └── UserProfileRepository.java
│   │   │               └── service
│   │   │                   ├── Impl
│   │   │                   │   ├── JobServiceImpl.java
│   │   │                   │   └── UserProfileServiceImpl.java
│   │   │                   ├── JobService.java
│   │   │                   └── UserProfileService.java
│   │   └── resources
│   │       ├── application.properties
│   │       ├── static
│   │       └── templates
```

### Entities
```java
package com.skillovilla.jobapp.entity;  
  
  
import lombok.Builder;  
import lombok.Data;  
  
@Builder  
@Data  
public class Job {  
    private long id;  
    private String jobProfile;  
    private String employer;  
    private String skills;  
    private Double offeredSalary;  
}
```

```java
package com.skillovilla.jobapp.entity;  
  
  
import lombok.Builder;  
import lombok.Data;  
  
@Builder  
@Data  
public class UserProfile {  
    private String name;  
    private Integer age;  
    private String skill;  
    private Double expectedSalary;  
}
```

### Repository
```java
package com.skillovilla.jobapp.repository;  
  
import com.skillovilla.jobapp.entity.UserProfile;  
import org.springframework.stereotype.Repository;  
  
import java.util.ArrayList;  
import java.util.List;  
  
@Repository  
public class UserProfileRepository{  
    private final List<UserProfile> userProfileList = new ArrayList<>();  
  
    public boolean saveUser(UserProfile userProfile){  
       return userProfileList.add(userProfile);  
    }  
  
    public List<UserProfile> getAll(){  
        return userProfileList;  
    }  
}
```

```java
package com.skillovilla.jobapp.repository;  
  
import com.skillovilla.jobapp.dto.JobDTO;  
import com.skillovilla.jobapp.entity.Job;  
import com.skillovilla.jobapp.entity.UserProfile;  
import org.springframework.stereotype.Repository;  
  
import java.util.ArrayList;  
import java.util.List;  
  
@Repository  
public class JobRepository {  
    private final List<Job> jobList = new ArrayList<>();  
  
    public boolean save(Job job){  
        return jobList.add(job);  
    }  
  
    public List<Job> getAll(){  
        return jobList;  
    }  
  
}
```

### DTO
```java
package com.skillovilla.jobapp.dto;  
  
import lombok.Builder;  
import lombok.Data;  
import lombok.NonNull;  
  
@Builder  
@Data  
public class JobDTO {  
  
    @NonNull  
    private Long id;  
    private String jobProfile;  
    private String employer;  
    private String skills;  
    private Double offeredSalary;  
}
```

```java
package com.skillovilla.jobapp.dto;  
  
import jakarta.validation.constraints.NotBlank;  
import jakarta.validation.constraints.NotNull;  
import lombok.Builder;  
import lombok.Data;  
  
@Data  
@Builder  
public class UserProfileDTO {  
    @NotBlank(message = "Name should not null")  
    private String name;  
  
    @NotNull(message = "age should not null")  
    private Integer age;  
  
    @NotBlank(message = "skill should not empty")  
    private String skill;  
  
  
    private Double expectedSalary;  
}
```

### Service 
```java
package com.skillovilla.jobapp.service;  
  
  
import com.skillovilla.jobapp.dto.JobDTO;  
import com.skillovilla.jobapp.entity.Job;  
  
import java.util.List;  
  
public interface JobService {  
    JobDTO save(JobDTO jobDTO);  
  
    List<Job> getAllJobs();  
}
```

```java
package com.skillovilla.jobapp.service;  
  
import com.skillovilla.jobapp.dto.UserProfileDTO;  
import com.skillovilla.jobapp.entity.UserProfile;  
  
import java.util.List;  
  
public interface UserProfileService {  
    UserProfileDTO createUserProfile(UserProfileDTO userProfileDTO);  
  
    List<UserProfile> getAllUser();  
}
```

### Service Impl
```java
package com.skillovilla.jobapp.service.Impl;  
  
import com.skillovilla.jobapp.dto.JobDTO;  
import com.skillovilla.jobapp.entity.Job;  
import com.skillovilla.jobapp.repository.JobRepository;  
import com.skillovilla.jobapp.service.JobService;  
import org.springframework.stereotype.Service;  
  
import java.util.List;  
  
@Service  
public class JobServiceImpl implements JobService {  
  
    private final JobRepository jobRepository;  
  
    public JobServiceImpl(JobRepository jobRepository) {  
        this.jobRepository = jobRepository;  
    }  
  
    @Override  
    public JobDTO save(JobDTO jobDTO) {  
        Job job = Job.builder()  
                .id(jobDTO.getId())  
                .jobProfile(jobDTO.getJobProfile())  
                .employer(jobDTO.getEmployer())  
                .skills(jobDTO.getSkills())  
                .offeredSalary(jobDTO.getOfferedSalary())  
                .build();  
        jobRepository.save(job);  
        return jobDTO;  
    }  
  
    @Override  
    public List<Job> getAllJobs() {  
        return jobRepository.getAll();  
    }  
}
```

```java
package com.skillovilla.jobapp.service.Impl;  
  
import com.skillovilla.jobapp.dto.UserProfileDTO;  
import com.skillovilla.jobapp.entity.UserProfile;  
import com.skillovilla.jobapp.repository.UserProfileRepository;  
import com.skillovilla.jobapp.service.UserProfileService;  
import org.springframework.stereotype.Service;  
  
import java.util.List;  
  
@Service  
public class UserProfileServiceImpl implements UserProfileService {  
  
    private final UserProfileRepository userProfileRepository;  
  
    public UserProfileServiceImpl(UserProfileRepository userProfileRepository) {  
        this.userProfileRepository = userProfileRepository;  
    }  
  
    @Override  
    public UserProfileDTO createUserProfile(UserProfileDTO userProfileDTO) {  
        UserProfile userProfile1 = UserProfile.builder()  
                .name(userProfileDTO.getName())  
                .skill(userProfileDTO.getSkill())  
                .age(userProfileDTO.getAge())  
                .expectedSalary(userProfileDTO.getExpectedSalary())  
                .build();  
  
        if(!userProfileRepository.saveUser(userProfile1))  
            throw new RuntimeException("Something went wrong during creating user");  
        return userProfileDTO;  
    }  
  
    @Override  
    public List<UserProfile> getAllUser() {  
        return userProfileRepository.getAll();  
    }  
}
```

### Controller
```java
package com.skillovilla.jobapp.controller;  
  
import com.skillovilla.jobapp.dto.JobDTO;  
import com.skillovilla.jobapp.entity.Job;  
import com.skillovilla.jobapp.service.JobService;  
import jakarta.validation.Valid;  
import org.springframework.http.HttpStatus;  
import org.springframework.http.ResponseEntity;  
import org.springframework.web.bind.annotation.*;  
  
import java.util.List;  
  
@RestController  
@RequestMapping("/api/v1/job")  
public class JobController {  
    private final JobService jobService;  
  
    public JobController(JobService jobService) {  
        this.jobService = jobService;  
    }  
  
    @PostMapping  
    public ResponseEntity<JobDTO> addJob(@Valid @RequestBody JobDTO jobDTO){  
        return new ResponseEntity<>(  
                jobService.save(jobDTO), HttpStatus.CREATED);  
    }  
  
    @GetMapping  
    public ResponseEntity<List<Job>> getAllJobs(){  
        return new ResponseEntity<>(  
                jobService.getAllJobs(), HttpStatus.OK);  
    }  
}
```

```java
package com.skillovilla.jobapp.controller;  
  
import com.skillovilla.jobapp.dto.UserProfileDTO;  
import com.skillovilla.jobapp.entity.UserProfile;  
import com.skillovilla.jobapp.service.UserProfileService;  
import jakarta.validation.Valid;  
import org.springframework.http.HttpStatus;  
import org.springframework.http.ResponseEntity;  
import org.springframework.web.bind.annotation.*;  
  
import java.util.List;  
  
@RestController  
@RequestMapping("/api/v1/user")  
public class UserProfileController {  
  
    private final UserProfileService userProfileService;  
  
    public UserProfileController(UserProfileService userProfileService) {  
        this.userProfileService = userProfileService;  
    }  
  
    @PostMapping  
    public ResponseEntity<UserProfileDTO> createUserProfile(@Valid @RequestBody UserProfileDTO userProfileDTO){  
        return new ResponseEntity<>(  
                userProfileService.createUserProfile(userProfileDTO), HttpStatus.CREATED);  
    }  
  
    @GetMapping  
    public ResponseEntity<List<UserProfile>> getAllUsers(){  
        return new ResponseEntity<>(  
                userProfileService.getAllUser(), HttpStatus.OK);  
    }  
}
```

```java
package com.skillovilla.jobapp.controller;  
  
  
import org.springframework.http.HttpStatus;  
import org.springframework.http.ResponseEntity;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController;  
  
@RestController  
public class HealthCheck {  
  
    @GetMapping("/health")  
    public ResponseEntity<String> healthCheck(){  
        return new ResponseEntity<>("HEALTH OK", HttpStatus.OK);  
    }  
}
```

### Exception
```java
package com.skillovilla.jobapp.exception;  
  
import org.springframework.http.HttpStatus;  
import org.springframework.http.ResponseEntity;  
import org.springframework.web.bind.annotation.ExceptionHandler;  
import org.springframework.web.bind.annotation.RestControllerAdvice;  
  
@RestControllerAdvice  
public class GlobalExceptionHandler {  
  
    @ExceptionHandler(RuntimeException.class)  
    public ResponseEntity<String> runTimeExceptionHandler(RuntimeException ex){  
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);  
    }  
}
```
