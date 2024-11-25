package com.controller;

import com.service.StudentService1;

public class StudentsController1 {
    
    public static void main(String[] args) throws Exception {
        
        StudentService1 s = new StudentService1();
        
//        s.createdata();
//        s.insertdata();
//        s.updatedata();
//        s.fetchdata();
        s.deletedata();
        
    
            System.out.println("Controller executed successfully...");

           

       
}
}