package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcDemo3 {

	public static void main(String[] args) throws Exception {
		
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
   
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
        
        
        PreparedStatement ps = c.prepareStatement("INSERT INTO laptop (id, brand, model, price, release_year) VALUES (?, ?, ?, ?, ?)");
        
        
        ps.setInt(1, 10);  
        ps.setString(2, "Dell");  
        ps.setString(3, "Intel");  
        ps.setDouble(4, 10000.00);  
        ps.setInt(5, 2021); 
        
       
        ps.executeUpdate();
        
       
        System.out.println("Data inserted successfully......!!");
        
        
        ps.close();
        c.close();
	}
}
// lkjyui@3#$4