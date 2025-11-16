package com.jdbc.project1;
import java.sql.*;
import java.util.Scanner;

public class StudentImpl implements IStudent {
    Scanner sc = new Scanner(System.in);
    IConnection icon = new ConnectionImpI();
    Connection con = icon.getConnection();

    // -------------------- INSERT ---------------------
    @Override
    public void insertStudent() {
        try {
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            String query = "INSERT INTO students(name, age) VALUES(?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.executeUpdate();
            System.out.println("Student inserted successfully!");
        } catch (Exception e) {
            System.out.println("Error inserting student: " + e.getMessage());
        }
    }

    @Override
    public void insertMultipleStudents() {
        System.out.print("Enter number of students to insert: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for student " + (i + 1) + " ---");
            insertStudent();
        }
    }

    // -------------------- UPDATE ---------------------
    @Override
    public void updateStudent() {
        try {
            System.out.print("Enter Student ID to update: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter new name: ");
            String name = sc.nextLine();
            System.out.print("Enter new age: ");
            int age = sc.nextInt();

            String query = "UPDATE students SET name=?, age=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setInt(3, id);

            int rows = ps.executeUpdate();
            if (rows > 0) System.out.println("Student updated successfully!");
            else System.out.println(" No student found with that ID.");
        } catch (Exception e) {
            System.out.println("Error updating student: " + e.getMessage());
        }
    }

    @Override
    public void updateMultipleStudents() {
        System.out.print("Enter number of students to update: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Update details for student " + (i + 1) + " ---");
            updateStudent();
        }
    }

    // -------------------- DELETE ---------------------
    @Override
    public void deleteStudent() {
        try {
            System.out.print("Enter Student ID to delete: ");
            int id = sc.nextInt();

            String query = "DELETE FROM students WHERE id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            int rows = ps.executeUpdate();

            if (rows > 0) System.out.println("Student deleted successfully!");
            else System.out.println("No student found with that ID.");
        } catch (Exception e) {
            System.out.println("Error deleting student: " + e.getMessage());
        }
    }

    @Override
    public void deleteMultipleStudents() {
        System.out.print("Enter number of students to delete: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            deleteStudent();
        }
    }

    // -------------------- SHOW ---------------------
    @Override
    public void showStudents() {
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM students");
            System.out.println("\n------ STUDENT LIST ------");
            System.out.printf("%-5s %-20s %-5s\n", "ID", "NAME", "AGE");
            System.out.println("---------------------------");
            while (rs.next()) {
                System.out.printf("%-5d %-20s %-5d\n",
                        rs.getInt("id"), rs.getString("name"), rs.getInt("age"));
            }
        } catch (Exception e) {
            System.out.println("Error fetching students: " + e.getMessage());
        }
    }
}

