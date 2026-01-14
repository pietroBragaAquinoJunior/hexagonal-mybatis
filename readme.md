# Spring Boot Clean Architecture API (MyBatis)

REST API built with Spring Boot using **Clean Architecture (Ports and Adapters)** and **MyBatis** for explicit SQL control.

---

## 🧱 Architecture
- Clean Architecture (Ports and Adapters / Hexagonal)
- Domain and application layers independent from persistence
- MyBatis adapters for SQL-based data access

---

## ⚙️ Tech Stack
- Java
- Spring Boot
- MyBatis
- H2 Database
- MapStruct
- JUnit & Mockito

---

## 🚀 Key Highlights
- Clean Architecture with MyBatis
- Explicit SQL control through MyBatis mappers
- Clear separation between domain and persistence layers
- Unit and integration tests

---

## ▶️ Running locally
```bash
git clone https://github.com/pietroBragaAquinoJunior/spring-boot-clean-architecture-mybatis
cd spring-boot-clean-architecture-mybatis
./mvnw spring-boot:run
