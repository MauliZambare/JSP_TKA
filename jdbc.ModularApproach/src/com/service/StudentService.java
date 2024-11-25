package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.dao.StudentDao;

public class StudentService {

	public void insertdata() throws Exception {
		StudentDao s = new StudentDao();
		System.out.println("Service executed successfully..");
		s.insertdata();

	}

	public void createdata() throws Exception {
		StudentDao s = new StudentDao();
		System.out.println("Service executed successfully..");
		s.createdata();

	}
	
	public void updatedata () throws Exception {
		StudentDao s = new StudentDao();
		System.out.println("Service executed successfully..");
		s.updatedata();
	}
	
	public void fetchdata () throws Exception {
		StudentDao s = new StudentDao();
		System.out.println("Service executed successfully..");
		s.fetchdata();
	}
	
	public void deletedata () throws Exception {
		StudentDao s = new StudentDao();
		System.out.println("Service executed successfully..");
		s.deletedata();
	}

}
