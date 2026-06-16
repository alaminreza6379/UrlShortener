<div align="center">

# 🚀 Url Shortener

### Spring Boot Application

<img src="https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=springboot&logoColor=white" />
<img src="https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk" />
<img src="https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven" />

<p>
An UrlShortener built with Spring Boot.
</p>

</div>

---

## ✨ Features

- 📦 RESTful APIs
- 🗄️ Database Integration (PostgreSQL)
- 📊 Monitoring

---

## 🏗️ Tech Stack

| Technology | Usage |
|------------|--------|
| ☕ Java 21 | Core Language |
| 🍃 Spring Boot | Backend Framework |
| 🗄️ PostgreSQL | Database |
| 📦 Maven | Dependency Management |

---

## 📂 Project Structure

```bash
src
├── main
│   ├── java
│   │   ├── controller
│   │   ├── service
│   │   ├── repository
│   │   ├── entity
│   │   └── dto
│   └── resources
│       ├── application.properties
```

---

## 🚀 Getting Started

### Prerequisites

- Java 21+
- Maven 3.9+
- PostgreSQL

### Installation

```bash
git clone https://github.com/alaminreza6379/UrlShortener.git

cd UrlShortener

mvn clean install

mvn spring-boot:run
```

---

## ⚙️ Environment Variables

Create an `.env` file:

```env
DB_URL=jdbc:mysql://localhost:3306/db
DB_USERNAME=root
DB_PASSWORD=password
JWT_SECRET=your-secret-key
```

---

## 📡 API Example

### Create User

```http
POST /api/shorten
```

Request:

```json
{
  "url": "https://www.google.com"
}
```

Response:

```json
{
  "url": "https://www.google.com",
  "shortUrl": "*****"
}
```

---


## 🤝 Contributing

Contributions are welcome!

```bash
fork → create branch → commit → push → pull request
```

---

## ⭐ Support

If you find this project useful:

🌟 Star the repository

🍴 Fork it

🛠️ Contribute

---

<div align="center">

### Made with ❤️ using Spring Boot

</div>
