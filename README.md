# To-Do List App

A simple To-Do List application built with Java, using PostgreSQL for database management. This project is part of my weekend projects to practice Java programming and database integration.

---

## Features

- **Add a new task**: Users can add a new task with a title and description.
- **View all tasks**: Users can view a list of all tasks.
- **Update task status**: Users can update the status of a task (Pending/Completed).
- **Remove a task**: Users can delete a task by its ID.
- **Filter tasks by status**: Users can filter tasks by their status (Pending/Completed).
- **Sort tasks by date**: Users can sort tasks by their creation date (ASC/DESC).
- **Search tasks by title**: Users can search for tasks by their title.

---

## How to Run

### Prerequisites

- Java Development Kit (JDK) 11 or higher.
- Apache Maven.
- PostgreSQL database.

### Setup

1. **Clone the repository**:
   ```bash```
   ```git clone https://github.com/rifqi-weekend-projects/todo-list-app-java-postgre```
   ```cd todo-list-app-java-postgre```

2. **Set up the database**:
   - Create a PostgreSQL database named todo_app.
   - Update the database connection details in DatabaseConnection.java:
     ```private static final String URL = "jdbc:postgresql://localhost:5432/todo_app";```
     ```private static final String USER = "postgres";```
     ```private static final String PASSWORD = "root";```
3. **Compile and run the project**:
     ```mvn clean install```
     ```mvn exec:java -Dexec.mainClass="com.enigma.gosling.ToDoListApp"```
4. **Follow the menu prompts to interact with the application.**

## Technologies Used
Java: The core programming language used for this project.

PostgreSQL: The database management system for storing tasks.

Maven: The build automation tool used for dependency management.

JDBC: Java Database Connectivity for interacting with the PostgreSQL database.

## Project Structure
todo-list-app-java/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── enigma/
│   │   │           ├── ToDoListApp.java
│   │   │           ├── menu/
│   │   │           ├── impl/
│   │   │           ├── util/
│   │   │           └── validation/
│   │   └── resources/
│   └── test/
│       └── java/
├── pom.xml
├── README.md
└── .gitignore

## License
This project is a personal weekend project and is not under any specific license. Feel free to use and modify the code for learning purposes.

## Author
-**Muh. Alrifqi Darmawan**

-GitHub: [rifqidarmawan](https://github.com/rifqidarmawan)

-Email: [rifqidarmawan24@gmail.com](mailto:rifqidarmawan24@gmail.com)

