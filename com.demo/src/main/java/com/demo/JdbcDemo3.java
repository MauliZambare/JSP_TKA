package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo3 {

	public void createtable() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
		Statement s = c.createStatement();

		s.executeUpdate("create table stud_det (name varchar(30),id int,age int)");
		System.out.println("Table created successfully.....");
		s.close();

	}

	public void insertdata() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("insert into stud_det values('harsh',6,25)");
		System.out.println("Data inserted successfully...");
		s.close();
	}

	public void updatedata() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("Update stud_det set standard = 10");
		System.out.println("Data updated Successfully....");
		s.close();
	}

	public void deletedata() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("delete from stud_det where id = 6");
		System.out.println("Data Deleted Successfully....");
		s.close();
	}
	
	public void  altertable() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("ALTER TABLE stud_det ADD standard VARCHAR(50)");
		System.out.println("Column added Successfully....");
		s.close();
	}
	
	
	

	public static void main(String[] args) throws Exception {
		JdbcDemo3 d = new JdbcDemo3();
		// d.createtable();
		// d.insertdata();
		d.updatedata();
		//d.deletedata();
		//d.altertable();
	}

}
