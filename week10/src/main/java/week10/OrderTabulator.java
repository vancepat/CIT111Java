/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;
import java.util.Scanner;
import java.util.Random;


/**
 *
 * @author Pat
 */
public class OrderTabulator {
    private static int keyLimePies=0, lemons = 0;
    private static Scanner scan = new Scanner(System.in);
    private static int choice, orderAmount;
    
    
    public static void main(String[] args){
        
        while(true){
            System.out.println("What are you ordering? enter 1 for lemons, 2 for pies, or 3 to exit");
            choice = scan.nextInt();
            switch(choice){
                case 1:
                   System.out.println("Enter the amount of Lemons you have purchased");
                   orderAmount = scan.nextInt();
                   lemonTime(orderAmount);
                case 2:
                    System.out.println("Enter the amount of pies you have purchased");
                   orderAmount = scan.nextInt();
                   pieTime(orderAmount);
                default:
                    System.out.println("Exiting program....");
                    break;
            }
        }
        
        
    }
    
    public static void pieTime(int order){
        System.out.println("Successfully purchased "+ order+" Key lime pies");
        keyLimePies+=order;
        System.out.println("Order totals: "+ keyLimePies + " pies and " + lemons + " lemons");
    }
    
    public static void lemonTime(int order){
        System.out.println("Successfully purchased "+ order+" lemons");
        lemons+=order;
        System.out.println("Order totals: " + keyLimePies + " pies and " + lemons + " lemons");
    }
    
    
    
}
