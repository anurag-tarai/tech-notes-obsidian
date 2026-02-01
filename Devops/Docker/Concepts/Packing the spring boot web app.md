#### Step 1
Create a spring boot app using spring initializr
#### Step 2
Generate jar file
```sh
mvn package
```
#### Step 3
Create Container From jdk-17
```sh
docker pull eclipse-temurin:17

docker run -it eclipse-temurin:17
```

#### Step 4
Check folder structure of jdk container
```sh
docker exec dreamy_engelbart(container name) ls

```

```output
bin
boot
__cacert_entrypoint.sh
dev
etc
home
lib
lib64
media
mnt
opt
proc
root
run
sbin
srv
sys
tmp
usr
var
```

#### Step 5
Copy to jar to container tmp folder
```java
docker cp target/app.jar dreamy_engelbart:/tmp
```

#### Step 6
Create Image
```sh
docker commit dreamy_engelbart anurag/rest-demo:v1
```

Run it
```sh
docker run anurag/rest-demo:v1
|  Welcome to JShell -- Version 17.0.17
|  For an introduction type: /help intro

jshell> anurag@anurag-IdeaPad-Gaming-3-15ACH6:~/Desktop/RestDocker$ 
```
Its running jshell
Because default command for this container is "jshell"
check by,
```sh
docker ps -a
```

We have to pass an command 
```sh
docker commit --change='CMD ["java","-jar","/tmp/app.jar"]' dreamy_engelbart anurag/rest-demo:v2
```

#### Step 7
Run the container, and it will run that jar file now
```sh
docker run -it anurag/rest-demo:v2
```

#### Step 8
Expose docker 8080 for local access
```sh
docker run -p 8080:8080 anurag/rest-demo:v2
```