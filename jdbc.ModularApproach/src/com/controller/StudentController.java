package com.controller;

import com.service.StudentService;

public class StudentController {
	
	public static void main(String[] args) throws Exception {
		
		StudentService s1 = new StudentService();
		System.out.println("Controller executed successfullly..");
//		s1.insertdata();
//		s1.createdata();
//		s1.updatedata();
		s1.fetchdata();
		s1.deletedata();
		
		System.out.println("Thank you!.........");
	}

}
