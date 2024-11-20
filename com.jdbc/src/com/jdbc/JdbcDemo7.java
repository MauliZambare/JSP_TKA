package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JdbcDemo7 {

	public void insertdata() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
		String query = "INSERT INTO fruit (name, color) VALUES (?, ?)";
		PreparedStatement ps = c.prepareStatement(query);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the fruit name:");
		String name = scanner.nextLine();
		System.out.println("Enter the fruit color:");
		String color = scanner.nextLine();

		ps.setString(1, name);
		ps.setString(2, color);

		ps.executeUpdate();
		c.close();
		System.out.println("Data inserted successfully......!!");
	}

	public void updatedata() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
		String query = "UPDATE fruit SET color = ? WHERE name = ?";
		PreparedStatement ps = c.prepareStatement(query);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the fruit name to update:");
		String name = scanner.nextLine();
		System.out.println("Enter the new fruit color:");
		String color = scanner.nextLine();

		ps.setString(1, color);
		ps.setString(2, name);

		ps.executeUpdate();
		c.close();
		System.out.println("Data updated successfully......!!");
	}

	public void deletedata() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
		String query = "DELETE FROM fruit WHERE name = ?";
		PreparedStatement ps = c.prepareStatement(query);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the fruit name to delete:");
		String name = scanner.nextLine();

		ps.setString(1, name);

		ps.executeUpdate();
		c.close();
		System.out.println("Data deleted successfully......!!");
	}

	public void fetchdata() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
		String query = "SELECT * FROM fruit";
		PreparedStatement ps = c.prepareStatement(query);
		ResultSet rs = ps.executeQuery();

		System.out.println("Fruit Data:");
		while (rs.next()) {
			System.out.println(rs.getString("name") + " " + rs.getString("color"));
		}
		c.close();
	}

	public static void main(String[] args) throws Exception {
		JdbcDemo6 j1 = new JdbcDemo6();
		// j1.insertdata();
		// j1.updatedata();
		// j1.deletedata();
		j1.fetchdata();
	}
}
