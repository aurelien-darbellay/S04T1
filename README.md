# Level 1 - Spring and Maven

A simple Spring Boot project that demonstrates how to set up a basic REST API using Maven. It includes three GET endpoints and showcases how to handle query parameters and path variables in Spring.

## 🔧 Tech Stack

- Java 11 or later  
- Spring Boot  
- Maven  
- IDE: IntelliJ IDEA or Eclipse  

## 🚀 Description

This project exposes a basic REST API on port **9000**. It includes the following endpoints:

### Endpoints

1. `GET /HelloWorld?nom=John`  
   Responds with:  
   ```
   Hola, John. Estàs executant un projecte Maven
   ```  
   - Uses `@RequestParam` to capture the `nom` parameter.

2. `GET /HelloWorld2/John`  
   Responds with:  
   ```
   Hola, John. Estàs executant un projecte Maven
   ```  
   - Uses `@PathVariable` to capture the `nom` segment of the URL.

3. *(Optional: Add details for a third endpoint if applicable.)*

## ▶️ How to Run

Make sure you have Java 11+ and Maven installed.

### Using the terminal:

```bash
mvn spring-boot:run
```

### Using IntelliJ IDEA or Eclipse:

1. Import the project as a Maven project.  
2. Build the project.  
3. Run the `main` method in your Spring Boot application class.

Then access the endpoints via:

- [http://localhost:9000/HelloWorld?nom=John](http://localhost:9000/HelloWorld?nom=John)  
- [http://localhost:9000/HelloWorld2/John](http://localhost:9000/HelloWorld2/John)

## 📂 Project Structure

- `HelloWorldController.java` — contains the REST endpoints  
- `pom.xml` — Maven configuration  

---

# Level 2 - Spring and Gradle

A simple Spring Boot project that demonstrates how to set up a basic REST API using Gradle. It includes three GET endpoints and showcases how to handle query parameters and path variables in Spring.

## 🔧 Tech Stack

- Java 11 or later  
- Spring Boot  
- Gradle  
- IDE: IntelliJ IDEA or Eclipse  

## 🚀 Description

This project exposes a basic REST API on port **9001**. It includes the following endpoints:

### Endpoints

1. `GET /HelloWorld?nom=John`  
   Responds with:  
   ```
   Hola, John. Estàs executant un projecte Gradle
   ```  
   - Uses `@RequestParam` to capture the `nom` parameter.

2. `GET /HelloWorld2/John`  
   Responds with:  
   ```
   Hola, John. Estàs executant un projecte Gradle
   ```  
   - Uses `@PathVariable` to capture the `nom` segment of the URL.

3. *(Optional: Add details for a third endpoint if applicable.)*

## ▶️ How to Run

Make sure you have Java 11+ and Gradle installed.

### Using the terminal:

```bash
./gradlew bootRun
```

### Using IntelliJ IDEA or Eclipse:

1. Import the project as a Gradle project.  
2. Build the project.  
3. Run the `main` method in your Spring Boot application class.

Then access the endpoints via:

- [http://localhost:9001/HelloWorld?nom=John](http://localhost:9001/HelloWorld?nom=John)  
- [http://localhost:9001/HelloWorld2/John](http://localhost:9001/HelloWorld2/John)

## 📂 Project Structure

- `HelloWorldController.java` — contains the REST endpoints  
- `build.gradle` — Gradle configuration  

---

# Level 3 Postman Exercise

This exercise is about testing the previous projects (**Level 1 - Spring and Maven** and **Level 2 - Spring and Gradle**) using **Postman**. The goal is to create environments with reusable variables and execute requests against the available endpoints.

## 🛠️ What to Do

Create two environments in Postman:

### 🌐 Environments

1. **Project Maven**
   - `server`: `http://localhost`
   - `port`: `9000`

2. **Project Gradle**
   - `server`: `http://localhost`
   - `port`: `9001`

## 📤 What to Deliver

You must submit **four files**:

- ✅ Two exported environments (JSON files)
- ✅ Two screenshots (one for each environment), showing a request executed in Postman using the defined variables

## ▶️ How to Test

1. Make sure both projects are running in **Eclipse** or **IntelliJ**:
   - Level 1 (Maven) should be running on port `9000`
   - Level 2 (Gradle) should be running on port `9001`

2. In Postman, use the variables like this:
   ```
   {{server}}:{{port}}/HelloWorld/yourname
   ```

3. Make GET requests to:
   - `{{server}}:{{port}}/HelloWorld?nom=YourName`
   - `{{server}}:{{port}}/HelloWorld2/YourName`

4. You should see responses like:
   ```
   Hola, YourName. Estàs executant un projecte Maven
   ```
   or  
   ```
   Hola, YourName. Estàs executant un projecte Gradle
   ```

## 📎 Notes

- The environment variables in Postman make it easy to switch between projects.
- Ensure both projects are running when executing the requests.

---

© Aurélien Darbellay



