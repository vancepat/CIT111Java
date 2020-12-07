/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;
/**
 *
 * @author Pat
 */
public class IfControl {
    
    
    public static void main(String[] args){
        
        final double PURCHASE_LIMIT = 200.00;
        double purchaseAmount;
        
        Scanner userInputScanner = new Scanner(System.in);
        
        System.out.println("Enter the amount of the purchase without dollar sign and press enter:");
        purchaseAmount = userInputScanner.nextDouble();
        
        if(purchaseAmount > PURCHASE_LIMIT){
            System.out.println("Too expensive, go buy ramen");
        } else{
            System.out.println("Okay, you can purchase this item for: $" + purchaseAmount);
            
        }
             
    }
    
    
}
