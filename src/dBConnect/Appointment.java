package dBConnect;


import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eurellowatte
 */
public class Appointment {
    //class members
    
    //class field declarion
    private int appointmentId;
    private String customer;
    private String barber;
    private Date dateTime;
    private String status;
    
    //constructors
    public Appointment(){
       };
    //class methods
    public int appointmentId (int appointmentId){
        return appointmentId;
    }
    public String customer (String customer){
        return customer;
    }
    public String barber (String barber){
        return barber;
    }
    public Date dateTime (Date dateTime){
        return dateTime;
    }
    public String status (String status){
            return status;
    }
}
