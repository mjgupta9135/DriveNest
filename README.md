# DriveNest - Next-Gen Cloud Storage & Secure File Sharing Platform

A modern full-stack cloud storage solution where users can upload, manage, and securely share files with public/private controls. Built using **React + Spring Boot + MongoDB + Clerk + Razorpay**.

---

## 🚀 Features
- ✅ Secure File Uploads (MongoDB GridFS)
- ✅ Public / Private Toggle for Files
- ✅ Share Files Publicly via Link
- ✅ Clerk Authentication (Login / Signup)
- ✅ Responsive Dashboard (Grid / List Views)
- ✅ Razorpay Payment Integration (Premium Plans)
- ✅ Delete & Manage Files
- ✅ Global State Management (Context API)

---

## 🛠️ Tech Stack
| Frontend | Backend | Database | Auth | Payments |
|---------|----------|-----------|------|-----------|
| React | Spring Boot | MongoDB | Clerk | Razorpay |

Tailwind CSS • Lucide Icons

---

## 📁 Project Structure
```
DriveNest/
├── frontend/ (React)
│   ├── src/
│   └── public/
├── backend/ (Spring Boot)
│   ├── src/main/java/
│   ├── src/main/resources/
│   └── pom.xml
└── README.md
```

---

## ⚙️ Installation & Setup

### 1️⃣ Backend (Spring Boot)
```
cd backend
mvn spring-boot:run
```
Make sure your `.env` contains DB config:
```
DB_URL=jdbc:mysql://mysql.railway.internal:3306/railway?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC
DB_USERNAME=root
DB_PASSWORD=YOUR_PASSWORD
```

### 2️⃣ Frontend (React)
```
cd frontend
npm install
npm run dev
```

---

## 🔗 Public File Sharing Flow
```
User Uploads File → Mark as Public → Shareable Link Generated → Anyone can Download
```

---

## 📌 Todo / Upcoming Features
- 🔒 JWT based auth fallback
- 📦 Folder support
- 📎 Drag & Drop uploads
- 🔄 Version history

---

## 🤝 Contributing
Feel free to fork the repo and raise a PR.

---

## ✉️ Contact
**Author:** Mrityunjay Kumar Gupta
