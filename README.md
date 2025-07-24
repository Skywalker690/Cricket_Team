# 🏏 Cricket Team Management API

A simple Spring Boot application that manages cricket team player data, including CRUD operations for player details like name, jersey number, and role. The backend uses JDBC with a MySQL database and exposes RESTful endpoints for integration with frontend apps or tools like Postman.

---

## 🚀 Features

* 📟 Add a new player
* 📋 View all players
* 🔍 View player by ID
* ✏️ Update player details
* ❌ Delete a player
* 💡 Robust error handling with proper HTTP status codes

---

## ⚙️ Tech Stack

* **Backend**: Java, Spring Boot
* **Database**: MySQL
* **ORM**: JDBC Template with custom `RowMapper`
* **API**: RESTful services with JSON
* **Dependency Injection**: Spring `@Autowired` pattern

---

## 📁 Project Structure

```
Cricket_Team/
├── Controller/
│   └── PlayerController.java
├── Service/
│   └── PlayerServices.java
├── Repositry/
│   └── PlayerRepo.java
└── model/
    ├── Player.java
    └── PlayerRowMapper.java
```

---

## 📌 API Endpoints

| Method | Endpoint       | Description         |
| ------ | -------------- | ------------------- |
| GET    | `/player`      | Get all players     |
| GET    | `/player/{id}` | Get player by ID    |
| POST   | `/player`      | Add new player      |
| PUT    | `/player/{id}` | Update player by ID |
| DELETE | `/player/{id}` | Delete player by ID |

---

## 🧪 Sample JSON

### ➕ Add Player (POST `/player`)

```json
{
  "playerName": "Virat Kohli",
  "jerseyNumber": 18,
  "role": "Batsman"
}
```

### ✏️ Update Player (PUT `/player/1`)

```json
{
  "playerName": "Virat Kohli",
  "jerseyNumber": 18,
  "role": "Captain"
}
```

---

## 🛠️ Setup Instructions

### Prerequisites:

* Java 17+
* MySQL running locally (or remote)
* Maven

### 1. Clone the repo:

```bash
git clone https://github.com/your-username/cricket-team-api.git
cd cricket-team-api
```

### 2. Configure database connection in `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/cricket
spring.datasource.username=root
spring.datasource.password=your_password
```

### 3. Run the application:

```bash
./mvnw spring-boot:run
```

### 4. Test the endpoints using Postman or your frontend.

---

## 📄 License

This project is licensed under the MIT License.

---

## 👤 Author

**Sanjo** – [GitHub](https://github.com/Skywalker690)
