package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcDemo5 {

	public void insertdata() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");

		String query = "INSERT INTO animal (name, color) VALUES (?, ?)";
		PreparedStatement ps = c.prepareStatement(query);

		ps.setString(1, "lion");
		ps.setString(2, "yellow");

		ps.executeUpdate();
		c.close();
		System.out.println("Data inserted successfully......!!");
	}

	public void updatedata() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");

		String query = "UPDATE animal SET color = ? WHERE name = ?";
		PreparedStatement ps = c.prepareStatement(query);

		ps.setString(1, "red");
		ps.setString(2, "lion");

		ps.executeUpdate();
		c.close();
		System.out.println("Data updated successfully......!!");
	}

	public void deletetdata() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");

		String query = "DELETE FROM animal WHERE name = ?";
		PreparedStatement ps = c.prepareStatement(query);

		ps.setString(1, "cat");

		ps.executeUpdate();
		c.close();
		System.out.println("Data deleted successfully......!!");
	}

	public void fetchdata() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");

		String query = "SELECT * FROM animal";
		PreparedStatement ps = c.prepareStatement(query);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			String name = rs.getString("name");
			String color = rs.getString("color");
			System.out.println("Animal: " + name + ", Color: " + color);
		}

		c.close();
	}

	public static void main(String[] args) throws Exception {
		JdbcDemo4 d1 = new JdbcDemo4();
		d1.insertdata();
//        d1.updatedata();
//        d1.deletetdata();
//        d1.fetchdata();
	}
}
