# 🚀 API Automation Framework (DHL Mock Services)

A scalable API automation framework built using **Java, RestAssured, TestNG**.

This project demonstrates real-world API automation structure with clean separation of API clients, test layers, and reusable utilities.

---

## 🧠 Key Highlights

- REST API automation using RestAssured
- Modular API client design (service-based architecture)
- Reusable base client for common configurations
- Externalized test data management (JSON-based)
- Clean separation of test, client, and factory layers
- TestNG-based execution framework
- Flexible API methods with backward compatibility
- Maintainable and scalable structure
- Suitable for CI/CD pipeline integration

---

## 🏗️ Framework Architecture

src
├── main/java

│ └── com.framework.api

│ ├── client

│ │ ├── DHLBaseClient

│ │ ├── DHLPickupsApiClient

│ │ ├── DHLShipmentsApiClient

│ │ └── DHLAddressValidationApiClient

│ ├── constants

│ │ └── DHLApiConstants

│ └── factory

│ └── TestDataFactory
│
└── test/java

└── com.framework.tests.dhl

├── DhlPickupsApiTests

├── DHLShipmentsApiTests

└── DHLAddressValidationApiTests



---

## ⚙️ Tech Stack

- Java 11+
- RestAssured
- TestNG
- Maven
- JSON Test Data
- Git

---

## 📌 Features

### 🔹 API Client Layer
Each domain has its own client:
- DHLPickupsApiClient
- DHLShipmentsApiClient
- DHLAddressValidationApiClient

👉 Ensures clean separation of API logic.

---

### 🔹 Base Client
- Centralized base URI configuration
- Common headers applied globally
- UUID-based request tracking
- Reusable request specification

---

### 🔹 Test Data Management
- JSON-based payloads
- Centralized TestDataFactory
- Clean separation of data and test logic

---

### 🔹 Test Design
- Arrange → Act → Assert structure
- Minimal noise in test layer
- Focus on validation only

---

### 🔹 Flexible API Methods
Supports:
- Simple usage (default parameters)
- Advanced usage (custom inputs)

---

## 🧪 Sample Test Flow

```java
Response response = client.createShipment(payload);

Assert.assertTrue(
    response.statusCode() == 200 || response.statusCode() == 201
);
```


---

## 📊 Validation Strategy

The framework follows a flexible and real-world API validation approach:

- HTTP status code validation for all API responses  
- Support for multiple success conditions (200 / 201 / 202 / 204)  
- Response-based assertions where business validation is required  
- Ensures API behavior aligns with expected contract outcomes  

---

## 🔄 Design Principles Followed

The framework is designed using clean and scalable SDET architecture principles:

- Separation of concerns (Test Layer / Client Layer / Data Layer)  
- Reusability over duplication of code  
- Scalable API client design for enterprise-level extension  
- Backward compatibility maintained during refactoring  
- Clean and readable test structure for maintainability  
- Minimal framework coupling to ensure flexibility  

---

## 🚀 How to Run

### 1. Clone the Repository

```bash
git clone <repo-url>
```

### ▶️ 2. Run Tests

```bash
mvn clean test
```


---


## 🔮 Future Enhancements



Implement POJO-based request/response models for type safety


Integrate Allure / Extent reporting for rich test reports


Add CI/CD pipeline support using GitHub Actions / Jenkins


Introduce retry mechanism for handling flaky tests


Enable environment-based configuration (dev / qa / stage)


Add contract testing support for API validation




## 👨‍💻 Author

Bhargavi Kakulavaram

SDET Automation Engineer

Built as part of an SDET portfolio project demonstrating a scalable API automation framework designed using real-world testing practices and industry-aligned architecture principles.
