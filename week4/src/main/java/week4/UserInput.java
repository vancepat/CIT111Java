package week4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Pat
 */
public class UserInput {
    public static void main(String[] args){
     final double SALES_TAX=.07;
     double salePrice;
     double priceWithTax;
     
     Scanner userInputScanner = new Scanner(System.in);
     
     System.out.println("Enter the sale price (no $) and press enter: ");
    
     salePrice = userInputScanner.nextDouble();
     priceWithTax = salePrice * (1 + SALES_TAX);
     
     System.out.println("Your item price +7% tax: $"+ priceWithTax);
          
        
    }
    }

