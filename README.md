# Pulse1

Pulse1 is a **real-time healthcare logistics application** that connects healthcare providers with delivery services efficiently. It is designed for fast, scalable, and secure order management, inspired by models like Zepto and Blinkit.  

The project uses **React.js + Tailwind** for frontend, **Spring Boot** for backend, and **MongoDB + SQL** for database management.

---

## Live Website

The frontend of Pulse1 is deployed and can be accessed here:  
[https://pulse1-frontend.onrender.com/](https://pulse1-frontend.onrender.com/)

---

## Features

- Real-time matching of healthcare orders with logistics providers  
- Scalable delivery system for healthcare logistics  
- Razorpay integration for secure payments  
- MongoDB + SQL for efficient data storage and retrieval  
- Easy integration with existing logistics partners  
- Clean and maintainable project structure  

---

## Tech Stack

| Layer       | Technology                   |
|------------|------------------------------|
| Frontend    | React.js, Tailwind CSS        |
| Backend     | Spring Boot                  |
| Database    | MongoDB + SQL                |
| Payment     | Razorpay                     |
| Hosting     | Render (frontend), (backend hosting if applicable) |

---

## Folder Structure

Pulse1/
├── pulse1-frontend/ # React frontend
│ ├── src/
│ ├── public/
│ └── package.json
├── pulse1-backend/ # Spring Boot backend
│ ├── src/main/java/
│ ├── src/main/resources/
│ └── pom.xml
├── .gitignore # Ignored files
├── README.md # This documentation
└── LICENSE # Optional license


**Notes:**  
- `node_modules/`, `.vscode/`, and `pulse1-backend/target/` are ignored by `.gitignore`.  
- Frontend and backend are separated for clarity.  

---

## Installation & Local Setup (for Developers)

### Prerequisites
- Node.js (for frontend)  
- Java & Maven (for backend)  
- MongoDB server running locally or using MongoDB Atlas  

---

### Frontend (Local)

cd pulse1-frontend
npm install
npm start

### Backend (Local)

cd pulse1-backend
mvn clean install
mvn spring-boot:run

## Screenshots

### Frontend Homepage
![Frontend Home](docs/frontend-home.png.png)  

### Backend Dashboard
![Backend Dashboard](docs/backend-dashboard.png.png) 


