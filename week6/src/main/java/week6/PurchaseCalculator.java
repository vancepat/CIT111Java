/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;
import java.util.Scanner;
/**
 *
 * @author Pat
 */
public class PurchaseCalculator {
    
    public static void main(String[] args){
        final double ITEM_PRICE = 100.00;
        double discount = .15;
         double limit;
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter your purchase limit:");
         limit = scan.nextDouble();
                System.out.println("Hard-coded price, " + ITEM_PRICE);
                displayPriceWithTax(ITEM_PRICE);
                computePriceAfterDiscount(ITEM_PRICE, discount);
                displayPurchasableNumber(ITEM_PRICE, limit);
    }
            
    
    
    public static void displayPriceWithTax(double price){
        final double TAX_RATE = 0.075;
        double totalPrice = price * (1+TAX_RATE);
        System.out.println("Total price with tax: $" + totalPrice);
    }
    
    public static void computePriceAfterDiscount(double price, double discount){
        double finalPrice = price - (price*discount);
        System.out.println("Price after discount, " + finalPrice);
    }
    
    public static void displayPurchasableNumber(double price, double limit){
        int numPurchasable = (int)Math.floor(limit/price);
        System.out.println("The amount you can purchase is this manyyyyy " + numPurchasable);
    }
    
}
