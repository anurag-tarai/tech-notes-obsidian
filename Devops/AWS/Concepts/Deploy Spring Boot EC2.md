scp -i "my-ec2-key.pem" farmerconnect-0.0.1-SNAPSHOT.jar  ubuntu@uri:/home/ubuntu/farmer

 java -jar target/farmerconnect-0.0.1-SNAPSHOT.jar 
 
ssh -i "my-ec2-key.pem" ubuntu@uri

Port Running Check
sudo lsof -i :8080

export $(cat .env | xargs)

scp -i "my-ec2-key.pem" JournalAppPractice-0.0.1-SNAPSHOT.jar  ubuntu@uri:/home/ubuntu/journal-app

scp -i "my-ec2-key.pem"   uri:/home/ubuntu/journal-app


nohup java -jar farmerconnect-0.0.1-SNAPSHOT.jar > app.log 2>&1 &

cat journal.log

tail -f journal.log


## DNS
##### Duck DNS

account

anurag.dev051@gmail.com

type

free

token

74c9a1b9-1252-4e03-adda-311a91aed975

token generated

5 minutes ago

created date

8 Nov 2025, 02:21:27


## HTTPS
## 🧩 Step 1 — Update Nginx to use DuckDNS domain

1️⃣ Open your Nginx default config file:

`sudo nano /etc/nginx/sites-available/default`

2️⃣ **Replace everything** inside with this content:

```java
server {
    listen 80;
    server_name farmerconnect.duckdns.org;

    location / {
        proxy_pass http://localhost:8080/;
        proxy_set_header Host $host;
        proxy_set_header X-Real-IP $remote_addr;
        proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
        proxy_set_header X-Forwarded-Proto $scheme;
    }
}
```
3️⃣ Save and exit nano:

- Press **Ctrl + O**, then **Enter** to save.
    
- Press **Ctrl + X** to exit.
    

4️⃣ Test the config for syntax errors:

`sudo nginx -t`

✅ It should say:

`nginx: configuration file /etc/nginx/nginx.conf test is successful`

5️⃣ Restart Nginx to apply changes:

`sudo systemctl restart nginx`