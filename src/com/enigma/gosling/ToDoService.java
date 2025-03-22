package com.enigma.gosling;

public interface ToDoService {
    void addTask(String title, String description);
    void viewTasks();
    void removeTask(int id);
    void updateTask(int id, String status);
    void filterByStatus(String status);
    void sortByDate(String sortBy);
    void searchByTitle(String title);
}
