package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo8 {

	public void createTable() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
		Statement s = c.createStatement();
		s.execute("CREATE TABLE employees1 (emp_id INT PRIMARY KEY,name VARCHAR(30), salary int)");

		System.out.println("Table is created successfully..");
		c.close();
	}

	public void alterTable() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
		Statement s = c.createStatement();
		s.execute("ALTER TABLE employees1 ADD designation VARCHAR(50)");

		System.out.println("Column 'designation' added successfully..");
		c.close();
	}

	public void truncateTable() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
		Statement s = c.createStatement();
		s.execute("TRUNCATE TABLE employees1");

		System.out.println("Table 'employees1' truncated successfully..");
		c.close();
	}

	public void dropTable() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
		Statement s = c.createStatement();
		s.execute("DROP TABLE employees1");

		System.out.println("Table 'employees1' dropped successfully..");
		c.close();
	}

	public static void main(String[] args) throws Exception {
		JdbcDemo8 d = new JdbcDemo8();
//		d.createTable();
//		d.alterTable();
//		d.truncateTable();
		d.dropTable();
	}

}
