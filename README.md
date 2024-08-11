# Spring Boot Todo List

## Description

This is a RESTful API for managing tasks. It allows you to perform CRUD operations on tasks. 

## Getting Started

### Prerequisites

- Java 17 or later
- Maven

### Installation

1. **Clone the repository:**

    ```bash
    git clone https://github.com/youruse/task-management-api.git](https://github.com/sir-braz/spring-boot-todo-list.git)](https://github.com/sir-braz/spring-boot-todo-list.git)
    ```

2. **Navigate to the project directory:**

    ```bash
    cd spring-boot-todo-list
    ```

3. **Build and run the application:**

    ```bash
    mvn spring-boot:run
    ```

The API will be available at `http://localhost:8080`.

## Endpoints

- **`GET /tasks`**: List all tasks.
- **`GET /tasks/{id}`**: Get a specific task by ID.
- **`POST /tasks`**: Create a new task. Requires a JSON body with `title` and `description`.
- **`PUT /tasks/{id}`**: Update an existing task. Requires a JSON body with `title` and `description`.
- **`DELETE /tasks/{id}`**: Delete a task by ID.

## Error Handling

- **400 Bad Request**: Invalid request parameters or data.
- **500 Internal Server Error**: Issues with server or application logic.





