## To-Do List with Spring Boot

### Description

This project is a simple web application for a **To-Do List** developed using **Spring Boot**. The application allows users to manage their daily tasks with basic functionalities, including adding, viewing, editing, and deleting tasks.

### Features

- **Add Task:** Include new tasks with a title and description.
- **View Tasks:** Display a list of all tasks.
- **Edit Task:** Update the title and description of existing tasks.
- **Delete Task:** Remove tasks from the list when they are no longer needed.

### Technologies Used

- **Spring Boot:** Framework for building the application.
- **Spring Data JPA:** For persistence operations with the database.
- **MySQL:** Relational database for production use.
- **Spring Security (optional):** For adding authentication and authorization (if needed).

### Project Structure

The project is organized into the following layers:

- **Controller:** Handles HTTP requests and interacts with the service layer.
    - **Example:** `TaskController`

- **Entity:** Defines the data structure, including classes representing database entities.
    - **Example:** `Task`

- **Repository:** Interface for CRUD operations with the database.
    - **Example:** `TaskRepository`

- **Service:** Contains business logic and interacts with the repository to manage entities.
    - **Example:** `TaskService`

- **Utility:** Utility classes for auxiliary operations or functionalities that do not fit into other layers.
    - **Example:** `TaskUtils` (if needed)

### Main Routes

- `GET /tasks` - Lists all tasks.
- `GET /tasks/{id}` - Displays details of a specific task.
- `POST /tasks` - Adds a new task.
- `PUT /tasks/{id}` - Updates an existing task.
- `DELETE /tasks/{id}` - Deletes a task.

### Running the Application

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/sir-braz/spring-boot-todo-list.git
   ```
2. **Navigate to the Project Directory:**
   ```bash
   cd spring-boot-todo-list
   ```
3. **Configure the Database:**
    - Update the `application.properties` or `application.yml` file with your MySQL database configuration.

   **For `application.properties`:**
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/todolist
   spring.datasource.username=your-username
   spring.datasource.password=your-password
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```

   Replace `your-username` and `your-password` with your MySQL credentials.

4. **Create the Database:**
   Ensure the `todolist` database exists in MySQL. You can create it using a MySQL client or command line:
   ```sql
   CREATE DATABASE todolist;
   ```

5. **Run the Application:**
   ```bash
   ./mvnw spring-boot:run
   ```
   Or, if you prefer using Maven directly:
   ```bash
   mvn spring-boot:run
   ```

6. **Access the Application:** Open your browser and go to `http://localhost:8080`.

### Implementation Example

#### **Controller**

The `TaskController` handles HTTP requests related to tasks and interacts with the `TaskService`.

```java
@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    // Methods to handle tasks
}
```

#### **Entity**

The `Task` class defines the data structure for tasks.

```java
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;

    // Getters and Setters
}
```

#### **Repository**

The `TaskRepository` provides the interface for CRUD operations with the database.

```java
public interface TaskRepository extends JpaRepository<Task, Long> {
}
```

#### **Service**

The `TaskService` contains the business logic for managing tasks.

```java
@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    // Methods to manage tasks
}
```

#### **Utility**

Utility class (if needed) for auxiliary operations.

```java
public class TaskUtils {

    // Auxiliary methods
}
```

### Contributing

Contributions are welcome! If you would like to help improve the project, feel free to open an issue or submit a pull request.


