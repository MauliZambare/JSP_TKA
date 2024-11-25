package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.dao.StudentDao1;

public class StudentService1 {

	public void insertdata() throws Exception {
		StudentDao1 s = new StudentDao1();
		System.out.println("Service executed successfully..");
		s.insertdata();

	}

	public void createdata() throws Exception {
		StudentDao1 s = new StudentDao1();
		System.out.println("Service executed successfully..");
		s.createdata();

	}
	
	public void updatedata () throws Exception {
		StudentDao1 s = new StudentDao1();
		System.out.println("Service executed successfully..");
		s.updatedata();
	}
	
	public void fetchdata () throws Exception {
		StudentDao1 s = new StudentDao1();
		System.out.println("Service executed successfully..");
		s.fetchdata();
	}
	
	public void deletedata() throws Exception {
		StudentDao1 s = new StudentDao1();
		System.out.println("Service executed successfully..");
		s.deletedata();
		
	}

}
