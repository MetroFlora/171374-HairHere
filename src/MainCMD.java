

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import dBConnect.*;
import dBConnect.DBConnection;
import java.util.Scanner;

/**
 *
 * @author eurellowatte
 */
public class MainCMD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DBConnection DB = new DBConnection();
        System.out.println("Hair Here - A barber appointment System");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Username");
        String uName = in.nextLine();
        System.out.println("Enter Password");
        String pass = in.next();
        
        //Instatient the login class to access doLogin
        Login.doLogin(uName, pass);
    }
    
}
//HomeFrame homeFrame = new HomeFrame();