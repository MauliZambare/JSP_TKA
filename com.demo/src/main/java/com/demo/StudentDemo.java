package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;


public class StudentDemo {

	public void insertdata() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management_system", "root","root");
		Statement s = c.createStatement();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the student name :-   ");
		String name = scanner.nextLine();
		
		System.out.println("Enter the Student age :-    ");
		String age = scanner.nextLine();
		
		System.out.println("Enter the Student gender (Male/Female/Other) :-    ");
		String gender = scanner.nextLine();
		
		System.out.println("Enter the Student email :-    ");
		String email = scanner.nextLine();
		
		System.out.println("Enter the Student phone_number :-    ");
		String phone = scanner.nextLine();
		
		System.out.println("Enter the Student address :-    ");
		String address = scanner.nextLine();
		
		System.out.println("Enter the Student date_of_birth :-    ");
		String dob = scanner.nextLine();
		
		System.out.println("Enter the Student enrollment_date :-    ");
		String enrollmentDate = scanner.nextLine();
		
		String query = "INSERT INTO students (name, age, gender, email, phone_number, address, date_of_birth, enrollment_date) VALUES ('"+ name + "', " + age + ", '" + gender + "', '" + email + "', '" + phone + "', '" + address + "', '"+ dob + "', '" + enrollmentDate + "')";
		s.executeUpdate(query);
		c.close();
		System.out.println("Data added successfully......!!");
	}

	public void updatedata() throws Exception {
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management_system", "root", "root");

	    Scanner scanner = new Scanner(System.in);

  
        System.out.print("Enter table name: ");
        String tableName = scanner.nextLine();

        System.out.print("Enter column name to update ( name/age/gender/email/phone_number/address/date_of_birth/enrollment_date) :-  ");
        String columnToUpdate = scanner.nextLine();

        System.out.print("Enter to set new value: ");
        String newValue = scanner.nextLine();

        System.out.println("Enter the condition column (e.g., id, name):");
        String conditionColumn = scanner.nextLine();

        System.out.println("Enter the value to match (e.g., the student name or ID):");
        String conditionValue = scanner.nextLine();

  
        String query = String.format("UPDATE %s SET %s = '%s' WHERE %s = '%s'",tableName, columnToUpdate, newValue, conditionColumn, conditionValue);

        Statement s = c.createStatement();
        int rowsAffected = s.executeUpdate(query);

        
        if (rowsAffected > 0) {
            System.out.println("Data updated successfully!");
        } else {
            System.out.println("No rows were updated. Please check your inputs.");
        }
        
        s.close();
        c.close();
        scanner.close();
    }


	public void deletedata() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management_system", "root",
				"root");
		Statement s = c.createStatement();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the ID of the student to delete:");
		int id = scanner.nextInt(); 

		String query = "DELETE FROM students WHERE id = " + id;
		int rowsAffected = s.executeUpdate(query);

		if (rowsAffected > 0) {
			System.out.println("Student deleted successfully!");
		} else {
			System.out.println("No student found with the provided ID!");
		}

		c.close();
	}

	public static void main(String[] args) throws Exception {
		StudentDemo s = new StudentDemo();
		s.insertdata();
//		s.deletedata();
//		s.updatedata();

	}
}
