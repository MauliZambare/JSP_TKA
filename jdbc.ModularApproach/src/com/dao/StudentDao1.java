package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDao1 {

	public void createdata() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
		String createTableSQL = "CREATE TABLE IF NOT EXISTS students (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(30), age INT)";
		PreparedStatement ps = c.prepareStatement(createTableSQL);
		ps.executeUpdate();

		System.out.println("Table is created successfully..");
		c.close();
	}

	public void insertdata() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");

		String insertSQL = "INSERT INTO students (name, age) VALUES (?, ?)";
		PreparedStatement ps = c.prepareStatement(insertSQL);
		ps.setString(1, "Tukaram");
		ps.setInt(2, 23);

		ps.executeUpdate();

		System.out.println("Data inserted successfully......");
		ps.close();
		c.close();
	}

	public void updatedata() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");

		String updateSQL = "UPDATE students SET age = ? WHERE name = ?";
		PreparedStatement ps = c.prepareStatement(updateSQL);
		ps.setInt(1, 19);
		ps.setString(2, "Mauli");

		ps.executeUpdate();

		System.out.println("Data updated Successfully...");
		ps.close();
		c.close();
	}

	public void fetchdata() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");

		String selectSQL = "SELECT * FROM students";
		PreparedStatement ps = c.prepareStatement(selectSQL);
		ResultSet rs = ps.executeQuery(); // Execute the select query

		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int age = rs.getInt("age"); // Corrected the variable from 'color' to 'age'

			System.out.println("id: " + id + " Name: " + name + ", Age: " + age);
		}

		rs.close();
		ps.close();
		c.close();
	}

	public void deletedata() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");

		String updateSQL = "delete from students where  id = ?";
		PreparedStatement ps = c.prepareStatement(updateSQL);
		ps.setInt(1, 3);
		ps.executeUpdate();
		System.out.println("Data updated Successfully...");
		ps.close();
		c.close();

	}
}
