package com.servelet2;

import java.io.IOException; // Missing import added
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
 
@WebServlet("/regform")
public class ServletDemo1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name1");
        String email = request.getParameter("email1");
        String pass = request.getParameter("pass1");

//        System.out.println(name);
//        System.out.println(email);
//        System.out.println(pass);
//        
//        PrintWriter out = response.getWriter();
//        
//        out.print(name);
//        out.print(email);
//        out.print(pass);
        
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc://localhost:3306/batch1197","root","root");
        PreparedStatement ps = c.prepareStatement("insert into register(name,email,password)values(?,?,?)");
        ps.setString(1, name);
        ps.setString(2, email);
        ps.setString(3, pass);  
        ps.executeUpdate();
        System.out.println("Data in inserted successfully...");
        c.close();
        
        } catch (Exception e) {
        	
        }
    }
}
