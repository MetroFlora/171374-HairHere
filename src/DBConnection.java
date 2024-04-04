package dBConnect;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eurellowatte
 */
import java.sql.*;

public class DBConnection {

    //declare a connection object
    private Connection con;
    
    public DBConnection() {
        //use try...catch (exception e){} to test the DB connection error
        try {
            //STEP 1 Load mySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //create a connection
            //initialize the con object

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/HH", "root", "Dasani254");
            System.out.println("connected successfully");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Database connection failed. see error below.");
            System.out.println(e);
        }
    }

    
    
    //getconnection 
    public Connection getConnection() {
        return con;
    }
  

}
