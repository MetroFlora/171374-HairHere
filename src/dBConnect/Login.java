package dBConnect;
    
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eurellowatte
 */
public class Login {

    public static boolean doLogin(String uName, String pass) {
        
        DBConnection DB = new DBConnection();
        
        try{
        Statement stmt = DB.getConnection().createStatement();
        
        //execute the statement
        String selectQuery = "SELECT * FROM users";
        
        //step 5 Process the resultset
        ResultSet resultSet = stmt.executeQuery(selectQuery);
        
        boolean loggedIn = false;
        while (resultSet.next()) {
            
            //get database values and store them in local variable
            
            String dbusername = resultSet.getString(2);
            String dbpassword = resultSet.getString(3);
            // String role = resultSet.getString("userrole");
            
            if (uName.equalsIgnoreCase(dbusername) && pass.equals(dbpassword)){
                System.out.println("Login successful");
                System.out.println("Write the logic for the next action here");
                loggedIn = true;
                break;
            }
        }
        if (!loggedIn) {
            System.out.println("Failed to log in user");
            return false;
        }
    } catch (SQLException e) {
            System.out.println("error");
            return false;
    }
     return true;
}
}
        
