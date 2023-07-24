# Sample JPA RestAPI - Employee and Department Management

Employee and Department Management is a simple Java Spring Boot application that provides an API to manage employees and departments. It uses Spring Data JPA for data persistence and exposes endpoints to interact with the underlying database.

## Getting Started

To run this application locally, follow these steps:

1. Clone the repository:
   ```
   git clone https://github.com/alusionista/SampleJPARestAPI.git
   cd SampleJPARestAPI
   ```

2. Build the application:
   ```
   mvn clean install
   ```

3. Run the application:
   ```
   mvn spring-boot:run
   ```

## Database Configuration

By default, the application uses an embedded H2 database for simplicity. You can modify the database configuration in `application.properties` if you wish to use a different database.

## API Endpoints

The application provides the following API endpoints:

- `GET /departamento`: Retrieves a list of all departments.
- `GET /funcionario`: Retrieves a list of all employees.

## Example Usage

You can use tools like `curl` or Postman to interact with the API:

1. Retrieve all departments:
   ```
   curl -X GET http://localhost:8080/departamento
   ```

2. Retrieve all employees:
   ```
   curl -X GET http://localhost:8080/funcionario
   ```

## Data Model

The application defines two entities:

### Departamento Entity

- `id`: Long - The unique identifier for the department.
- `codigo`: int - The department code.
- `nome`: String - The department name.

### Funcionario Entity

- `id`: Long - The unique identifier for the employee.
- `codigo`: int - The employee code.
- `nome`: String - The employee name.
- `quantidadeDependentes`: int - The number of dependents.
- `salario`: double - The employee's salary.
- `cargo`: String - The employee's job title.
- `departamento`: Departamento - The department to which the employee belongs.

## Initialization

Upon application startup, the `Loader` class inserts some initial data into the database to demonstrate the functionality of the application.

Thank you for using Employee and Department Management!