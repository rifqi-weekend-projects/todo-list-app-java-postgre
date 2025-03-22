package com.enigma.gosling.impl;

import com.enigma.gosling.ToDoService;
import com.enigma.gosling.validation.DatabaseConnection;

import javax.xml.crypto.Data;
import java.sql.*;

public class ToDoServiceImpl implements ToDoService {

    @Override
    public void addTask(String title, String description) {
        String query = "INSERT INTO tasks (title, description) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, title);
            pstmt.setString(2, description);
            pstmt.executeUpdate();
            System.out.println("Task successfully added.!");
            System.out.println();
        } catch (SQLException e) {
            System.err.println("Error Add Tasks: " + e.getMessage());
        }
    }

    @Override
    public void viewTasks() {
        String query = "SELECT * FROM tasks ORDER BY id ASC";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            boolean hasData = false;

            while (rs.next()) {
                hasData = true;
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Title: " + rs.getString("title"));
                System.out.println("Description: " + rs.getString("description"));
                System.out.println("Status: " + rs.getString("status"));
                System.out.println("Created At: " + rs.getTimestamp("created_at"));
                System.out.println("-----------------------------------");
            }

            if (!hasData) {
                System.out.println("No data found.");
            }

        } catch (SQLException e) {
            System.err.println("Error View All Task: " + e.getMessage());
        }
    }

    @Override
    public void removeTask(int id) {
        String query = "DELETE FROM tasks WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Task successfully removed.");
        } catch (SQLException e) {
            System.err.println("Error Remove Task by id: " + e.getMessage());
        }
    }

    @Override
    public void updateTask(int id, String status) {
        String query = "UPDATE tasks SET status = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, status);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            System.out.println("Task Successfully updated.");
        } catch (SQLException e) {
            System.err.println("Error Update tasks: " + e.getMessage());
        }

    }

    @Override
    public void filterByStatus(String status) {
        String query = "SELECT * FROM tasks WHERE status = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);) {

            pstmt.setString(1, status);
            ResultSet rs = pstmt.executeQuery();

            boolean hasData = false;

            while (rs.next()) {
                hasData = true;
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Title: " + rs.getString("title"));
                System.out.println("Description: " + rs.getString("description"));
                System.out.println("Status: " + rs.getString("status"));
                System.out.println("Created At: " + rs.getTimestamp("created_at"));
                System.out.println("----------------------------------");
            }

            if (!hasData) {
                System.out.println("No data found for status: " + status);
                System.out.println();
            }

        } catch (SQLException e) {
            System.err.println("Error Filter By Status: " + e.getMessage());
        }
    }

    @Override
    public void sortByDate(String sortBy) {
        if (!sortBy.equals("ASC") && !sortBy.equals("DESC")) {
            System.out.println("Invalid sort by: " + sortBy);
            return;
        }

        String query = "SELECT * FROM tasks ORDER BY created_at " + sortBy;
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);) {

            ResultSet rs = pstmt.executeQuery();

            boolean hasData = false;

            while (rs.next()) {
                hasData = true;
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Title: " + rs.getString("title"));
                System.out.println("Description: " + rs.getString("description"));
                System.out.println("Status: " + rs.getString("status"));
                System.out.println("Created At: " + rs.getTimestamp("created_at"));
                System.out.println("----------------------------------");

            }

            if (!hasData) {
                System.out.println("No data found for date: " + sortBy);
                System.out.println();
            }

        } catch (SQLException e) {
            System.err.println("Error sorting tasks by date: " + e.getMessage());
        }
    }

    @Override
    public void searchByTitle(String title) {
        String query = "SELECT * FROM tasks WHERE title = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, title);
            ResultSet rs = pstmt.executeQuery();

            boolean hasData = false;

            while (rs.next()) {
                hasData = true;
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Title: " + rs.getString("title"));
                System.out.println("Description: " + rs.getString("description"));
                System.out.println("Status: " + rs.getString("status"));
                System.out.println("Created At: " + rs.getTimestamp("created_at"));
                System.out.println("----------------------------------");
            }

            if (!hasData) {
                System.out.println("No data found for title: " + title);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
