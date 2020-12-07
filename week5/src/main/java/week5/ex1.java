/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;
import java.util.Scanner;
/**
 *
 * @author Pat
 */
public class ex1 {
    public static void main(String[] args){
        
        int attempts=0;
        String password = "w5ex1", entry;
        final int tries = 4;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Super secret login page");
        while(attempts < tries){
            System.out.println("What is the password: ");
            entry = scan.next();
            
            if(entry.equals(password)){
                System.out.println("Successful login..there is no secret, though. Get lost!");
                break;
            
            }
            attempts+=1;
            System.out.println("You have entered incorrectly. You have tried " + attempts + " times and have " + (tries-attempts) + " tries remaining");
            
        }
        if(attempts==tries){
            System.out.println("I really don't think you get how this works..go home");
        }
    }
    
    
}
