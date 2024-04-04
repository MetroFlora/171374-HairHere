package dBConnect;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eurellowatte
 */
public class Customer {
    //class members
  
    
    DBConnection DBconnect = new DBConnection();
    
    //
  
    
    
    //class field declarion 
    private int customerID;
    private String name;
    private String contactInfo;
    
    //constructors
    public Customer(){
        
    }
    //class methods
    public int customerID(){
        return customerID;
    }
    public String getName() {
        return name;
    }

    public String contactInfo() {
        return contactInfo;
    }
}
