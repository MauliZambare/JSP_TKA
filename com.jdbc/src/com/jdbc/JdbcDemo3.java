package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcDemo3 {

	public static void main(String[] args) throws Exception {
		
        // Load the MySQL driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Establish connection to the database
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");
        
        // Prepare the SQL insert statement with placeholders
        PreparedStatement ps = c.prepareStatement("INSERT INTO laptop (id, brand, model, price, release_year) VALUES (?, ?, ?, ?, ?)");
        
        // Set the values for the placeholders
        ps.setInt(1, 10);  
        ps.setString(2, "Dell");  
        ps.setString(3, "Intel");  
        ps.setDouble(4, 10000.00);  
        ps.setInt(5, 2021); 
        
        // Execute the update (insert)
        ps.executeUpdate();
        
        // Print confirmation message
        System.out.println("Data inserted successfully......!!");
        
        // Close the PreparedStatement and connection
        ps.close();
        c.close();
	}
}
