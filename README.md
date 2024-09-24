# MAMA-Demo Application

This is a simple Java Spring application that uses MongoDB as its database. The application provides a simple member registration form and displays the registered members. The application is built with Spring Boot and uses Spring Data MongoDB to interact with the MongoDB database.

## Features

- Member Registration
- Display Registered Members

## Technologies Used

- Java
- Spring Boot
- MongoDB
- HTML/CSS/JavaScript

## Setup

### Prerequisites

- Java 8 or higher
- Maven
- Docker
- MongoDB

### Steps

1. Clone the repository
```
git clone https://github.com/yourusername/mama-demo.git
```
2. Navigate to the project directory
```
cd mama-demo
```
3. Pull the MongoDB Docker image
```
docker pull mongodb/mongodb-atlas-local
```
4. Run the MongoDB Docker image
```
docker run -p 27017:27017 mongodb/mongodb-atlas-local
```
5. Update the `spring.data.mongodb.uri` property in the `application.properties` file if necessary
```
spring.data.mongodb.uri=mongodb://localhost/test?directConnection=true
```
6. Build the project with Maven
```
mvn clean install
```
7. Run the application
```
mvn spring-boot:run
```
The application will be accessible at `http://localhost:8080`.

## Usage

The application provides a simple form for member registration. Enter the member details and click on the 'Register' button to register the member. The registered members will be displayed in the 'Members' section.

## API Endpoints

- `GET /hello`: Returns a greeting message
- `POST /register`: Registers a new member
- `GET /members`: Returns a list of all registered members
- `GET /members/{id}`: Returns the member with the specified ID

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

[MIT](https://choosealicense.com/licenses/mit/)
