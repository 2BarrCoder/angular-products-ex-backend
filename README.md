
# 📦 Angular Products Backend API

This project is a **Node.js + Express** backend for managing products via a RESTful API. It is designed to work alongside a frontend Angular application, providing full CRUD functionality with a MySQL database.

---

## 🚀 Features

- ✅ RESTful API for product management
- ✅ Express.js server with modular structure
- ✅ MySQL integration
- ✅ CORS support for frontend communication
- ✅ Ready for production or educational use

---

## 📁 Project Structure

```
angular-products-ex-backend/
├── controller/
│   └── productController.js    # Logic for handling requests
├── model/
│   └── db.js                   # MySQL DB configuration
├── routes/
│   └── productRoutes.js        # API routes for products
├── server.js                   # Main server entry point
└── package.json                # Project metadata and dependencies
```

---

## ⚙️ Installation

### 1. Clone the Repository

```bash
git clone https://github.com/2BarrCoder/angular-products-ex-backend.git
cd angular-products-ex-backend
```

### 2. Install Dependencies

```bash
npm install
```

### 3. Configure MySQL Database

Edit `model/db.js` to match your MySQL configuration:

```js
const db = mysql.createConnection({
  host: 'localhost',
  user: 'root',
  password: '',
  database: 'your_database_name'
});
```

> Ensure that the database exists and matches your table structure.

### 4. Start the Server

```bash
node server.js
```

Server will be running at: [http://localhost:8089](http://localhost:8089)

---

## 📬 API Endpoints

| Method | Endpoint         | Description           |
|--------|------------------|-----------------------|
| GET    | `/products`      | Retrieve all products |
| POST   | `/products`      | Add a new product     |
| PUT    | `/products/:id`  | Update an existing product |
| DELETE | `/products/:id`  | Delete a product      |

### 📦 Sample Request Payload

```json
{
  "name": "Smartphone",
  "description": "A modern device",
  "price": 499.99
}
```

---

## 🛠 Technologies

- Node.js
- Express.js
- MySQL
- CORS
- Body-parser

---

## 📘 Related Projects

- 🔗 [Angular Frontend for this API](https://github.com/2BarrCoder/angular-products-ex-frontend)

---

## 📝 License

This project is licensed under the **MIT License**. Feel free to use, modify, and share.

---

> Made with ❤️ by [2BarrCoder](https://github.com/2BarrCoder)
