package com.jdbc.project1;
import java.sql.Connection;
import java.util.Scanner;

public class Menu implements IMenu {
   
	public void showMenu() {
        Scanner sc = new Scanner(System.in);
        StudentImpl student = new StudentImpl();
        int choice;
        do {
            System.out.println("\nWelcome to JDBC");
            System.out.println("Student Database Menu");
            System.out.println("1. Insert a student");
            System.out.println("2. Insert multiple students");
            System.out.println("3. Update a student");
            System.out.println("4. Update multiple students");
            System.out.println("5. Delete a student");
            System.out.println("6. Delete multiple students");
            System.out.println("7. Show students");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1 : student.insertStudent();
                break;
                case 2 : student.insertMultipleStudents();
                break;
                case 3 : student.updateStudent();
                break;
                case 4 : student.updateMultipleStudents();
                break;
                case 5 : student.deleteStudent();
                break;
                case 6 : student.deleteMultipleStudents();
                break;
                case 7 : student.showStudents();
                break;
                case 0 : System.out.println("Exiting...");
                break;
                default : System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }
}
