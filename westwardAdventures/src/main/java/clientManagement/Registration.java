/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientManagement;

/**
 *
 * @author Pat
 */
import java.util.Scanner;
public class Registration {
    
    
    public static void main(String[] args){
        String fname,lname,regcode,classcode = ""; //variables we will care about getting from Student.
        Scanner scan = new Scanner(System.in); //needed for user input
        System.out.println("Registration Class, clientManagement package, westwardAdventures project.");
        System.out.println("Please enter your first name: ");
       fname= scan.nextLine();
        System.out.println("Please enter your last name: ");
        lname=scan.nextLine();
        System.out.println("Please enter your Student Registration Code: ");
        regcode=scan.nextLine();
        System.out.println("Please enter your Class Registration ID: ");       
        classcode=scan.nextLine();
    }
}
