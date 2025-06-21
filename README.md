
# 🧩 Angular Products Backend (Spring Boot)

This is the **Java Spring Boot backend** for the Angular Products application. It provides a RESTful API to manage products and is intended to work with the Angular frontend client.

---

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

Run unit tests using:

```bash
mvn test
```

---

## 📝 License

This project is licensed under the **MIT License**. See the `LICENSE` file for details.

---

> Created with ❤️ by [2BarrCoder](https://github.com/2BarrCoder)
