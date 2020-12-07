package week4;

import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pat
 */
public class UsernameAndPassword {
    
    public static void main(String[] args){
        final String USERNAME= "javaghost", PASSWORD="password";
        String inputName, inputPassword;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your username:");
        inputName = scan.nextLine();
        
        System.out.println("Enter your password:");
        inputPassword = scan.nextLine();
        
        
        //kinda skimmed the reading, learned a hard lesson today about .equals for comparison, oof.
        if( inputName.equals(USERNAME) && inputPassword.equals(PASSWORD)){
            System.out.println("Welcome, Java Ghost. Entering the internet now");
        } else{
            System.out.println("3D4D3D3 ERROR. ERROR. USERNAME OR PASSWORD BAD");
        }
        
    }
    
}
