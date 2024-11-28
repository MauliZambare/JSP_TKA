package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo9 {

	public void createtable() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
		Statement s = c.createStatement();
		s.execute("CREATE TABLE college (  id INT ,name VARCHAR(30), age int)");
		System.out.println("Table created successfully.......");
		c.close();
		s.close();

	}

	public void insertdata() throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("Insert into college values (1,'Mauli Zambare',20)");
		System.out.println("Data inserted successfully.....");
		s.close();
		c.close();
	}
	
	public void updatedata() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197","root","root");
		 Statement s  = c.createStatement();
		 s.executeUpdate("update college set age = 21 where id = 1");
		 System.out.println("Data updated successfully...");
		 s.close();
		 c.close();
	}
	
	public static void main(String[] args) throws Exception {
		JdbcDemo9 j = new JdbcDemo9();
//		j.createtable();
//		j.insertdata();
		j.updatedata();
	}

}
