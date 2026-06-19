# JDBC To-Do List Application

A simple console-based To-Do List application built using Java, JDBC, and MySQL. This project helps users manage tasks such as adding, viewing, updating, and deleting tasks.

## Features
- Add a new task
- View all tasks
- Update task status (Pending / Completed)
- Delete a task
- Simple console-based menu system

## Technologies Used
- Java (Core Java)
- JDBC (Java Database Connectivity)
- MySQL Database
- VS Code (IDE)

## Project Structure
todolist/
│
├── src/
│   ├── Main.java
│   ├── DBConnection.java
│   └── other classes
│
├── lib/
│   └── mysql-connector-j-9.7.0.jar
│
├── database.sql
└── README.md

## Database Setup
Run the following SQL in MySQL:

CREATE DATABASE todo_db;

USE todo_db;

CREATE TABLE tasks (
    id INT AUTO_INCREMENT PRIMARY KEY,
    task_name VARCHAR(255) NOT NULL,
    status VARCHAR(50) DEFAULT 'Pending'
);

## How to Run

1. Clone the repository:
git clone https://github.com/abhiram624/todolist.git

2. Open project in VS Code

3. Make sure MySQL is running

4. Update DB credentials in DBConnection.java:
String url = "jdbc:mysql://localhost:3306/todo_db";
String user = "root";
String password = "your_mysql_password";

5. Compile project:
javac -cp ".;lib/mysql-connector-j-9.7.0.jar" src\*.java

6. Run project:
java -cp ".;src;lib/mysql-connector-j-9.7.0.jar" Main

## Note
- Make sure MySQL server is running before executing the project
- Add MySQL connector jar in lib folder
- Update username/password according to your system

## Author
Abhiram