package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentDao {

	public void createdata() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
		Statement s = c.createStatement();
		s.execute("CREATE TABLE students ( INT PRIMARY KEY,name VARCHAR(30), age int)");

		System.out.println("Table is created successfully..");
		c.close();

	}

	public void insertdata() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("INSERT INTO students (name, age) VALUES ('Tukaram', 23)");
		System.out.println("Data inserted successfully......");
		s.close();
		c.close();
	}

	public void updatedata() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("UPDATE students SET age = 19  WHERE name = Mauli");
		System.out.println("Data updated Successfully...");
		s.close();
		c.close();
	}

	public void fetchdata() throws Exception {

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
		Statement s = c.createStatement();
		var rs = s.executeQuery("select * from students");
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int color = rs.getInt("age");
			System.out.println("id: " + id + "Animal: " + name + ", age: " + color);
		}
		c.close();

	}

	public void deletedata() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate(" delete from students where id =  4");
		System.out.println("Data deleted Successfully...");
		s.close();
		c.close();
	}

}
