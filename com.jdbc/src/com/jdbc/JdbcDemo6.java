package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDemo6 {

	public void insertdata() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
		Statement s = c.createStatement();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the fruit name:");
		String name = scanner.nextLine();
		System.out.println("Enter the fruit color:");
		String color = scanner.nextLine();
		String query = "INSERT INTO fruit (name, color) VALUES ('" + name + "', '" + color + "')";
		s.executeUpdate(query);
		c.close();
		System.out.println("Data inserted successfully......!!");
	}

	public void updatedata() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
		Statement s = c.createStatement();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the fruit name to update:");
		String name = scanner.nextLine();
		System.out.println("Enter the new fruit color:");
		String color = scanner.nextLine();
		String query = "UPDATE fruit SET color = '" + color + "' WHERE name = '" + name + "'";
		s.executeUpdate(query);
		c.close();
		System.out.println("Data updated successfully......!!");
	}
	public void deletedata() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
        Statement s = c.createStatement();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the fruit name to delete:");
        String name = scanner.nextLine();
        String query = "DELETE FROM fruit WHERE name = '" + name + "'";
        s.executeUpdate(query);
        c.close();
        System.out.println("Data deleted successfully......!!");
    }
	public void fetchdata() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
        Statement s = c.createStatement();
        String query = "SELECT * FROM fruit";
        ResultSet rs = s.executeQuery(query);
        
        System.out.println("Fruit Data:");
        while (rs.next()) {
            System.out.println(rs.getString("name") + " " + rs.getString("color"));
        }
        c.close();
    }

	public static void main(String[] args) throws Exception {
		JdbcDemo6 j1 = new JdbcDemo6();
		//j1.insertdata();
//		j1.updatedata();
//		j1.deletedata();
        j1.fetchdata();
	}
}
