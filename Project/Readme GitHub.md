# 🖥️ **Farmer Connect – Frontend (React + Tailwind + Leaflet)**

### 🌾 _Connecting Farmers Directly to Buyers – Location-Based Marketplace_

---

## 🚀 Overview

**Farmer Connect** is a modern, responsive web platform that bridges the gap between **farmers and buyers** by enabling direct, location-based connections.  
Built with **React, Tailwind CSS, and Leaflet (OpenStreetMap)**, the frontend provides an **interactive map-based interface** to explore, search, and view farm products nearby — without middlemen.

---

## 🧩 Key Features

- 🌍 **Location-Based Product Discovery** using Leaflet + OpenStreetMap
    
- 🧭 **Search by keyword, address, or category**
    
- 🧺 **Dynamic Product Cards** – images, prices, categories, and farmer details
    
- 🗺️ **Map Integration** – explore products within a 20 km radius
    
- 🔐 **Secure Login/Signup** via JWT (HTTP-only cookies)
    
- 📱 **Fully Responsive UI** – optimized for mobile and desktop
    
- ⚡ **Lazy Loading & Smooth Animations** using Framer Motion
    
- 🧠 **Role-based Views** – Separate dashboards for farmers and buyers
    
- 📸 **Image Uploads** – AWS S3 integration through backend APIs
    

---

## 🛠️ Tech Stack

|Category|Technology|
|---|---|
|**Frontend Framework**|React.js (Vite)|
|**Styling**|Tailwind CSS|
|**Routing**|React Router v6|
|**Map & Geo**|Leaflet + OpenStreetMap|
|**API Handling**|Axios|
|**Animations**|Framer Motion|
|**Deployment**|Vercel|

---

## ⚙️ Installation & Setup

`# 1️⃣ Clone the repository git clone https://github.com/Anurag-Tarai/krushak-sanyog-frontend.git cd krushak-sanyog-frontend  # 2️⃣ Install dependencies npm install  # 3️⃣ Add environment variables # Create a .env file in the root directory VITE_API_URL=https://farmer-connect-backend.onrender.com/api  # 4️⃣ Start the development server npm run dev`

---

## 🧱 Folder Structure

`src/  ├── components/  │   ├── product/  │   ├── farmer/  │   ├── buyer/  │   └── common/  ├── pages/  ├── Router/  ├── api/  ├── assets/  ├── App.jsx  └── main.jsx`

---

## 🧭 Environment Variables

|Variable|Description|
|---|---|
|`VITE_API_URL`|Backend API base URL|
|`VITE_MAP_API`|(Optional) Map API key for geolocation|

---

## 🌐 Deployment

Deployed on **Vercel**  
👉 Live Site

Backend: Hosted on **Render**  
👉 [Backend Repo](https://github.com/Anurag-Tarai/krushak-sanyog-backend)

---

## 📸 Screenshots

|Home|Map View|Dashboard|
|---|---|---|
||||

---

## 💡 Future Enhancements

- ✅ Comment & Rating System
    
- 📍 Real-time product updates on map
    
- 🧾 Order tracking and analytics
    

---

## 👨‍💻 Author

**Anurag Tarai**  
🌐 [Portfolio](#) • 💼 [LinkedIn](#) • 🐙 [GitHub](https://github.com/Anurag-Tarai)

---

---

# ⚙️ **Farmer Connect – Backend (Spring Boot + MySQL + AWS S3)**

### 🧭 RESTful API powering the Farmer Connect web platform

---

## 🚀 Overview

The **Farmer Connect Backend** is a secure, modular, and cloud-ready API service built with **Spring Boot**, **MySQL (AWS RDS)**, and **AWS S3** for file storage.  
It provides 30+ RESTful endpoints for managing authentication, products, users, and geolocation-based search — all with robust validation and security.

---

## 🔐 Features

- 🧱 **30+ REST APIs** built using Spring Boot and JPA
    
- 🔒 **JWT Authentication** using HTTP-only cookies
    
- ☁️ **AWS S3 Integration** for product image uploads (up to 5 per product)
    
- 🧭 **Geo-based Product Search** – filter by location, name, or category
    
- 🗂️ **Role-based Access Control** (Farmer / Buyer)
    
- 🧾 **Pagination, validation, and error handling**
    
- 🧰 **Clean 3-tier architecture** (Controller → Service → Repository)
    
- 📦 **Deployed on Render** + **MySQL on AWS RDS**
    

---

## 🛠️ Tech Stack

|Category|Technology|
|---|---|
|**Language**|Java 17|
|**Framework**|Spring Boot 3|
|**Security**|Spring Security + JWT|
|**Database**|MySQL (AWS RDS)|
|**ORM**|Hibernate / JPA|
|**Storage**|AWS S3|
|**Build Tool**|Maven|
|**Deployment**|Render|
|**Validation**|Jakarta Validation API|

---

## 🧱 Architecture Overview

`Controller Layer    ↓ Service Layer    ↓ Repository Layer (JPA)    ↓ MySQL (AWS RDS)    ↘    AWS S3 (Image Storage)`

---

## ⚙️ Setup & Installation

### 1️⃣ Clone the repository

`git clone https://github.com/Anurag-Tarai/krushak-sanyog-backend.git cd krushak-sanyog-backend`

### 2️⃣ Configure Environment Variables (`.env` or `application.properties`)

`# Server server.port=8080  # Database spring.datasource.url=jdbc:mysql://your-db-endpoint:3306/farmerconnect spring.datasource.username=your-db-user spring.datasource.password=your-db-password  # AWS S3 aws.accessKey=YOUR_ACCESS_KEY aws.secretKey=YOUR_SECRET_KEY aws.s3.bucket=your-s3-bucket-name  # JWT jwt.secret=your-secret-key jwt.expiration=86400000`

### 3️⃣ Build and Run

`# Build the project mvn clean package  # Run the server java -jar target/farmerconnect-0.0.1-SNAPSHOT.jar`

---

## 🔗 API Highlights

|Endpoint|Method|Description|
|---|---|---|
|`/api/auth/login`|POST|User login|
|`/api/auth/register`|POST|User registration|
|`/api/products`|GET|Get all products|
|`/api/products/add`|POST|Add new product|
|`/api/products/update/{id}`|PUT|Update existing product|
|`/api/products/delete/{id}`|DELETE|Remove product|
|`/api/products/search`|GET|Search products by name/category/address|
|`/api/products/nearby`|GET|Get nearby products (geo-filtered)|
|`/api/wishlist/add/{id}`|POST|Add to wishlist|
|`/api/user/me`|GET|Get current user info|

---

## 🌐 Deployment

- Backend: **Render**
    
- Database: **AWS RDS (MySQL)**
    
- Storage: **AWS S3**
    

🔗 **Live API Base URL:**  
`https://farmer-connect-backend.onrender.com/api`

---

## 📊 Future Roadmap

- 📧 Email verification and password reset
    
- 💬 Buyer-farmer comment system
    
- 📈 Product analytics and dashboard metrics
    
- 🔔 Push notifications for stock updates
    

---

## 👨‍💻 Author

**Anurag Tarai**  
💼 [LinkedIn](#) • 🐙 [GitHub](https://github.com/Anurag-Tarai)