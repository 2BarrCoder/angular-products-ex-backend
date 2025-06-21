
# 🧩 Angular Products Backend (Spring Boot)

This is the **Java Spring Boot backend** for the Angular Products application. It provides a RESTful API to manage products and is intended to work with the Angular frontend client.

---
📌 Frontend Repo: [angular-products-ex-frontend](https://github.com/2BarrCoder/angular-products-ex-frontend)  
🔗 Backend Repo: [angular-products-ex-backend](https://github.com/2BarrCoder/angular-products-ex-backend)
## 🚀 Features

- RESTful API using Spring Boot
- Product CRUD operations
- Integrated with a MySQL database
- Layered architecture (Controller, Model, Repository)
- Maven project with wrapper support

---

## 🗂️ Project Structure

```
angular-products-ex-backend/
├── src/
│   ├── main/
│   │   ├── java/com/angularbackend/angularproductsbackend/
│   │   │   ├── controller/       # REST API controllers
│   │   │   ├── model/            # Product entity
│   │   │   └── repository/       # JPA repository interface
│   │   └── resources/
│   │       └── application.properties
│   └── test/                     # Unit tests
├── pom.xml                       # Maven config file
├── mvnw / mvnw.cmd              # Maven wrapper
└── README.md
```

---

## ⚙️ Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/2BarrCoder/angular-products-ex-backend.git
cd angular-products-ex-backend
```

### 2. Configure the Database

Edit `src/main/resources/application.properties` to match your MySQL setup:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### 3. Run the Application

Using Maven wrapper:

```bash
./mvnw spring-boot:run
```

Or with installed Maven:

```bash
mvn spring-boot:run
```

---

## 🔌 API Endpoints

| Method | Endpoint         | Description               |
|--------|------------------|---------------------------|
| GET    | `/products`      | Get all products          |
| DELETE | `/products/{id}` | Delete a product by ID    |

> Controller classes: `ProductRestApi`, `ProductsController`

---

## 🧪 Testing

---

![image](https://github.com/user-attachments/assets/ec568f33-744d-4f0f-aabe-72b61ad3bf32)
![image](https://github.com/user-attachments/assets/5df04f70-e06f-4659-9888-d6d04be5d9d6)
![image](https://github.com/user-attachments/assets/cc6ba8b3-57e6-4466-a040-72fed31a616a)
![image](https://github.com/user-attachments/assets/7a5ac911-9b5b-4d8b-bd6e-2b7e93cbe03f)

---

> Created with ❤️ by [2BarrCoder](https://github.com/2BarrCoder)
