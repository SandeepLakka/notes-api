
# Notes API

A simple Spring Boot REST API application for managing notes. This application allows you to create, read, update, and delete notes stored in an in-memory H2 database.


## Technologies Used

- Java 17
- Spring Boot 3.3.11
- Spring Data JPA
- H2 In-memory Database
- Lombok

## Features

- Create a new note
- Get all notes
- Get a note by ID
- Update an existing note
- Delete a note by ID
- API documentation via Swagger UI

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6 or higher

### Build and Run

1. Clone or download the project.
2. Open terminal/cmd and navigate to project root (`sandeeplakka-notes-api`).
3. Build the project:
   ```bash
   mvn clean install
   ```

4. Run the app:

   ```bash
   mvn spring-boot:run
   ```
5. Access API docs and test endpoints at:

   ```
   http://localhost:8080/swagger-ui/index.html
   ```

### API Endpoints

| Method | Endpoint    | Description             |
| ------ | ----------- | ----------------------- |
| POST   | /notes      | Create a new note       |
| GET    | /notes      | Retrieve all notes      |
| GET    | /notes/{id} | Retrieve note by ID     |
| PUT    | /notes      | Update an existing note |
| DELETE | /notes/{id} | Delete note by ID       |

### Notes Model Fields

| Field   | Type   | Description    |
| ------- | ------ | -------------- |
| id      | String | Unique note ID |
| title   | String | Note title     |
| content | String | Note content   |

## Configuration

* Uses in-memory H2 database (configured in `application.properties`)

## Important Notes

* The `id` is a `String` but uses `@GeneratedValue(strategy = IDENTITY)`. This may cause runtime issues. Consider changing `id` to `Long` or `Integer` for proper auto-generation.
* Field injection (`@Autowired` on fields) is used; constructor injection is recommended.
* No input validation or exception handling implemented.
* Lombok annotations generate boilerplate code; ensure Lombok plugin is installed in your IDE.

## Suggestions for Improvement

* Add validation for incoming data (e.g., `@Valid`)
* Implement global exception handling for meaningful error responses
* Switch `id` to a numeric type for compatibility with auto-generation
* Add unit and integration tests
* Implement pagination and filtering on GET `/notes`
* Use a persistent database for production use
