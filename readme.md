# 🧑‍💻 Spring Boot Rest API: MyBatis & Direct SQL Persistence

<img width="1000" alt="image" src="https://github.com/user-attachments/assets/71c4e5d5-8e0f-447d-ac74-b064c27f40d4" />

> **💬 Quick Overview:** This project showcases a Spring Boot REST API implementation focusing on **direct SQL persistence** using **MyBatis**. It demonstrates how to leverage MyBatis Mappers for flexible, high-performance data access, offering granular control over SQL statements. It maintains the **Ports and Adapters (Hexagonal) Architecture** to ensure clean separation between the core business logic and the persistence layer.

---

## 🧩 Key Features & Highlights

* **Clean Architecture:** Implements the **Ports and Adapters (Hexagonal) Architecture** for clear separation of concerns, keeping the core business logic independent of the persistence framework.
* **Direct SQL Control:** Utilizes **MyBatis** for data access, allowing for **highly optimized and explicit SQL** queries defined in XML Mappers.
* **Flexible Persistence:** Demonstrates a non-ORM approach to data management, ideal for complex reporting or legacy database integrations.
* **Data Mapping:** Professional object mapping is handled by **MapStruct**, ensuring clean and efficient data transfer between layers (DTOs and Domain).

---

## ⚙️ Tech Stack & Practices

| Category | Technologies / Practices |
| :--- | :--- |
| **Core** | **Spring Boot** (Java) |
| **Persistence** | **MyBatis** (SQL Mapper Framework) |
| **Architecture** | **Ports and Adapters** (Hexagonal), Clean Code |
| **Database** | **H2 Memory Database** |
| **Utilities** | **MapStruct** (Data Mapping),

---

## ⏳ Live Status and Deployment

| Status       | Link |
| :----------- | :--- |
| ✅ finished (no deploy) | -    |

---

## 🛠 Local Installation and Setup
- **Clone the repository**: `git clone https://github.com/pietroBragaAquinoJunior/spring-boot-clean-arch-mybatis-api/`
- **Navigate to the directory**: `cd spring-boot-clean-arch-mybatis-api`
- **Build and Run**: Use your preferred IDE (like IntelliJ IDEA) to run the Spring Boot application, or use the Maven/Gradle wrapper:
    - **Maven**: `./mvnw spring-boot:run`
    - **Gradle**: `./gradlew bootRun`
