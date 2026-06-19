CREATE DATABASE todo_db;

USE todo_db;

CREATE TABLE tasks (
    id INT AUTO_INCREMENT PRIMARY KEY,
    task_name VARCHAR(255) NOT NULL,
    status VARCHAR(50) DEFAULT 'Pending'
);